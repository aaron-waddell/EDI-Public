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
	protected static List<EdiOrderLine> samplesLines;
	protected static EdiOrderHeader cptOrderHeader;
	protected static EdiOrderHeader hsOrderHeader;

	protected static EdiOrder samplesEdiOrder;
	protected static EdiOrder unitsEdiOrder;
	protected static EdiOrder cptEdiOrder;
	protected static Cart cart;
	protected static HashMap<String, String> validationMap;
	protected static EdiOrdValidation ediOrdValidation;
	protected static OrderViewResponse orderView;
	protected static OrderHeader orderHeaderView;
	protected static EdiShipInfo ediShipInfo;
	protected static List<EdiSplStoreXref> xrefList;;

	static {
		mockBuilder = new MockBuilder();
		mockHelper = new MockHelper();
	}
	
	@BeforeEach
	private void createTestObjects()
	{
		samplesLines = new ArrayList<EdiOrderLine>();
		validationMap = new HashMap<String,String>();
		xrefList = new ArrayList<EdiSplStoreXref>();
		custInfo = mockBuilder.build(CustInfo.class);
		samplesInfo = mockBuilder.build(SamplesInfo.class);
		shawOrder = mockBuilder.build(Order.class);
		ediValidation = mockBuilder.build(EdiValidation.class);
		ediValidation2 = mockBuilder.build(EdiValidation.class);
		ediOrderHeader = mockHelper.buildEdiOrderHeader(OrderType.CARPET);
		samplesOrderHeader = mockHelper.buildEdiOrderHeader(OrderType.SAMPLES);
		cptOrderHeader = mockHelper.buildEdiOrderHeader(OrderType.CARPET);
		hsOrderHeader = mockHelper.buildEdiOrderHeader(OrderType.UNITS);		

		samplesEdiOrder = mockHelper.buildEdiOrder(OrderType.SAMPLES);
		samplesLines.add(mockBuilder.build(EdiOrderLine.class));
		samplesLines.add(mockBuilder.build(EdiOrderLine.class));
		unitsEdiOrder = mockHelper.buildEdiOrder(OrderType.UNITS);
		cptEdiOrder = mockHelper.buildEdiOrder(OrderType.CARPET);
		cart = mockBuilder.build(Cart.class);
		validationMap = new HashMap<String,String>();
		ediOrdValidation = mockBuilder.build(EdiOrdValidation.class);
		orderHeaderView = mockBuilder.build(OrderHeader.class);
		ediShipInfo = mockBuilder.build(EdiShipInfo.class);

		unitsEdiOrder.setOrderType(OrderType.UNITS.toString());
		samplesEdiOrder.setOrderType(OrderType.SAMPLES.toString());
		cart.addLine(mockBuilder.build(CartLine.class));
		validationMap.put("out_err_code","");
		ediOrdValidation.setEdiReasonCode(mockBuilder.build(EdiReasonCode.class));

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
			
			saveHeader = mockHelper.buildEdiOrderHeader(OrderType.UNITS);
			ediOrderHeaderRepository.save(saveHeader);
			
			EdiReasonCode reasonCode = mockBuilder.build(EdiReasonCode.class);
			reasonCode.setEdiReasonCode(63);
			ediReasonCodeRepository.save(reasonCode);
		
		}
	}
}
