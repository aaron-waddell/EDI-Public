package com.shaw.ediorderservices.service.legacy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.apache.commons.lang3.RandomUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.shaw.ediorderservices.helper.MockTest;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderHeader;
import com.shaw.ediorderservices.persistance.sqlserver.entity.order.EdiOrder;

@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
@ExtendWith(SpringExtension.class)
class LegacyServiceTest extends MockTest {

	final static Logger logger = LoggerFactory.getLogger(LegacyServiceTest.class);

	@Autowired
	private ILegacyService legacyOrderService;

//	@Autowired
//	EdiOrderHeaderRepository ediOrderHeaderRepository;

//	static EdiOrderHeader header = ediOrderHeader;
	//		static EdiOrderHeader header = ediOrderHeaderRepository.findFirstByOrderType("H").orElseThrow(ResourceNotFoundException::new);

	@BeforeEach
	private void  before()
	{
		samplesOrderHeader.setLegacyOrderNumber(RandomUtils.nextLong()); //can't store null
	}

	@Test
	void testCreateLegacyOrder() {
//		when(ediOrderHeaderRepository.save(any(EdiOrderHeader.class))).thenCallRealMethod();
		ediOrderBean.setEdiOrder(unitsEdiOrder);
		legacyOrderService.createLegacyOrder();
		EdiOrderHeader legacyHeader = ediOrderBean.getLegacyHeader();
		assertNotNull(legacyHeader);
		assertEquals(unitsEdiOrder.getCustomerCode(),legacyHeader.getCustomerCode());
		assertEquals(unitsEdiOrder.getShipDate().getDateValue(),legacyHeader.getShipDateValue());
		logger.info(legacyHeader.toString());
//		verify(ediOrderHeaderRepository).save(ediOrderHeader);
		assertNotEquals(0,legacyHeader.getLegacyOrderNumber());
	}

	@Test
	void testConvertLegacyOrder() {
//		when(ediOrderHeaderRepository.save(any(EdiOrderHeader.class))).thenCallRealMethod();
//		legacyOrderService.getOrder(header.getLegacyOrderNumber());
//		assertNotNull(ediOrderBean.getLegacyHeader());
//		logger.info(ediOrderBean.getLegacyHeader().toString());
		ediOrderBean.setLegacyHeader(samplesOrderHeader);
		legacyOrderService.convertLegacyOrder();
		EdiOrder result = ediOrderBean.getEdiOrder();
		logger.info(ediOrderBean.getEdiOrder().toString());
		assertEquals(samplesOrderHeader.getCustomerCode(),result.getCustomerCode());
		assertEquals(samplesOrderHeader.getShipDateValue(), result.getShipDate().getDateValue());
//		verify(ediOrderBeanRepository).save(ediOrderHeader);
		assertNotEquals(0,result.getLegacyOrderNumber());
	}
	
	@Test
	@Disabled
	void testGetOrder() {
//		when(ediOrderHeaderRepository.findById(testEdiOrder.getLegacyId())).thenReturn(Optional.of(ediOrderHeader));
//		EdiOrderHeader result = ediOrderHeaderRepository.save(ediOrderHeader);
		legacyOrderService.getOrder(samplesOrderHeader.getLegacyOrderNumber());
		EdiOrderHeader legacyHeader = ediOrderBean.getLegacyHeader();
		assertNotNull(legacyHeader);
		logger.info(legacyHeader.toString());
		assertEquals(samplesOrderHeader.getCustomerCode(),legacyHeader.getCustomerCode());
		assertEquals(samplesOrderHeader.getConsumerAddress().getCity(),legacyHeader.getConsumerAddress().getCity());
//		verify(ediOrderHeaderRepository).findById(ediOrder.getLegacyId());
		assertNotEquals(0,legacyHeader.getLegacyOrderNumber());
	}
	
}
