package com.shaw.ediorderservices.helper;

import static com.shaw.ediorderservices.gson.myGson.gson;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.shaw.ediorderservices.enums.OrderType;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderHeader;
import com.shaw.ediorderservices.persistance.sqlserver.entity.EdiOrder;

class MockObjectTest extends MockTest{

    protected static final Logger logger = LogManager.getLogger();

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void testEdiOrder() throws Exception {
		EdiOrder ediOrder = MockObject.buildEdiOrder(OrderType.CARPET);
		logger.info(ediOrder.toString());
	}

	@Test
	void testHeader() throws Exception {
		EdiOrderHeader h = MockObject.buildEdiOrderHeader();
		logger.info(h.toString());
		assertNotNull(h.getConsumerAddress());
		assertNotNull(h.getConsumerAddress().getAddressLine1());
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
