package com.shaw.ediorderservices.service.csws;

import static com.shaw.ediorderservices.gson.MyGson.gson;
import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.net.URI;
import java.util.Optional;

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
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

import com.shaw.ediorderservices.csws.Cart;
import com.shaw.ediorderservices.csws.CartRequest;
import com.shaw.ediorderservices.helper.MockTest;
import com.shaw.ediorderservices.persistance.db2.dao.SamplesInfoRepository;
import com.shaw.ediorderservices.persistance.sqlserver.entity.line.EdiLine;
import com.shaw.ediorderservices.service.rest.RestService;

@WebAppConfiguration
@ContextConfiguration
@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
@ExtendWith(SpringExtension.class)
class UnitsCSWSServiceTest extends MockTest {

	final static Logger logger = LoggerFactory.getLogger(SamplesCSWSServiceTest.class);
	private static final String CUST_NBR = randomAlphabetic(6);
	private static final String ORDER_NBR = randomAlphabetic(6);

	@Autowired
//	@Qualifier("cswsUnitsService")
	UnitsCSWSService service;	

	@MockBean
	RestService restService;
		
	private EdiLine ediLine;

	@BeforeEach
	void setUpBeforeClass() throws Exception {
		ediOrderBean.setEdiOrder(unitsEdiOrder);
		ediLine = unitsEdiOrder.getLines().get(0);
	}
	
	@Test
	void testCreateCart() {
		when(restService.putForObject(any(URI.class),any(CartRequest.class))).thenReturn(gson.toJson(cart));
		Cart result = service.createCart();
		verify(restService).putForObject(any(URI.class),any(CartRequest.class));
		assertNotNull(result);	
		logger.info(gson.toJson(result));
	}

	@Test
	void testCreateCartRequest() {
		CartRequest result = service.createCartRequest();
		logger.info(gson.toJson(result));
		assertEquals(ediLine.getStyle(),result.getUnitsLines().get(0).getStyleNbr());
		assertEquals(ediOrderBean.getEdiOrder().getShipDate().getDateValue().format(CSWSService.USA_FORMAT),result.getUnitsLines().get(0).getShipDate());
		assertNotNull(result);	
	}

}
