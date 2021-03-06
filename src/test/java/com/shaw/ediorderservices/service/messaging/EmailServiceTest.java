package com.shaw.ediorderservices.service.messaging;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.net.URI;
import java.util.List;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.shaw.ediorderservices.helper.MockTest;
import com.shaw.ediorderservices.persistance.sqlserver.entity.order.EdiOrder;
import com.shaw.ediorderservices.persistance.sqlserver.entity.order.OrderType;
import com.shaw.ediorderservices.service.EdiOrderBean;
import com.shaw.ediorderservices.service.common.IEntityBody;
import com.shaw.ediorderservices.service.rest.RestService;

@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
@ExtendWith(SpringExtension.class)
class EmailServiceTest extends MockTest {

	final static Logger logger = LoggerFactory.getLogger(EmailServiceTest.class);

	@Autowired
	protected EdiOrderBean ediOrderBean;
	
	@MockBean
	RestService restService;

	@Autowired
	EmailService emailService;

//	@Autowired 
//	ServiceConfig config;

	private static EdiOrder invalidOrder;

	@BeforeEach
	void setup()
	{
		invalidOrder = mockHelper.buildEdiOrder(OrderType.SAMPLES);
		invalidOrder.setValidations(Lists.newArrayList(ediValidation,ediValidation2));
		invalidOrder.getLines().get(0).setValidations(Lists.newArrayList(ediValidation,ediValidation2));
		when(restService.postForObject(any(URI.class),any(IEntityBody.class))).thenReturn("Email Sent");
	}
	
	@Test
	final void testSendEmails() {

		ediOrderBean.setEdiOrder(invalidOrder);
		List<String> emailsSent = emailService.sendEmails();
		verify(restService).postForObject(any(URI.class),any(IEntityBody.class));

		assertNotNull(emailsSent);
		logger.info(emailsSent.toString());
		assertEquals(2,emailsSent.size());
	}

	@Test
	final void testSendEmail() {

		int emailsSent = emailService.sendEmail(ediValidation.getDescription());
		verify(restService).postForObject(any(URI.class),any(IEntityBody.class));

		logger.info("emailsSent = " + emailsSent);
		assertEquals(1,emailsSent);
	}

}
