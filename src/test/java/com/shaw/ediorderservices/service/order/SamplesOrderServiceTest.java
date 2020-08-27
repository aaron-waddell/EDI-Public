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
import com.shaw.ediorderservices.service.csws.SamplesCSWSService;
import com.shaw.ediorderservices.service.legacy.LegacyService;
import com.shaw.ediorderservices.service.messaging.EmailService;
import com.shaw.ediorderservices.service.order.OrderService;
import com.shaw.ediorderservices.service.validation.ValidationService;

@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
@ExtendWith(SpringExtension.class)
class SamplesOrderServiceTest extends MockTest {

	final static Logger logger = LoggerFactory.getLogger(SamplesOrderServiceTest.class);

	@Autowired
	@Qualifier("samplesOrderService")
	OrderService service;	
	
	@MockBean
	@Qualifier("samplesLegacyService")
	LegacyService legacyService;

	@MockBean
	@Qualifier("samplesCswsService")
	SamplesCSWSService cswsService;
	
	@MockBean
	@Qualifier("samplesValidationService")
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
		validOrder = SerializationUtils.clone(samplesEdiOrder);
		invalidOrder = SerializationUtils.clone(samplesEdiOrder);
		validOrder.addValidation(new EdiValidation("ACCEPTED", "ACCEPTED"));
		EdiValidation v = new EdiValidation("SYSTEM ERROR","E");
		invalidOrder.addValidation(v);		
//		service = spy(SamplesOrderService.class);
//		when(service.getOrder(any(Long.class))).thenReturn(ediOrder);
//		when(ediOrderRepository.save(any(EdiOrder.class))).thenCallRealMethod();
//		when(validationService.fillPreorder()).thenReturn(samplesEdiOrder);
//		when(legacyService.convertLegacyOrder()).thenReturn(samplesEdiOrder);
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
		ediOrderBean.setEdiOrder(samplesEdiOrder);
		when(ediOrderRepository.save(samplesEdiOrder)).thenReturn(samplesEdiOrder);
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
		when(ediOrderRepository.save(samplesEdiOrder)).thenReturn(validOrder);
		ediOrderBean.setEdiOrder(samplesEdiOrder);
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
		ediOrderBean.setEdiOrder(samplesEdiOrder);
//		when(cswsService.place()).thenReturn(samplesEdiOrder);
		service.convert();
		verify(cswsService).place();
		assertNotNull(ediOrderBean);
		logger.info(ediOrderBean.toString());
	}

}
