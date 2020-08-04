package com.shaw.ediorderservices.helper;

import static com.shaw.ediorderservices.gson.MyGson.gson;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderHeader;
import com.shaw.ediorderservices.persistance.db2.entity.EdiSplStoreXref;
import com.shaw.ediorderservices.persistance.sqlserver.entity.EdiValidation;
import com.shaw.ediorderservices.persistance.sqlserver.entity.order.EdiOrder;
import com.shaw.ediorderservices.persistance.sqlserver.entity.order.OrderType;
import com.shaw.mock.builder.MockBuilder;

class MockHelperTest {

    protected static final Logger logger = LogManager.getLogger();

    private static MockBuilder mockBuilder;
    private static MockHelper mockHelper;
    
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		mockBuilder = new MockBuilder();	
		mockHelper = new MockHelper();	
	}

	@Test
	void testEdiOrder() throws Exception {
		EdiOrder ediOrder = mockHelper.buildEdiOrder(OrderType.CARPET);
		logger.info(ediOrder.toString());
		assertNotNull(ediOrder.getLines());
		assertNotNull(ediOrder.getLines().get(0));
		assertNotNull(ediOrder.getLines().get(0).getColor());
		assertNotNull(ediOrder.getLines().get(0).getEdiOrder());
		assertEquals(ediOrder.getAgreementNumber(),ediOrder.getLines().get(0).getEdiOrder().getAgreementNumber());
		
		assertNotNull(ediOrder.getConsumerAddress());
		assertNotNull(ediOrder.getConsumerAddress().getAddressLine1());
		assertEquals(ediOrder.getAgreementNumber(),ediOrder.getConsumerAddress().getEdiOrder().getAgreementNumber());
	}

	@Test
	void testHeader() throws Exception {
		EdiOrderHeader h = mockHelper.buildEdiOrderHeader(OrderType.CARPET);
		logger.info(h.toString());
		assertNotNull(h.getLines());
		assertNotNull(h.getLines().get(0));
		assertNotNull(h.getLines().get(0).getColor());
		assertEquals(h,h.getLines().get(0).getEdiOrderHeader());
		
		assertNotNull(h.getConsumerAddress());
		assertNotNull(h.getConsumerAddress().getAddressLine1());
	}

	@Test
	void testNestedBuild() throws Exception {
		EdiSplStoreXref x = mockBuilder.build(EdiSplStoreXref.class);
		logger.info(x.toString());
		assertNotNull(x.getId());
		assertNotNull(x.getId().getOrderingSys());
	}

	@Test
	void testEdiValidationBuild() throws Exception {
		EdiValidation x = mockBuilder.build(EdiValidation.class);
		logger.info(x.toString());
		assertNotNull(x.getId());
		assertNotNull(x.getActionCode());
	}
	
	@Test
	void testGsonDate()
	{
		LocalDate ld = LocalDate.now();
		logger.info("ld:" + gson.toJson(ld));
		LocalTime lt = LocalTime.now();
		logger.info("lt:" + gson.toJson(lt));
		LocalDateTime ldt = LocalDateTime.now();
		logger.info("ldt:" + gson.toJson(ldt));

	}
}
