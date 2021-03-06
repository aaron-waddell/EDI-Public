package com.shaw.ediorderservices.service.csws;

import static com.shaw.ediorderservices.gson.MyGson.gson;

import java.net.URI;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriTemplate;

import com.shaw.ediorderservices.csws.Cart;
import com.shaw.ediorderservices.csws.CartLine;
import com.shaw.ediorderservices.csws.CartRequest;
import com.shaw.ediorderservices.csws.CustInfo;
import com.shaw.ediorderservices.csws.Order;
import com.shaw.ediorderservices.csws.OrderViewResponse;
import com.shaw.ediorderservices.csws.ProcessCartRequest;
import com.shaw.ediorderservices.csws.ShipInfo;
import com.shaw.ediorderservices.exception.ResourceNotFoundException;
import com.shaw.ediorderservices.ServiceConfig;
import com.shaw.ediorderservices.mapping.LineMapper;
import com.shaw.ediorderservices.mapping.OrderMapper;
import com.shaw.ediorderservices.persistance.sqlserver.entity.order.EdiOrder;
import com.shaw.ediorderservices.service.EdiOrderBean;
import com.shaw.ediorderservices.service.order.SamplesOrderService;
import com.shaw.ediorderservices.service.rest.RestService;

@Service
public abstract class CSWSService implements ICSWSService {

	protected final static Logger logger = LoggerFactory.getLogger(SamplesOrderService.class);

	public static final DateTimeFormatter USA_FORMAT = DateTimeFormatter.ofPattern("MM/dd/yyyy");

	@Autowired
	protected EdiOrderBean ediOrderBean;

    @Autowired
	protected ServiceConfig config;
	
	@Autowired
	protected OrderMapper orderMapper;

	@Autowired
	protected LineMapper lineMapper;

    @Autowired
	protected RestService restService;

	@Override
	public Cart createCart() {
		// TODO Auto-generated method stub
		CartRequest req = createCartRequest();
		logger.info(gson.toJson(req));

		UriTemplate template = new UriTemplate(config.getCswsServername() + "/carts/{cartNbr}") ;
		URI uri = template.expand(0);

		String response = restService.putForObject(uri,req);

		Cart cart = gson.fromJson(response, Cart.class);
		logger.info(gson.toJson(cart));
		return cart;
	}

	@Override
	public Order place() {
//		String custNbr = ediOrder.getShipCustNbr();
		// TODO Auto-generated method stub
		Cart cart = createCart();
		return convert(cart);
	}

	protected abstract CartRequest createCartRequest();

	public Order convert(Cart cart) {

		ProcessCartRequest req = new ProcessCartRequest();
		EdiOrder ediOrder = ediOrderBean.getEdiOrder();
		String custNbr = ediOrder.getCustomerNumber();
		req.setCustNbr(custNbr);
		req.setPoNbr(ediOrder.getPoNumber());
		//		req.setOverrideDupPo(form.getDupPoFlag().trim());
		CustInfo custInfo = getCustomerInfo(custNbr);
		ShipInfo shipInfo = orderMapper.ediOrderAndCustInfoToShipInfo(ediOrder, custInfo);
//		ShipInfo shipInfo = getShipInfo(ediOrderBean.getEdiOrder().getCustNbr());
		// Fix residential flag so the field on ORDER_HEADER_EXT table is only set if
		// the user checked the checkbox
		req.setShipInfo(shipInfo);
		req.setRoleFlag("");
//		ArrayList<String> order = null;
		ArrayList<String> orders = (ArrayList<String>) cart.getLines().stream().map(CartLine::getLineNbr).collect(Collectors.toList());
		req.getGroups().addAll(orders);

		UriTemplate template = new UriTemplate(config.getCswsServername() + "/carts/{cartNbr}") ;
		URI uri = template.expand(cart.getCartNbr());
		String response = restService.postForObject(uri,req);
		logger.info(response);
		Order order = gson.fromJson(response, Order.class);
		logger.info(gson.toJson(order));
		return order;
	}
	
	ShipInfo buildShipInfo(CustInfo custInfo) {
		ShipInfo shipInfo = new ShipInfo();
//		ediOrderBean.getEdiOrder()Header header = ediOrderBean.getEdiOrder().getLegacyOrderHeader();
		String shipCountry = ediOrderBean.getEdiOrder().getShipToAddress().getCountry();
		String shipZip = ediOrderBean.getEdiOrder().getShipToAddress().getZip();
//		shipInfo = ObjectUtils.cast(header, ShipInfo.class, FUZZY_CHECK);
		shipInfo = orderMapper.ediOrderAndCustInfoToShipInfo(ediOrderBean.getEdiOrder(), custInfo);
//		shipInfo.setShipCustNbr(ediOrder.getCustNbr());
		shipInfo.setShipCountry(shipCountry);
		shipInfo.setDestCountry(shipCountry);
		if (shipInfo.getDestCountry().equals("US"))
			shipInfo.setShipZip(shipZip.substring(0, Math.min(shipZip.length(),5)));
		return shipInfo;
	}
	public CustInfo getCustomerInfo(String custNbr) {
		logger.info("getting Customer Info for : " + custNbr);

		UriTemplate template = new UriTemplate(config.getCswsServername() + "/customers/{custNbr}") ;
		URI uri = template.expand(custNbr);

		String response = restService.postForObject(uri);
		logger.info(response);
		CustInfo custInfo = gson.fromJson(response, CustInfo.class);
		logger.info(gson.toJson(custInfo));
		return custInfo;
		
	}

	@Override
	public OrderViewResponse getOrderView(String orderNbr) throws ResourceNotFoundException {
		UriTemplate template = new UriTemplate(config.getCswsServername() + "/orders/{orderNbr}") ;
		URI uri = template.expand(orderNbr);

		String response = restService.getForObject(uri);

		OrderViewResponse view = gson.fromJson(response, OrderViewResponse.class);
		logger.info(gson.toJson(view));
		return view ;
	}

}
