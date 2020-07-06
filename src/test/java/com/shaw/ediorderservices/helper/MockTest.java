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

    @Autowired
    private static ApplicationContext ctx;
	
//
//	@Autowired
//	protected static EdiOrderHeader legacyOrderBean;

	protected static MockBuilder mockBuilder;
	protected static MockHelper mockHelper;

	protected static CustInfo custInfo;
	protected static SamplesInfo samplesInfo;
	protected static Order shawOrder;
	protected static EdiValidation ediValidation;
	protected static EdiValidation ediValidation2;
	protected static EdiOrderHeader samplesOrderHeader;
	protected static EdiOrderHeader cptOrderHeader;
	protected static EdiOrderHeader hsOrderHeader;
	protected static Cart cart;
	protected static EdiOrdValidation ediOrdValidation;
	protected static OrderViewResponse orderView;

	protected static EdiOrder samplesEdiOrder;
	protected static EdiOrder hsEdiOrder;
	protected static EdiOrder cptEdiOrder;
	protected static EdiOrder validOrder;
	protected static EdiOrder invalidOrder;
	protected static EdiOrder invalidOrder2;
	protected static HashMap<String, String> validationMap = new HashMap<String,String>();
	protected static List<EdiSplStoreXref> xrefList = new ArrayList<EdiSplStoreXref>();

	
	static {
//		cart.addLine(mockBuilder.build(CartLine.class));
		validationMap.put("out_err_code","");
//		ediOrdValidation.setEdiReasonCode(mockBuilder.build(EdiReasonCode.class));
//		orderHeaderView.setCarrierCode(orderView.getHeader().getCarrierCode().substring(0,2));
//		xrefList.add(mockBuilder.build(EdiSplStoreXref.class));
//		xrefList.add(mockBuilder.build(EdiSplStoreXref.class));
//		xrefList.add(mockBuilder.build(EdiSplStoreXref.class));
//	    context = new AnnotationConfigApplicationContext(AppConfig.class);
		mockBuilder = new MockBuilder();
		mockHelper = new MockHelper();

		samplesEdiOrder = mockHelper.buildEdiOrder(OrderType.SAMPLES);
		hsEdiOrder = mockHelper.buildEdiOrder(OrderType.HARDSURFACES);
		cptEdiOrder = mockHelper.buildEdiOrder(OrderType.CARPET);
		validOrder = mockHelper.buildEdiOrder(OrderType.SAMPLES);
		invalidOrder = mockHelper.buildEdiOrder(OrderType.SAMPLES);
		invalidOrder2 = mockHelper.buildEdiOrder(OrderType.SAMPLES);

		samplesOrderHeader = mockHelper.buildEdiOrderHeader(OrderType.SAMPLES);
		cptOrderHeader = mockHelper.buildEdiOrderHeader(OrderType.CARPET);
		hsOrderHeader = mockHelper.buildEdiOrderHeader(OrderType.HARDSURFACES);
		custInfo = mockBuilder.build(CustInfo.class);
		samplesInfo = mockBuilder.build(SamplesInfo.class);
		shawOrder = mockBuilder.build(Order.class);
		ediValidation = mockBuilder.build(EdiValidation.class);
		ediValidation2 = mockBuilder.build(EdiValidation.class);
		cart = mockBuilder.build(Cart.class);
		ediOrdValidation = mockBuilder.build(EdiOrdValidation.class);
		orderView = mockBuilder.build(OrderViewResponse.class);

		validOrder.addValidation(new EdiValidation("ACCEPTED", "ACCEPTED"));
		validOrder.setOrderType(OrderType.SAMPLES.toString());
		invalidOrder.addValidation(ediValidation);
		invalidOrder2.setValidations(Lists.newArrayList(ediValidation,ediValidation2));
		invalidOrder2.getLines().get(0).setValidations(Lists.newArrayList(ediValidation,ediValidation2));
	}

	@PostConstruct
	private void setUpDB()
	{

		if (config.getDatabaseRegion().equals("embedded"))
		{
//			EdiOrderHeader saveHeader = mockHelper.buildEdiOrderHeader(OrderType.SAMPLES);
			ediOrderHeaderRepository.save(samplesOrderHeader);
			
			EdiOrderHeader saveHeader = mockHelper.buildEdiOrderHeader(OrderType.HARDSURFACES);
			ediOrderHeaderRepository.save(saveHeader);
			
			EdiReasonCode reasonCode = mockBuilder.build(EdiReasonCode.class);
			reasonCode.setEdiReasonCode(63);
			ediReasonCodeRepository.save(reasonCode);
		
		}
	}
}
