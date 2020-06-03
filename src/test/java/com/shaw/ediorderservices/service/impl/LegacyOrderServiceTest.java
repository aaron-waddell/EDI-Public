package com.shaw.ediorderservices.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.shaw.ediorderservices.exception.ResourceNotFoundException;
import com.shaw.ediorderservices.helper.MockTest;
import com.shaw.ediorderservices.persistance.db2.dao.EdiOrderHeaderRepository;
import com.shaw.ediorderservices.persistance.db2.dao.EdiOrderLineRepository;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderHeader;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderLine;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderLine.EdiOrderLinePK;
import com.shaw.ediorderservices.persistance.sqlserver.entity.EdiOrder;
import com.shaw.ediorderservices.service.ILegacyOrderService;

@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
@ExtendWith(SpringExtension.class)
class LegacyOrderServiceTest extends MockTest {

	final static Logger logger = LoggerFactory.getLogger(CSWSSamplesServiceTest.class);

	@Autowired
	private ILegacyOrderService legacyOrderService;

	@Autowired
	EdiOrderHeaderRepository ediOrderHeaderRepository;

	@Autowired
	EdiOrderLineRepository ediOrderLineRepository;

	@BeforeEach
	void setUpBeforeClass() throws Exception {
	}

	@Test
	void testCreateLegacyOrder() {
//		when(ediOrderHeaderRepository.save(any(EdiOrderHeader.class))).thenCallRealMethod();
		ediOrderBean.setEdiOrder(hsEdiOrder);
		legacyOrderService.createLegacyOrder();
		EdiOrderHeader legacyHeader = ediOrderBean.getLegacyHeader();
		assertNotNull(legacyHeader);
		assertEquals(hsEdiOrder.getCustomerCode(),legacyHeader.getCustomerCode());
		assertEquals(hsEdiOrder.getShipDate().getDateValue(),legacyHeader.getShipDateValue());
		assertEquals(hsEdiOrder.getLines().get(0).getColor(),legacyHeader.getLines().get(0).getColor());
		logger.info(legacyHeader.toString());
//		verify(ediOrderHeaderRepository).save(ediOrderHeader);
		assertNotEquals(0,legacyHeader.getLegacyOrderNumber());
	}

	@Test
	void testConvertLegacyOrder() {
		EdiOrderHeader header = ediOrderHeaderRepository.findFirstByOrderType("H").orElseThrow(ResourceNotFoundException::new);
		EdiOrderLine line = ediOrderLineRepository.findByIdEdiOrderHeader(header).get(0);
//		when(ediOrderHeaderRepository.save(any(EdiOrderHeader.class))).thenCallRealMethod();
		legacyOrderService.getOrder(header.getLegacyOrderNumber());
		assertNotNull(ediOrderBean.getLegacyHeader());
		logger.info(ediOrderBean.getLegacyHeader().toString());
		legacyOrderService.convertLegacyOrder();
		EdiOrder result = ediOrderBean.getEdiOrder();
		logger.info(ediOrderBean.getEdiOrder().toString());
		assertEquals(header.getCustomerCode(),result.getCustomerCode());
		assertEquals(header.getShipDateValue(), result.getShipDate().getDateValue());
		assertEquals(line.getColor(), result.getLines().get(0).getColor());
//		verify(ediOrderBeanRepository).save(ediOrderHeader);
		assertNotEquals(0,result.getLegacyId());
	}
	
	@Test
	void testGetOrder() {
		EdiOrderHeader header = ediOrderHeaderRepository.findFirstByOrderType("H").orElseThrow(ResourceNotFoundException::new);
		EdiOrderLine line = ediOrderLineRepository.findByIdEdiOrderHeader(header).get(0);
//		when(ediOrderHeaderRepository.findById(testEdiOrder.getLegacyId())).thenReturn(Optional.of(ediOrderHeader));
//		EdiOrderHeader result = ediOrderHeaderRepository.save(ediOrderHeader);
		legacyOrderService.getOrder(header.getLegacyOrderNumber());
		EdiOrderHeader result = ediOrderBean.getLegacyHeader();
		assertNotNull(result);
		logger.info(result.toString());
		assertEquals(header.getCustomerCode(),result.getCustomerCode());
		assertEquals(header.getConsumerAddress().getCity(),result.getConsumerAddress().getCity());
		assertEquals(line.getAddCustProdInfo(),result.getLines().get(0).getAddCustProdInfo());
//		verify(ediOrderHeaderRepository).findById(ediOrder.getLegacyId());
		assertNotEquals(0,result.getLegacyOrderNumber());
	}
	
}
