package com.shaw.ediorderservices.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.shaw.ediorderservices.helper.MockTest;
import com.shaw.ediorderservices.persistance.db2.dao.EdiOrdValidationRepository;
import com.shaw.ediorderservices.persistance.db2.dao.EdiOrderHeaderRepository;
import com.shaw.ediorderservices.service.IValidationService;

@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
class HardsurfacesValidationServiceTest extends MockTest {

	final static Logger logger = LoggerFactory.getLogger(HardsurfacesValidationServiceTest.class);

//	private Answer<?> answer = i->{ediOrderBean.setEdiOrder(invalidOrder2);return null;};

	@Autowired
	@Qualifier("hardsurfacesValidationService")
	IValidationService service;

	@MockBean
	private EdiOrdValidationRepository ediOrdValidationRepository;

	@MockBean
	private EdiOrderHeaderRepository ediOrderHeaderRepository;

	@MockBean
	LegacyOrderService legacyService;

	@Test
	final void testValidate() {
		ediOrderBean.setEdiOrder(hsEdiOrder);
		when(ediOrdValidationRepository.validateEdiOrder(hsEdiOrder.getLegacyId(), "1")).thenReturn(validationMap);
//		when(ediOrderHeaderRepository.findById(testEdiOrder.getLegacyId())).thenReturn(Optional.of(ediOrderHeader));
//		doAnswer(i->{ediOrderBean.setEdiOrder(invalidOrder2);return null;}).when(legacyService).getOrder(testEdiOrder.getLegacyId());
		doAnswer(i->{ediOrderBean.setEdiOrder(invalidOrder2);return null;}).when(legacyService).convertLegacyOrder();
		service.validate();
		verify(ediOrdValidationRepository).validateEdiOrder(hsEdiOrder.getLegacyId(), "1");
//		verify(ediOrderHeaderRepository).findById(testEdiOrder.getLegacyId());
		verify(legacyService).getOrder(hsEdiOrder.getLegacyId());
		verify(legacyService).convertLegacyOrder();
		logger.info(ediOrderBean.getEdiOrder().toString());
		assertNotNull(ediOrderBean.getEdiOrder().getValidations());
		logger.info(ediOrderBean.getEdiOrder().getValidations().toString());
		assertNotNull(ediOrderBean.getEdiOrder().getValidations().get(0).getEdiOrder());
		logger.info(ediOrderBean.getEdiOrder().getValidations().toString());
		assertNotEquals(0,ediOrderBean.getEdiOrder().getValidations().size());
//		assertEquals(ediOrdValidation.getEdiReasonCode().getDescription(),ediOrderBean.getEdiOrder().getValidations().get(0).getDescription());
	}

	@Test
	final void testFillPreorder() {
		ediOrderBean.setEdiOrder(hsEdiOrder);
		when(ediOrdValidationRepository.preorderUpdate(hsEdiOrder.getLegacyId())).thenReturn(validationMap);
//		when(legacyService.getOrder(testEdiOrder.getLegacyId())).thenReturn(testEdiOrder);
		service.fillPreorder();
		logger.info(ediOrderBean.toString());
		assertEquals(ediOrderBean.getEdiOrder(),hsEdiOrder);
		verify(ediOrdValidationRepository).preorderUpdate(hsEdiOrder.getLegacyId());
		verify(legacyService).getOrder(hsEdiOrder.getLegacyId());
	}

}
