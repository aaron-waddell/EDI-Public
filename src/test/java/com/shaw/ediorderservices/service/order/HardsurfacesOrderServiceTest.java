package com.shaw.ediorderservices.service.order;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.apache.commons.lang3.SerializationUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.google.common.collect.Lists;
import com.shaw.ediorderservices.helper.MockTest;
import com.shaw.ediorderservices.persistance.db2.dao.EdiOrdValidationRepository;
import com.shaw.ediorderservices.persistance.db2.dao.EdiOrderHeaderRepository;
import com.shaw.ediorderservices.persistance.sqlserver.dao.EdiOrderRepository;
import com.shaw.ediorderservices.persistance.sqlserver.entity.EdiValidation;
import com.shaw.ediorderservices.persistance.sqlserver.entity.order.EdiOrder;
import com.shaw.ediorderservices.persistance.sqlserver.entity.order.OrderType;
import com.shaw.ediorderservices.service.csws.UnitsCSWSService;
import com.shaw.ediorderservices.service.legacy.LegacyService;
import com.shaw.ediorderservices.service.messaging.EmailService;
import com.shaw.ediorderservices.service.validation.ValidationService;

@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
@ExtendWith(SpringExtension.class)
class HardsurfacesOrderServiceTest extends MockTest {

	final static Logger logger = LoggerFactory.getLogger(SamplesOrderServiceTest.class);

	@Autowired
	@Qualifier("unitsOrderService")
	OrderService service;	
	
	@MockBean
	@Qualifier("unitsLegacyService")
	LegacyService legacyService;

	@MockBean
	@Qualifier("unitsCswsService")
	UnitsCSWSService cswsService;
	
	@MockBean
	@Qualifier("unitsValidationService")
	ValidationService validationService;

	@MockBean
	EmailService emailService;

	@MockBean
	EdiOrderHeaderRepository ediOrderHeaderRepository;

	@MockBean
	EdiOrderRepository ediOrderRepository;

	@MockBean
	EdiOrdValidationRepository ediOrdValidationRepository;

	private static EdiOrder validOrder;
	private static EdiOrder invalidOrder;

	@BeforeEach
	void setup() {
		validOrder = SerializationUtils.clone(unitsEdiOrder);
		invalidOrder = SerializationUtils.clone(unitsEdiOrder);
		validOrder.addValidation(new EdiValidation("ACCEPTED", "ACCEPTED"));
		EdiValidation v = new EdiValidation("SYSTEM ERROR","E");
		invalidOrder.addValidation(v);		
		when(cswsService.place()).thenReturn(shawOrder);
		when(emailService.sendEmails()).thenReturn(Lists.newArrayList("SYSTEM ERROR"));
        doAnswer(new Answer<Void>() {

            @Override
            public Void answer(InvocationOnMock invocation) throws Throwable {
            	ediOrderBean.setEdiOrder(invalidOrder);
                return null;
            }
        }).when(validationService).validate();
	}

	@Test
	void testPlace() {
		ediOrderBean.setEdiOrder(unitsEdiOrder);
		when(ediOrderRepository.save(unitsEdiOrder)).thenReturn(unitsEdiOrder);
//		when(cswsService.convert(cart)).thenReturn(shawOrder);
//		when(validationService).thenAnswer(i->ediOrderBean.setEdiOrder(invalidOrder));
		service.place();
//		assertNotNull(result);
		logger.info(ediOrderBean.toString());
		verify(validationService).fillPreorder();
		verify(validationService).validate();
		verify(emailService).sendEmails();
//		verify(cswsService).convert(cart);
	}

	@Test
//	@Disabled
	void testResubmit() {
		when(ediOrderRepository.save(unitsEdiOrder)).thenReturn(validOrder);
		ediOrderBean.setEdiOrder(unitsEdiOrder);
		service.place();
		verify(validationService,never()).fillPreorder();
		verify(validationService,never()).validate();
		verify(emailService,never()).sendEmails();
		verify(legacyService,never()).convertLegacyOrder();
		verify(cswsService).place();
		logger.info(ediOrderBean.toString());
	}

	@Test
//	@Disabled
	void testInvalidResubmit() {
		when(ediOrderRepository.save(invalidOrder)).thenReturn(invalidOrder);
		ediOrderBean.setEdiOrder(invalidOrder);
		service.place();
		verify(validationService,never()).fillPreorder();
		verify(validationService,never()).validate();
		verify(emailService).sendEmails();
		verify(legacyService,never()).convertLegacyOrder();
		logger.info(ediOrderBean.toString());
	}

	@Test
	void testConvert() {
		ediOrderBean.setEdiOrder(unitsEdiOrder);
//		when(cswsService.place()).thenReturn(unitsEdiOrder);
		service.convert();
		verify(cswsService).place();
		assertNotNull(ediOrderBean);
		logger.info(ediOrderBean.toString());
	}

}
