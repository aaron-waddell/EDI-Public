package com.shaw.ediorderservices.service.impl;

import java.net.URI;

import static com.shaw.ediorderservices.gson.myGson.gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.util.UriTemplate;

import com.shaw.ediorderservices.csws.Cart;
import com.shaw.ediorderservices.csws.OrderHeader;
import com.shaw.ediorderservices.exception.ResourceNotFoundException;
import com.shaw.ediorderservices.factory.EdiOrderFactory;
import com.shaw.ediorderservices.hibernate.ServiceConfig;
import com.shaw.ediorderservices.mapping.OrderMapper;
import com.shaw.ediorderservices.persistance.db2.dao.EdiOrderHeaderRepository;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderHeader;
import com.shaw.ediorderservices.persistance.sqlserver.dao.EdiOrderRepository;
import com.shaw.ediorderservices.persistance.sqlserver.entity.EdiOrder;
import com.shaw.ediorderservices.service.EdiOrderBean;
import com.shaw.ediorderservices.service.ILegacyOrderService;
import com.shaw.ediorderservices.service.common.AbstractService;

@Transactional(propagation = Propagation.REQUIRED)
@Service
public class LegacyOrderService extends AbstractService<EdiOrderHeader> implements ILegacyOrderService {

	@Autowired
	EdiOrderBean ediOrderBean;

	@Autowired
	EdiOrderHeaderRepository ediOrderHeaderRepository;

	@Autowired
	EdiOrderRepository ediOrderRepository;

	@Autowired
	OrderMapper mapper;

	@Autowired
	RestService restService;

	@Autowired
	private EdiOrderFactory ediOrderFactory;

    @Autowired
	protected ServiceConfig config;


	public LegacyOrderService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createLegacyOrder() {
		EdiOrderHeader legacyHeader = mapper.ediOrderToLegacy(ediOrderBean.getEdiOrder());//, poDate, cancelDate, shipDate);
		logger.debug(legacyHeader.toString());
		legacyHeader = ediOrderHeaderRepository.save(legacyHeader);
		ediOrderBean.setLegacyHeader(legacyHeader);
		EdiOrder ediOrder = ediOrderBean.getEdiOrder();
		ediOrder.setLegacyOrderNumber(legacyHeader.getLegacyOrderNumber());
		ediOrderRepository.save(ediOrder);
	}

	@Override
	public void convertLegacyOrder() {
		EdiOrderHeader h = ediOrderBean.getLegacyHeader();
//		EdiOrder ediOrder = ediOrderFactory.getInstance(h.getOrderType());
		EdiOrder ediOrder = ediOrderFactory.mapToEdiOrder(h);
//		EdiOrder ediOrder = mapper.legacyHeaderToEdiOrder(ediOrderBean.getLegacyHeader());
//		Arrays.asList(OrderType.values()).stream().filter(v->v.toString().startsWith(null))
		logger.debug(ediOrder.toString());	
		ediOrderRepository.save(ediOrder);
		ediOrderBean.setEdiOrder(ediOrder);
//		List<Validations> validations = ediOrder.getVailidations().parallelStream().map(d-> mapper.map(d, EdiDate.class));
	}

//	EdiOrderHeader saveHeader(EdiOrderHeader h)
//	{
//		EdiOrderHeader result = ediOrderHeaderRepository.save(h);
//		logger.debug(result.toString());
//		return result;
//	}
	
	@Override
	public void getOrder(long ediOrderNbr) throws ResourceNotFoundException {
//		Supplier<ResourceNotFoundException> s = ResourceNotFoundException::new;
		// TODO Auto-generated method stub
		EdiOrderHeader legacyHeader = ediOrderHeaderRepository.getHeader(ediOrderNbr);
//		legacyHeader = ediOrderHeaderRepository.getHeaderLines(ediOrderNbr).orElseThrow(()->new ResourceNotFoundException("legacy header"));
		ediOrderBean.setLegacyHeader(legacyHeader);
	}

	@Override
	public OrderHeader getOrderView(String orderNbr) throws ResourceNotFoundException {
		UriTemplate template = new UriTemplate(config.getCswsServername() + "/orders/{orderNbr}") ;
		URI uri = template.expand(orderNbr);

		String response = restService.getForObject(uri);

		OrderHeader orderHeader = gson.fromJson(response, OrderHeader.class);
		logger.info(gson.toJson(orderHeader));
		return orderHeader ;
	}

	@Override
	protected PagingAndSortingRepository<EdiOrderHeader, Long> getDao() {
		// TODO Auto-generated method stub
		return ediOrderHeaderRepository;
	}

}
