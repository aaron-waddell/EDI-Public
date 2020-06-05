package com.shaw.ediorderservices.service.impl;

import static com.shaw.ediorderservices.gson.MyGson.gson;
import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
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
import com.shaw.ediorderservices.csws.CustInfo;
import com.shaw.ediorderservices.helper.MockTest;
import com.shaw.ediorderservices.persistance.db2.dao.SamplesInfoRepository;
import com.shaw.ediorderservices.persistance.db2.entity.SamplesInfo;
import com.shaw.ediorderservices.persistance.sqlserver.entity.EdiLine;
import com.shaw.ediorderservices.service.CSWSService;
import com.shaw.ediorderservices.service.common.IEntityBody;


@WebAppConfiguration
@ContextConfiguration
@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
@ExtendWith(SpringExtension.class)
class CSWSSamplesServiceTest extends MockTest{

	final static Logger logger = LoggerFactory.getLogger(CSWSSamplesServiceTest.class);
	private static final String CUST_NBR = randomAlphabetic(6);

	@Autowired
//	@Qualifier("cswsSamplesService")
	CSWSSamplesService service;	

	@MockBean
	RestService restService;
	
	@MockBean
	SamplesInfoRepository samplesInfoRepository;
	
	private EdiLine ediLine;
	
	@BeforeEach
	void setUpBeforeClass() throws Exception {
//		service = spy(CSWSSamplesService.class);
//		samplesInfoRepository = spy(SamplesInfoRepository.class);
//		when(service.getCustomerInfo(anyString())).thenReturn(custInfo);
		ediLine = samplesEdiOrder.getLines().get(0);
		when(samplesInfoRepository.getSamplesInfo(ediLine.getStyle() + ediLine.getColor())).thenReturn(Optional.of(samplesInfo));
	}

	@Test
	void testCreateCart() {
		ediOrderBean.setEdiOrder(samplesEdiOrder);
		when(restService.putForObject(any(URI.class),any(CartRequest.class))).thenReturn(gson.toJson(cart));
		Cart result = service.createCart();
		verify(restService).putForObject(any(URI.class),any(CartRequest.class));
		assertNotNull(result);	
		logger.info(gson.toJson(result));
	}

	@Test
	void testCreateCartRequest() {
		ediOrderBean.setEdiOrder(samplesEdiOrder);
		CartRequest result = service.createCartRequest();
		logger.info(gson.toJson(result));
		assertEquals(samplesInfo.getSamplesStyleNbr(),result.getSamplesLines().get(0).getStyleNbr());
		assertEquals(samplesInfo.getDelVehNbr(),result.getSamplesLines().get(0).getDelVehNbr());
		assertEquals(samplesInfo.getSamplesStyleNbr(),result.getSamplesLines().get(0).getSamplesPrivateStyle());
		assertEquals(ediOrderBean.getEdiOrder().getShipDate().getDateValue().format(CSWSService.USA_FORMAT),result.getSamplesLines().get(0).getShipDate());
		verify(samplesInfoRepository).getSamplesInfo(ediLine.getStyle() + ediLine.getColor());
		assertNotNull(result);	
	}

	@Test
	void testConvert() {
		ediOrderBean.setEdiOrder(samplesEdiOrder);
		when(restService.postForObject(any(URI.class))).thenReturn(gson.toJson(custInfo));
		when(restService.postForObject(any(URI.class),any(IEntityBody.class))).thenReturn(gson.toJson(shawOrder));
		service.convert(cart);
		verify(restService).postForObject(any(URI.class));
		verify(restService).postForObject(any(URI.class),any(IEntityBody.class));
		assertNotNull(ediOrderBean.getEdiOrder());	
		logger.info(gson.toJson(ediOrderBean.getEdiOrder()));
		assertNotEquals("",ediOrderBean.getEdiOrder().getShawOrderNbr());
		assertEquals(ediOrderBean.getEdiOrder().getLines().get(0).getStyle(),ediOrderBean.getEdiOrder().getLines().get(0).getStyle());
	}

	@Test
	void testGetSamplesInfo() {
		ediOrderBean.setEdiOrder(samplesEdiOrder);
		SamplesInfo result = service.getSamplesInfo(ediLine);
		verify(samplesInfoRepository).getSamplesInfo(ediLine.getStyle() + ediLine.getColor());
		logger.info(gson.toJson(result));
		assertNotNull(result);	
	}

	@Test
	void testgetCustInfo() throws Exception {
		ediOrderBean.setEdiOrder(samplesEdiOrder);
		when(restService.postForObject(any(URI.class))).thenReturn(gson.toJson(custInfo));
		CustInfo result = service.getCustomerInfo(CUST_NBR);
		verify(restService).postForObject(any(URI.class));
		logger.info(gson.toJson(result));
		assertNotNull(result);	
	}

}
