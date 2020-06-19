package com.shaw.ediorderservices.helper;

import static com.shaw.mock.builder.MockBuilder.build;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.annotation.PostConstruct;

import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.shaw.ediorderservices.csws.Cart;
import com.shaw.ediorderservices.csws.CartLine;
import com.shaw.ediorderservices.csws.CustInfo;
import com.shaw.ediorderservices.csws.Order;
import com.shaw.ediorderservices.csws.OrderViewResponse;
import com.shaw.ediorderservices.hibernate.ServiceConfig;
import com.shaw.ediorderservices.persistance.db2.dao.EdiOrderHeaderRepository;
import com.shaw.ediorderservices.persistance.db2.dao.EdiReasonCodeRepository;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrdValidation;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderHeader;
import com.shaw.ediorderservices.persistance.db2.entity.EdiReasonCode;
import com.shaw.ediorderservices.persistance.db2.entity.EdiSplStoreXref;
import com.shaw.ediorderservices.persistance.db2.entity.SamplesInfo;
import com.shaw.ediorderservices.persistance.sqlserver.entity.EdiValidation;
import com.shaw.ediorderservices.persistance.sqlserver.entity.order.EdiOrder;
import com.shaw.ediorderservices.persistance.sqlserver.entity.order.OrderType;
import com.shaw.ediorderservices.service.EdiOrderBean;

@Transactional(propagation = Propagation.REQUIRED)
public abstract class MockTest {

	@Autowired
	protected EdiOrderBean ediOrderBean;

	@Autowired
	EdiOrderHeaderRepository ediOrderHeaderRepository;

	@Autowired
	EdiReasonCodeRepository ediReasonCodeRepository;
    
	@Autowired
	private ServiceConfig config;

//
//	@Autowired
//	protected static EdiOrderHeader legacyOrderBean;

	protected static final CustInfo custInfo = build(CustInfo.class);
	protected static final SamplesInfo samplesInfo = build(SamplesInfo.class);
	protected static final Order shawOrder = build(Order.class);
	protected static final EdiValidation ediValidation = build(EdiValidation.class);
	protected static final EdiValidation ediValidation2 = build(EdiValidation.class);
	protected static final EdiOrderHeader ediOrderHeader = MockHelper.buildEdiOrderHeader(OrderType.CARPET);

	protected static EdiOrder samplesEdiOrder = MockHelper.buildEdiOrder(OrderType.SAMPLES);
	protected static EdiOrder hsEdiOrder = MockHelper.buildEdiOrder(OrderType.HARDSURFACES);
	protected static EdiOrder cptEdiOrder = MockHelper.buildEdiOrder(OrderType.CARPET);
	protected static EdiOrder validOrder = MockHelper.buildEdiOrder(OrderType.SAMPLES);
	protected static EdiOrder invalidOrder = MockHelper.buildEdiOrder(OrderType.SAMPLES);
	protected static EdiOrder invalidOrder2 = MockHelper.buildEdiOrder(OrderType.SAMPLES);
	protected static Cart cart = build(Cart.class);
	protected static HashMap<String, String> validationMap = new HashMap<String,String>();
	protected static EdiOrdValidation ediOrdValidation = build(EdiOrdValidation.class);
	protected static OrderViewResponse orderView = build(OrderViewResponse.class);
	protected static List<EdiSplStoreXref> xrefList = new ArrayList<EdiSplStoreXref>();
	
	static {
		hsEdiOrder.setOrderType(OrderType.HARDSURFACES.toString());
		samplesEdiOrder.setOrderType(OrderType.SAMPLES.toString());
		cart.addLine(build(CartLine.class));
		validationMap.put("out_err_code","");
		ediOrdValidation.setEdiReasonCode(build(EdiReasonCode.class));
		validOrder.addValidation(new EdiValidation("ACCEPTED", "ACCEPTED"));
		validOrder.setOrderType(OrderType.SAMPLES.toString());
		invalidOrder.addValidation(ediValidation);
		invalidOrder2.setValidations(Lists.newArrayList(ediValidation,ediValidation2));
		invalidOrder2.getLines().get(0).setValidations(Lists.newArrayList(ediValidation,ediValidation2));
//		orderHeaderView.setCarrierCode(orderView.getHeader().getCarrierCode().substring(0,2));
		xrefList.add(build(EdiSplStoreXref.class));
		xrefList.add(build(EdiSplStoreXref.class));
		xrefList.add(build(EdiSplStoreXref.class));
	}

	@PostConstruct
	private void setUpDB()
	{
		if (config.getDatabaseRegion().equals("embedded"))
		{
			EdiOrderHeader saveHeader = MockHelper.buildEdiOrderHeader(OrderType.SAMPLES);
			ediOrderHeaderRepository.save(saveHeader);
			
			saveHeader = MockHelper.buildEdiOrderHeader(OrderType.HARDSURFACES);
			ediOrderHeaderRepository.save(saveHeader);
			
			EdiReasonCode reasonCode = build(EdiReasonCode.class);
			reasonCode.setEdiReasonCode(63);
			ediReasonCodeRepository.save(reasonCode);
		
		}
	}
}
