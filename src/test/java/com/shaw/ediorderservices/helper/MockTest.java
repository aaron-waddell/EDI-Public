package com.shaw.ediorderservices.helper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.shaw.ediorderservices.ServiceConfig;
import com.shaw.ediorderservices.csws.Cart;
import com.shaw.ediorderservices.csws.CartLine;
import com.shaw.ediorderservices.csws.CustInfo;
import com.shaw.ediorderservices.csws.Order;
import com.shaw.ediorderservices.csws.OrderHeader;
import com.shaw.ediorderservices.csws.OrderViewResponse;
import com.shaw.ediorderservices.persistance.db2.dao.EdiOrderHeaderRepository;
import com.shaw.ediorderservices.persistance.db2.dao.EdiReasonCodeRepository;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrdValidation;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderHeader;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderLine;
import com.shaw.ediorderservices.persistance.db2.entity.EdiReasonCode;
import com.shaw.ediorderservices.persistance.db2.entity.EdiShipInfo;
import com.shaw.ediorderservices.persistance.db2.entity.EdiSplStoreXref;
import com.shaw.ediorderservices.persistance.db2.entity.SamplesInfo;
import com.shaw.ediorderservices.persistance.sqlserver.entity.EdiValidation;
import com.shaw.ediorderservices.persistance.sqlserver.entity.order.EdiOrder;
import com.shaw.ediorderservices.persistance.sqlserver.entity.order.OrderType;
import com.shaw.ediorderservices.service.EdiOrderBean;
import com.shaw.mock.builder.MockBuilder;

@Transactional(propagation = Propagation.REQUIRED)
public abstract class MockTest {

    protected static final Logger logger = LogManager.getLogger();

	@Autowired
	protected EdiOrderBean ediOrderBean;

	@Autowired
	EdiOrderHeaderRepository ediOrderHeaderRepository;

	@Autowired
	EdiReasonCodeRepository ediReasonCodeRepository;
    
	@Autowired
	private ServiceConfig config;

	protected static MockBuilder mockBuilder;
	protected static MockHelper mockHelper;

//
//	@Autowired
//	protected static EdiOrderHeader legacyOrderBean;

	protected static CustInfo custInfo;
	protected static SamplesInfo samplesInfo;
	protected static Order shawOrder;
	protected static EdiValidation ediValidation;
	protected static EdiValidation ediValidation2;
	protected static EdiOrderHeader ediOrderHeader;
	protected static EdiOrderHeader samplesOrderHeader;
	protected static List<EdiOrderLine> samplesLines = new ArrayList<EdiOrderLine>();
	protected static EdiOrderHeader cptOrderHeader;
	protected static EdiOrderHeader hsOrderHeader;

	protected static EdiOrder samplesEdiOrder;
	protected static EdiOrder hsEdiOrder;
	protected static EdiOrder cptEdiOrder;
	protected static EdiOrder validOrder;
	protected static EdiOrder invalidOrder;
	protected static EdiOrder invalidOrder2;
	protected static Cart cart;
	protected static HashMap<String, String> validationMap = new HashMap<String,String>();
	protected static EdiOrdValidation ediOrdValidation;
	protected static OrderViewResponse orderView;
	protected static OrderHeader orderHeaderView;
	protected static EdiShipInfo ediShipInfo;
	protected static List<EdiSplStoreXref> xrefList = new ArrayList<EdiSplStoreXref>();

	static {
		mockBuilder = new MockBuilder();
		mockHelper = new MockHelper();
	}
	
	@BeforeEach
	private void createTestObjects()
	{
		custInfo = mockBuilder.build(CustInfo.class);
		samplesInfo = mockBuilder.build(SamplesInfo.class);
		shawOrder = mockBuilder.build(Order.class);
		ediValidation = mockBuilder.build(EdiValidation.class);
		ediValidation2 = mockBuilder.build(EdiValidation.class);
		ediOrderHeader = mockHelper.buildEdiOrderHeader(OrderType.CARPET);
		samplesOrderHeader = mockHelper.buildEdiOrderHeader(OrderType.SAMPLES);
		cptOrderHeader = mockHelper.buildEdiOrderHeader(OrderType.CARPET);
		hsOrderHeader = mockHelper.buildEdiOrderHeader(OrderType.HARDSURFACES);		

		samplesEdiOrder = mockHelper.buildEdiOrder(OrderType.SAMPLES);
		samplesLines.add(mockBuilder.build(EdiOrderLine.class));
		samplesLines.add(mockBuilder.build(EdiOrderLine.class));
		hsEdiOrder = mockHelper.buildEdiOrder(OrderType.HARDSURFACES);
		cptEdiOrder = mockHelper.buildEdiOrder(OrderType.CARPET);
		validOrder = mockHelper.buildEdiOrder(OrderType.SAMPLES);
		invalidOrder = mockHelper.buildEdiOrder(OrderType.SAMPLES);
		invalidOrder2 = mockHelper.buildEdiOrder(OrderType.SAMPLES);
		cart = mockBuilder.build(Cart.class);
		validationMap = new HashMap<String,String>();
		ediOrdValidation = mockBuilder.build(EdiOrdValidation.class);
		orderHeaderView = mockBuilder.build(OrderHeader.class);
		ediShipInfo = mockBuilder.build(EdiShipInfo.class);

		hsEdiOrder.setOrderType(OrderType.HARDSURFACES.toString());
		samplesEdiOrder.setOrderType(OrderType.SAMPLES.toString());
		cart.addLine(mockBuilder.build(CartLine.class));
		validationMap.put("out_err_code","");
		ediOrdValidation.setEdiReasonCode(mockBuilder.build(EdiReasonCode.class));
		validOrder.addValidation(new EdiValidation("ACCEPTED", "ACCEPTED"));
		validOrder.setOrderType(OrderType.SAMPLES.toString());
		invalidOrder.addValidation(ediValidation);
		invalidOrder2.setValidations(Lists.newArrayList(ediValidation,ediValidation2));
		invalidOrder2.getLines().get(0).setValidations(Lists.newArrayList(ediValidation,ediValidation2));

		xrefList.add(mockBuilder.build(EdiSplStoreXref.class));
		xrefList.add(mockBuilder.build(EdiSplStoreXref.class));
		xrefList.add(mockBuilder.build(EdiSplStoreXref.class));
		orderView = mockBuilder.build(OrderViewResponse.class);

		//		orderHeaderView.setDeliveryDate(mockBuilder.randomDate().toString());
	}

	@PostConstruct
	private void setUpDB()
	{
		logger.info("setup");
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
