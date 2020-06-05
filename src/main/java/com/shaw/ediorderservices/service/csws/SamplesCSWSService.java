package com.shaw.ediorderservices.service.csws;

import static com.shaw.ediorderservices.gson.MyGson.gson;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.util.UriTemplate;

import com.shaw.ediorderservices.csws.Cart;
import com.shaw.ediorderservices.csws.CartRequest;
import com.shaw.ediorderservices.csws.Order;
import com.shaw.ediorderservices.csws.SamplesLine;
import com.shaw.ediorderservices.persistance.db2.dao.SamplesInfoRepository;
import com.shaw.ediorderservices.persistance.db2.entity.SamplesInfo;
import com.shaw.ediorderservices.persistance.sqlserver.entity.line.EdiLine;
import com.shaw.ediorderservices.persistance.sqlserver.entity.order.EdiOrder;

@Service
@Transactional
@Qualifier("samplesCswsService")
public class SamplesCSWSService extends CSWSService {

	@Autowired
	SamplesInfoRepository samplesInfoRepository;

	public SamplesCSWSService() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Order place() {
//		String custNbr = ediOrder.getShipCustNbr();
		Cart cart = createCart();
		return convert(cart);
	}

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

	protected CartRequest createCartRequest() {
		CartRequest req = new CartRequest();
		req.setApplicationId("EDIS");
		req.setApplicationGuid(config.getAppGuid());
		req.setBusinessFunc("Add To Cart");
		req.setUserId("EDIS");
		req.setCartNbr("");
		req.setProductType("A");
		EdiOrder ediOrder = ediOrderBean.getEdiOrder();
		req.setCustNbr(ediOrder.getCustomerNumber());
		List<SamplesLine> samplesLines = ediOrder.getLines().stream()
				.map(l->getSamplesInfo(l))
				.map(lineMapper::samplesInfoToSamplesLine)
				.map(s->s.addShipDate(ediOrder.getShipDate().getDateValue().format(USA_FORMAT)))
				.collect(Collectors.toList());
		logger.info(samplesLines.toString());
		req.getSamplesLines().addAll(samplesLines);
		return req;
	}

//	public SamplesLine createSamplesLine(LocalDate shipDate) {
//		SamplesLine samplesLine = ObjectUtils.cast(samplesInfo, SamplesLine.class);
//		if (samplesInfo==null)
//			throw new RuntimeException("EdiLine.samplesInfo is null : " + this.toString());
//		logger.debug(samplesInfo.toString());
//		samplesLine.setGrade("A");
//		samplesLine.setLocation("01");
//		samplesLine.setStyleNbr(samplesInfo.getSamplesStyleNbr());
//		samplesLine.setColorNbr("");
//		samplesLine.setSamplesPrivateStyle(samplesInfo.getSamplesStyleNbr());
//		samplesLine.setSamplesSeqNbr("");
//		samplesLine.setTypesetDesc(samplesInfo.getDelVehName());
//		samplesLine.setSidemarkType1("S");
//		samplesLine.setSidemarkType2("S");
//		samplesLine.setGenericLabelFlag(true);
//		samplesLine.setUom("EA");
//		samplesLine.setUnitsPerSubset(1);
//		samplesLine.setWeightUom("LBS");
//		samplesLine.setShipDate(shipDate.format(OrderServiceImpl.USA_FORMAT));
//		logger.debug(samplesLine.toString());
////		samplesLine.setSamplesCustNbr(l.getCustNbr());
//		return samplesLine;
//	}

	SamplesInfo getSamplesInfo(EdiLine l) {
		logger.debug("In getSamplesInfo");
		return samplesInfoRepository.getSamplesInfo(l.getStyle()+l.getColor()).orElseThrow(()->new RuntimeException("get Samples Info Failed for " + l.getStyle()+l.getColor() ));
//		return null;
	}

//	@Override
//	public CartRequest createCartRequest() {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
