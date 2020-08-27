package com.shaw.ediorderservices.service.validation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.net.URI;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.BeforeEach;
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
import com.shaw.ediorderservices.persistance.sqlserver.entity.order.EdiOrder;
import com.shaw.ediorderservices.persistance.sqlserver.entity.order.OrderType;
import com.shaw.ediorderservices.service.common.IEntityBody;
import com.shaw.ediorderservices.service.legacy.LegacyService;
import com.shaw.ediorderservices.service.validation.IValidationService;

@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
class UnitsValidationServiceTest extends MockTest {

	final static Logger logger = LoggerFactory.getLogger(UnitsValidationServiceTest.class);

//	private Answer<?> answer = i->{ediOrderBean.setEdiOrder(invalidOrder2);return null;};

	@Autowired
	@Qualifier("unitsValidationService")
	IValidationService service;

	@MockBean
	private EdiOrdValidationRepository ediOrdValidationRepository;

	@MockBean
	private EdiOrderHeaderRepository ediOrderHeaderRepository;

	@MockBean
	LegacyService legacyService;

	private static EdiOrder invalidOrder;

	@BeforeEach
	void setup()
	{
		invalidOrder = mockHelper.buildEdiOrder(OrderType.SAMPLES);
		invalidOrder.setValidations(Lists.newArrayList(ediValidation,ediValidation2));
		invalidOrder.getLines().get(0).setValidations(Lists.newArrayList(ediValidation,ediValidation2));
	}

	@Test
	final void testValidate() {
		ediOrderBean.setEdiOrder(unitsEdiOrder);
		when(ediOrdValidationRepository.validateEdiOrder(unitsEdiOrder.getLegacyOrderNumber(), "1")).thenReturn(validationMap);
//		when(ediOrderHeaderRepository.findById(testEdiOrder.getLegacyId())).thenReturn(Optional.of(ediOrderHeader));
//		doAnswer(i->{ediOrderBean.setEdiOrder(invalidOrder2);return null;}).when(legacyService).getOrder(testEdiOrder.getLegacyId());
		doAnswer(i->{ediOrderBean.setEdiOrder(invalidOrder);return null;}).when(legacyService).convertLegacyOrder();
		service.validate();
		verify(ediOrdValidationRepository).validateEdiOrder(unitsEdiOrder.getLegacyOrderNumber(), "1");
//		verify(ediOrderHeaderRepository).findById(testEdiOrder.getLegacyId());
		verify(legacyService).getOrder(unitsEdiOrder.getLegacyOrderNumber());
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
		ediOrderBean.setEdiOrder(unitsEdiOrder);
		when(ediOrdValidationRepository.preorderUpdate(unitsEdiOrder.getLegacyOrderNumber())).thenReturn(validationMap);
//		when(legacyService.getOrder(testEdiOrder.getLegacyId())).thenReturn(testEdiOrder);
		service.fillPreorder();
		logger.info(ediOrderBean.toString());
		assertEquals(ediOrderBean.getEdiOrder(),unitsEdiOrder);
		verify(ediOrdValidationRepository).preorderUpdate(unitsEdiOrder.getLegacyOrderNumber());
		verify(legacyService).getOrder(unitsEdiOrder.getLegacyOrderNumber());
	}

}
