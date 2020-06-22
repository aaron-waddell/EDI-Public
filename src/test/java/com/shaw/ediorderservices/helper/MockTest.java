package com.shaw.ediorderservices.helper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.annotation.PostConstruct;

import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.shaw.ediorderservices.AppConfig;
import com.shaw.ediorderservices.csws.Cart;
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
import com.shaw.mock.builder.MockBuilder;

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

	private static MockBuilder mockBuilder;
	private static MockHelper mockHelper = new MockHelper();

	protected final CustInfo custInfo = mockBuilder.build(CustInfo.class);
	protected final SamplesInfo samplesInfo = mockBuilder.build(SamplesInfo.class);
	protected final Order shawOrder = mockBuilder.build(Order.class);
	protected final EdiValidation ediValidation = mockBuilder.build(EdiValidation.class);
	protected final EdiValidation ediValidation2 = mockBuilder.build(EdiValidation.class);
	protected final static EdiOrderHeader ediOrderHeader = mockHelper.buildEdiOrderHeader(OrderType.CARPET);

	protected static EdiOrder samplesEdiOrder = mockHelper.buildEdiOrder(OrderType.SAMPLES);
	protected static EdiOrder hsEdiOrder = mockHelper.buildEdiOrder(OrderType.HARDSURFACES);
	protected static EdiOrder cptEdiOrder = mockHelper.buildEdiOrder(OrderType.CARPET);
	protected static EdiOrder validOrder = mockHelper.buildEdiOrder(OrderType.SAMPLES);
	protected static EdiOrder invalidOrder = mockHelper.buildEdiOrder(OrderType.SAMPLES);

	protected static EdiOrder invalidOrder2 = mockHelper.buildEdiOrder(OrderType.SAMPLES);
	protected Cart cart = mockBuilder.build(Cart.class);
	protected static HashMap<String, String> validationMap = new HashMap<String,String>();
	protected EdiOrdValidation ediOrdValidation = mockBuilder.build(EdiOrdValidation.class);
	protected OrderViewResponse orderView = mockBuilder.build(OrderViewResponse.class);
	protected static List<EdiSplStoreXref> xrefList = new ArrayList<EdiSplStoreXref>();
	
	static {
		hsEdiOrder.setOrderType(OrderType.HARDSURFACES.toString());
		samplesEdiOrder.setOrderType(OrderType.SAMPLES.toString());
//		cart.addLine(mockBuilder.build(CartLine.class));
		validationMap.put("out_err_code","");
//		ediOrdValidation.setEdiReasonCode(mockBuilder.build(EdiReasonCode.class));
//		orderHeaderView.setCarrierCode(orderView.getHeader().getCarrierCode().substring(0,2));
//		xrefList.add(mockBuilder.build(EdiSplStoreXref.class));
//		xrefList.add(mockBuilder.build(EdiSplStoreXref.class));
//		xrefList.add(mockBuilder.build(EdiSplStoreXref.class));
	    ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		mockBuilder = new MockBuilder(context);
	}

	@PostConstruct
	private void setUp()
	{
		validOrder.addValidation(new EdiValidation("ACCEPTED", "ACCEPTED"));
		validOrder.setOrderType(OrderType.SAMPLES.toString());
		invalidOrder.addValidation(ediValidation);
		invalidOrder2.setValidations(Lists.newArrayList(ediValidation,ediValidation2));
		invalidOrder2.getLines().get(0).setValidations(Lists.newArrayList(ediValidation,ediValidation2));

		if (config.getDatabaseRegion().equals("embedded"))
		{
			EdiOrderHeader saveHeader = mockHelper.buildEdiOrderHeader(OrderType.SAMPLES);
			ediOrderHeaderRepository.save(saveHeader);
			
			saveHeader = mockHelper.buildEdiOrderHeader(OrderType.HARDSURFACES);
			ediOrderHeaderRepository.save(saveHeader);
			
			EdiReasonCode reasonCode = mockBuilder.build(EdiReasonCode.class);
			reasonCode.setEdiReasonCode(63);
			ediReasonCodeRepository.save(reasonCode);
		
		}
	}
}
