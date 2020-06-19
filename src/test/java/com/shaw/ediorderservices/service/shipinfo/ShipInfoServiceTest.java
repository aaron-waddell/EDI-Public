package com.shaw.ediorderservices.service.shipinfo;

import static com.shaw.ediorderservices.gson.MyGson.gson;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.HashMap;

import org.junit.jupiter.api.BeforeAll;
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

import com.shaw.ediorderservices.exception.ResourceNotFoundException;
import com.shaw.ediorderservices.helper.MockHelper;
import com.shaw.ediorderservices.helper.MockTest;
import com.shaw.ediorderservices.persistance.db2.dao.EdiShipInfoRepository;
import com.shaw.ediorderservices.persistance.db2.dao.EdiSplStoreXrefRepository;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderHeader;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderLine;
import com.shaw.ediorderservices.persistance.db2.entity.EdiShipInfo;
import com.shaw.ediorderservices.persistance.db2.entity.EdiShipInfo.EdiShipInfoPK;
import com.shaw.ediorderservices.persistance.db2.entity.EdiShipInfoLn;
import com.shaw.ediorderservices.persistance.sqlserver.entity.order.EdiOrder;
import com.shaw.ediorderservices.persistance.sqlserver.entity.order.OrderType;
import com.shaw.ediorderservices.service.csws.CSWSService;
import com.shaw.ediorderservices.service.shipInfo.ShipInfoService;
import com.shaw.mock.builder.MockBuilder;

@WebAppConfiguration
@ContextConfiguration
@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
@ExtendWith(SpringExtension.class)
class ShipInfoServiceTest extends MockTest {

	@Autowired
	ShipInfoService service;
	
	@Autowired
	EdiShipInfoRepository shipInfoRepository;
	
	@MockBean
	CSWSService cswsService;
	
	@MockBean
	EdiSplStoreXrefRepository ediSplStoreXrefRepository;

	final static Logger logger = LoggerFactory.getLogger(ShipInfoServiceTest.class);

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void testCreateShipInfo() {
		when(cswsService.getOrderView(ediOrderHeader.getShawOrderNumber())).thenReturn(orderView);
		when(ediSplStoreXrefRepository.findByIdCustCodeAndIdOrderingSys(samplesEdiOrder.getCustomerCode(), samplesEdiOrder.getOrderingSystem())).thenReturn(xrefList);
		logger.info(gson.toJson(orderView));
		ediOrderBean.setLegacyHeader(ediOrderHeader);
		ediOrderBean.setEdiOrder(samplesEdiOrder);
		service.createShipInfo();
		EdiShipInfo shipInfo = shipInfoRepository.findById(new EdiShipInfoPK(ediOrderHeader.getShawOrderNumber(), LocalDate.now())).orElseThrow(()->new ResourceNotFoundException());
		logger.info(shipInfo.toString());
		verify(cswsService).getOrderView(ediOrderHeader.getShawOrderNumber());
		assertEquals(ediOrderHeader.getCustDept(),shipInfo.getDepartment());
		EdiShipInfoLn ln = shipInfo.getLines().get(0);
		EdiOrderLine samplesLine = ediOrderHeader.getLines().get(0);
		logger.info(ln.toString());
		assertEquals(samplesLine.getColor(), ln.getColorNbr());
	}
	
	@Test
	void testGetSplValues()
	{
		when(ediSplStoreXrefRepository.findByIdCustCodeAndIdOrderingSys(samplesEdiOrder.getCustomerCode(), samplesEdiOrder.getOrderingSystem())).thenReturn(xrefList);

		//blank xdock, blank address
		EdiOrderHeader blankXDock = MockBuilder.build(EdiOrderHeader.class);
		blankXDock.setCrossDockCenter("");
		EdiOrder blankAddress = MockHelper.buildEdiOrder(OrderType.SAMPLES);
		when(ediSplStoreXrefRepository.findByIdCustCodeAndIdOrderingSys(blankAddress.getCustomerCode(), blankAddress.getOrderingSystem())).thenReturn(xrefList);
		blankAddress.getShipToAddress().setAddressLine1("");
		ediOrderBean.setLegacyHeader(blankXDock);
		ediOrderBean.setEdiOrder(blankAddress);
		HashMap<String, String> map = service.getSplValues();
		assertEquals(blankXDock.getBillToStore(), map.get("splBillToStore"));
		assertEquals(blankXDock.getBillToStore(), map.get("splShipToStore"));
		assertEquals("", map.get("splXdockCenter"));

		//blank xdock, non-blank address
		ediOrderBean.setLegacyHeader(blankXDock);
		ediOrderBean.setEdiOrder(samplesEdiOrder);
		map = service.getSplValues();
		assertEquals(blankXDock.getBillToStore(), map.get("splBillToStore"));
		assertEquals(blankXDock.getShipToAddress().getStore(), map.get("splShipToStore"));
		assertEquals("", map.get("splXdockCenter"));

		//non-blank xdock, blank address
		ediOrderBean.setLegacyHeader(ediOrderHeader);
		ediOrderBean.setEdiOrder(blankAddress);
		map = service.getSplValues();
		assertEquals(blankXDock.getBillToStore(), map.get("splBillToStore"));
		assertEquals("", map.get("splShipToStore"));
		assertEquals(blankXDock.getBillToStore(), map.get("splXdockCenter"));

		//non-blank xdock, non-blank address
		ediOrderBean.setLegacyHeader(ediOrderHeader);
		ediOrderBean.setEdiOrder(samplesEdiOrder);
		map = service.getSplValues();
		assertEquals(blankXDock.getBillToStore(), map.get("splBillToStore"));
		assertEquals("", map.get("splShipToStore"));
		assertEquals(blankXDock.getShipToAddress().getStore(), map.get("splXdockCenter"));

		verify(ediSplStoreXrefRepository,times(2)).findByIdCustCodeAndIdOrderingSys(samplesEdiOrder.getCustomerCode(), samplesEdiOrder.getOrderingSystem());
		verify(ediSplStoreXrefRepository,times(2)).findByIdCustCodeAndIdOrderingSys(blankAddress.getCustomerCode(), blankAddress.getOrderingSystem());
	}

}
