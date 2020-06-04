package com.shaw.ediorderservices.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.apache.commons.lang3.SerializationUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.shaw.ediorderservices.helper.MockTest;
import com.shaw.ediorderservices.persistance.db2.dao.EdiOrdValidationRepository;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrdValidation;
import com.shaw.ediorderservices.persistance.db2.entity.EdiReasonCode;
import com.shaw.ediorderservices.persistance.sqlserver.entity.EdiOrder;
import com.shaw.ediorderservices.service.IValidationService;

@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
@ExtendWith(SpringExtension.class)
class SamplesValidationServiceTest extends MockTest {

	final static Logger logger = LoggerFactory.getLogger(SamplesValidationServiceTest.class);

	@Autowired
	@Qualifier("samplesValidationService")
	IValidationService service;	

	@MockBean
	EdiOrdValidationRepository ediOrdValidationRepository;

	@MockBean
	LegacyOrderService legacyService;
	
	@Test
	final void testValidate() {
		ediOrderBean.setEdiOrder(samplesEdiOrder);
		service.validate();
		EdiOrder ediOrder = ediOrderBean.getEdiOrder();
		assertNotNull(ediOrder);
		logger.info(ediOrder.toString());
		assertNotNull(ediOrder.getValidations());
		assertNotEquals(0,ediOrder.getValidations().size());
	}

	@Test
	void testFillPreorder() {
		ediOrderBean.setEdiOrder(samplesEdiOrder);
		when(ediOrdValidationRepository.preorderUpdate(samplesEdiOrder.getLegacyOrderNumber())).thenReturn(validationMap);
//		when(legacyService.getOrder(samplesEdiOrder.getLegacyId())).thenReturn(samplesEdiOrder);
		service.fillPreorder();
		verify(ediOrdValidationRepository).preorderUpdate(samplesEdiOrder.getLegacyOrderNumber());
		verify(legacyService).getOrder(samplesEdiOrder.getLegacyOrderNumber());
		assertNotNull(ediOrderBean);
		logger.info(ediOrderBean.toString());
	}

	@Test
	void testProcessHeaderRule() {
		EdiReasonCode reasonCode = new EdiReasonCode();
		reasonCode.setDescription("MISSING ADDRESS");
		reasonCode.setDefaultAction("E");
		
		EdiOrder badOrder = SerializationUtils.clone(samplesEdiOrder);
		badOrder.getShipToAddress().setAddressLine1("");
		badOrder.getShipToAddress().setCity("");
		badOrder.getShipToAddress().setZip("");
		ediOrderBean.setEdiOrder(badOrder);
		EdiOrdValidation result = service.processHeaderRule(reasonCode);
		assertNotNull(result);
		logger.info(result.toString());
		assertEquals("MISSING ADDRESS",result.getEdiReasonCode().getDescription());
	}


}
