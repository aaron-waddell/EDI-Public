package com.shaw.ediorderservices.mapping;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.shaw.ediorderservices.csws.ShipInfo;
import com.shaw.ediorderservices.helper.MockTest;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderHeader;
import com.shaw.ediorderservices.persistance.sqlserver.entity.order.CarpetEdiOrder;
import com.shaw.ediorderservices.persistance.sqlserver.entity.order.UnitsEdiOrder;
import com.shaw.ediorderservices.persistance.sqlserver.entity.order.SamplesEdiOrder;

@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
@ExtendWith(SpringExtension.class)
class OrderMapperTest extends MockTest {

	@Autowired
	OrderMapper orderMapper;

	@Test
	final void testEdiOrderToLegacy() {
		EdiOrderHeader result = orderMapper.ediOrderToLegacy(samplesEdiOrder);
		assertEquals(samplesEdiOrder.getAgreementNumber(),result.getAgreementNumber());
	}

	@Test
	final void testLegacyHeaderToSamplesEdiOrder() {
		SamplesEdiOrder result = orderMapper.legacyHeaderToSamplesEdiOrder(samplesOrderHeader);
		assertEquals(samplesOrderHeader.getBeg(),result.getBeg());
	}

	@Test
	final void testLegacyHeaderToCarpetEdiOrder() {
		CarpetEdiOrder result = orderMapper.legacyHeaderToCarpetEdiOrder(cptOrderHeader);
		assertEquals(cptOrderHeader.getDunsNbr(),result.getDunsNbr());
	}

	@Test
	final void testLegacyHeaderToUnitsEdiOrder() {
		UnitsEdiOrder result = orderMapper.legacyHeaderToUnitsEdiOrder(hsOrderHeader);
		assertEquals(hsOrderHeader.getBeg(),result.getBeg());
	}

	@Test
	final void testEdiOrderAndCustInfoToShipInfo() {
		ShipInfo result = orderMapper.ediOrderAndCustInfoToShipInfo(unitsEdiOrder,custInfo);
		assertEquals(unitsEdiOrder.getShipToAddress().getCountry(),result.getShipCountry());
		assertEquals(custInfo.getSpecialInst1(),result.getSpecialInst1());
	}

}
