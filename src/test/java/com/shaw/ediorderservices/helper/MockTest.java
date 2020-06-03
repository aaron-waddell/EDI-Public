package com.shaw.ediorderservices.helper;

import java.util.HashMap;

import javax.annotation.PostConstruct;

import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.shaw.ediorderservices.csws.Cart;
import com.shaw.ediorderservices.csws.CartLine;
import com.shaw.ediorderservices.csws.CustInfo;
import com.shaw.ediorderservices.csws.Order;
import com.shaw.ediorderservices.enums.OrderType;
import com.shaw.ediorderservices.hibernate.ServiceConfig;
import com.shaw.ediorderservices.persistance.db2.dao.EdiOrderHeaderRepository;
import com.shaw.ediorderservices.persistance.db2.dao.EdiReasonCodeRepository;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrdValidation;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderHeader;
import com.shaw.ediorderservices.persistance.db2.entity.EdiReasonCode;
import com.shaw.ediorderservices.persistance.db2.entity.SamplesInfo;
import com.shaw.ediorderservices.persistance.sqlserver.entity.EdiOrder;
import com.shaw.ediorderservices.persistance.sqlserver.entity.EdiValidation;
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

	protected static final CustInfo custInfo = MockObject.build(CustInfo.class);
	protected static final SamplesInfo samplesInfo = MockObject.build(SamplesInfo.class);
	protected static final Order shawOrder = MockObject.build(Order.class);
	protected static final EdiValidation ediValidation = MockObject.build(EdiValidation.class);
	protected static final EdiValidation ediValidation2 = MockObject.build(EdiValidation.class);
	protected static final EdiOrderHeader ediOrderHeader = MockObject.buildEdiOrderHeader(OrderType.CARPET);

	protected static EdiOrder samplesEdiOrder = MockObject.buildEdiOrder(OrderType.SAMPLES);
	protected static EdiOrder hsEdiOrder = MockObject.buildEdiOrder(OrderType.HARDSURFACES);
	protected static EdiOrder cptEdiOrder = MockObject.buildEdiOrder(OrderType.CARPET);
	protected static EdiOrder validOrder = MockObject.buildEdiOrder(OrderType.SAMPLES);
	protected static EdiOrder invalidOrder = MockObject.buildEdiOrder(OrderType.SAMPLES);
	protected static EdiOrder invalidOrder2 = MockObject.buildEdiOrder(OrderType.SAMPLES);
	protected static Cart cart = MockObject.build(Cart.class);
	protected static HashMap<String, String> validationMap = new HashMap<String,String>();
	protected static EdiOrdValidation ediOrdValidation = MockObject.build(EdiOrdValidation.class);

	
	static {
		hsEdiOrder.setOrderType(OrderType.HARDSURFACES.toString());
		samplesEdiOrder.setOrderType(OrderType.SAMPLES.toString());
		cart.addLine(MockObject.build(CartLine.class));
		validationMap.put("out_err_code","");
		ediOrdValidation.setEdiReasonCode(MockObject.build(EdiReasonCode.class));
		validOrder.addValidation(new EdiValidation("ACCEPTED", "ACCEPTED"));
		validOrder.setOrderType(OrderType.SAMPLES.toString());
		invalidOrder.addValidation(ediValidation);
		invalidOrder2.setValidations(Lists.newArrayList(ediValidation,ediValidation2));
		invalidOrder2.getLines().get(0).setValidations(Lists.newArrayList(ediValidation,ediValidation2));

	}

	@PostConstruct
	private void setUpDB()
	{
		if (config.getDb2DdlAuto().equals("update"))
		{
			EdiOrderHeader saveHeader = MockObject.buildEdiOrderHeader(OrderType.SAMPLES);
			ediOrderHeaderRepository.save(saveHeader);
			
			saveHeader = MockObject.buildEdiOrderHeader(OrderType.HARDSURFACES);
			ediOrderHeaderRepository.save(saveHeader);
			
			EdiReasonCode reasonCode = MockObject.build(EdiReasonCode.class);
			reasonCode.setEdiReasonCode(63);
			ediReasonCodeRepository.save(reasonCode);
		
		}
	}
}
