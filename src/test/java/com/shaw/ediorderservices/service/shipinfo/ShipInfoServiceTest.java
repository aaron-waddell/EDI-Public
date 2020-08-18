package com.shaw.ediorderservices.service.shipinfo;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static com.shaw.ediorderservices.gson.MyGson.gson;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.any;

import java.time.LocalDate;
import java.util.Map;

import org.apache.commons.lang3.RandomUtils;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

import com.shaw.ediorderservices.exception.ResourceNotFoundException;
import com.shaw.ediorderservices.helper.MockTest;
import com.shaw.ediorderservices.persistance.db2.dao.EdiOrderLineRepository;
import com.shaw.ediorderservices.persistance.db2.dao.EdiShipInfoRepository;
import com.shaw.ediorderservices.persistance.db2.dao.EdiSplStoreXrefRepository;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderHeader;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderLine;
import com.shaw.ediorderservices.persistance.db2.entity.EdiShipInfo;
import com.shaw.ediorderservices.persistance.db2.entity.EdiShipInfo.EdiShipInfoPK;
import com.shaw.ediorderservices.persistance.db2.entity.EdiShipInfoLn;
import com.shaw.ediorderservices.persistance.db2.entity.EdiSplStoreXref;
import com.shaw.ediorderservices.persistance.sqlserver.entity.order.EdiOrder;
import com.shaw.ediorderservices.persistance.sqlserver.entity.order.OrderType;
import com.shaw.ediorderservices.service.csws.CSWSService;
import com.shaw.ediorderservices.service.shipInfo.ShipInfoService;

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
	@Qualifier("hardsurfacesCswsService")
	CSWSService cswsService;
	
	@MockBean
	EdiSplStoreXrefRepository ediSplStoreXrefRepository;

	@MockBean
	EdiOrderLineRepository ediOrderLineRepository;

	final static Logger logger = LoggerFactory.getLogger(ShipInfoServiceTest.class);

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void testCreateShipInfo() {
		orderView.getHeader().setCarrierCode(randomAlphabetic(2));
		samplesOrderHeader.setLegacyOrderNumber(RandomUtils.nextLong());
		when(cswsService.getOrderView(samplesOrderHeader.getShawOrderNumber())).thenReturn(orderView);
		when(ediSplStoreXrefRepository.findByIdCustCodeAndIdOrderingSys(samplesEdiOrder.getCustomerCode(), samplesEdiOrder.getOrderingSystem())).thenReturn(xrefList);
		when(ediOrderLineRepository.findByIdLegacyOrderNumber(any(Long.class))).thenReturn(samplesLines);
		logger.info(gson.toJson(orderView));
		ediOrderBean.setLegacyHeader(samplesOrderHeader);
		ediOrderBean.setEdiOrder(samplesEdiOrder);
		service.createShipInfo();
		verify(ediOrderLineRepository).findByIdLegacyOrderNumber(any(Long.class));
		EdiShipInfo shipInfo = shipInfoRepository.findById(new EdiShipInfoPK(samplesOrderHeader.getShawOrderNumber(), LocalDate.now())).orElseThrow(()->new ResourceNotFoundException());
		logger.info(shipInfo.toString());
		verify(cswsService).getOrderView(samplesOrderHeader.getShawOrderNumber());
		assertEquals(samplesOrderHeader.getCustDept(),shipInfo.getDepartment());
		EdiShipInfoLn ln = shipInfo.getLines().get(0);
//		EdiOrderLine samplesLine = samplesOrderHeader.getLines().get(0);
		logger.info(ln.toString());
//		assertEquals(samplesLine.getColor(), ln.getColorNbr());
	}
	
	@Test
	void testGetSplValues()
	{
		when(ediSplStoreXrefRepository.findByIdCustCodeAndIdOrderingSys(samplesEdiOrder.getCustomerCode(), samplesEdiOrder.getOrderingSystem())).thenReturn(xrefList);
		EdiOrder blankAddress = mockHelper.buildEdiOrder(OrderType.SAMPLES);
		blankAddress.getShipToAddress().setAddressLine1("");
		when(ediSplStoreXrefRepository.findByIdCustCodeAndIdOrderingSys(blankAddress.getCustomerCode(), blankAddress.getOrderingSystem())).thenReturn(xrefList);

		EdiOrderHeader blankXDock = mockBuilder.build(EdiOrderHeader.class);		
		blankXDock.setBillToStore(xrefList.get(0).getId().getCustStoreNbr());
		blankXDock.getShipToAddress().setStore(xrefList.get(1).getId().getCustStoreNbr());
		blankXDock.setCrossDockCenter("");

		samplesOrderHeader.setBillToStore(xrefList.get(0).getId().getCustStoreNbr());
		samplesOrderHeader.getShipToAddress().setStore(xrefList.get(1).getId().getCustStoreNbr());

		String billToStore = xrefList.parallelStream().filter(x->x.getId().getCustStoreNbr().equals(blankXDock.getBillToStore())).map(EdiSplStoreXref::getShawStoreNbr).findFirst().orElse(null);
		String shipToStore = xrefList.parallelStream().filter(x->x.getId().getCustStoreNbr().equals(blankXDock.getShipToAddress().getStore())).map(EdiSplStoreXref::getShawStoreNbr).findFirst().orElse(null);

		//blank xdock, blank address
		ediOrderBean.setLegacyHeader(blankXDock);
		ediOrderBean.setEdiOrder(blankAddress);
		Map<String, String> map = service.getSplValues();
//		verify(ediSplStoreXrefRepository).findByIdCustCodeAndIdOrderingSys(blankAddress.getCustomerCode(), blankAddress.getOrderingSystem());
		assertEquals(billToStore, map.get("splBillToStore"));
		assertEquals(billToStore, map.get("splShipToStore"));
		assertEquals("", map.get("splXdockCenter"));

		//blank xdock, non-blank address
		ediOrderBean.setLegacyHeader(blankXDock);
		ediOrderBean.setEdiOrder(samplesEdiOrder);
		map = service.getSplValues();
//		verify(ediSplStoreXrefRepository).findByIdCustCodeAndIdOrderingSys(samplesEdiOrder.getCustomerCode(), samplesEdiOrder.getOrderingSystem());
		assertEquals(billToStore, map.get("splBillToStore"));
		assertEquals(shipToStore, map.get("splShipToStore"));
		assertEquals("", map.get("splXdockCenter"));

		//non-blank xdock, blank address
		billToStore = xrefList.parallelStream().filter(x->x.getId().getCustStoreNbr().equals(samplesOrderHeader.getBillToStore())).map(EdiSplStoreXref::getShawStoreNbr).findFirst().orElse(null);
		shipToStore = xrefList.parallelStream().filter(x->x.getId().getCustStoreNbr().equals(samplesOrderHeader.getShipToAddress().getStore())).map(EdiSplStoreXref::getShawStoreNbr).findFirst().orElse(null);
		ediOrderBean.setLegacyHeader(samplesOrderHeader);
		ediOrderBean.setEdiOrder(blankAddress);
		map = service.getSplValues();
//		verify(ediSplStoreXrefRepository).findByIdCustCodeAndIdOrderingSys(blankAddress.getCustomerCode(), blankAddress.getOrderingSystem());
		assertEquals(billToStore, map.get("splBillToStore"));
		assertEquals("", map.get("splShipToStore"));
		assertEquals(billToStore, map.get("splXdockCenter"));

		//non-blank xdock, non-blank address
		ediOrderBean.setLegacyHeader(samplesOrderHeader);
		ediOrderBean.setEdiOrder(samplesEdiOrder);
		map = service.getSplValues();
//		verify(ediSplStoreXrefRepository).findByIdCustCodeAndIdOrderingSys(samplesEdiOrder.getCustomerCode(), samplesEdiOrder.getOrderingSystem());
		assertEquals(billToStore, map.get("splBillToStore"));
		assertEquals("", map.get("splShipToStore"));
		assertEquals(shipToStore, map.get("splXdockCenter"));

		verify(ediSplStoreXrefRepository,times(2)).findByIdCustCodeAndIdOrderingSys(samplesEdiOrder.getCustomerCode(), samplesEdiOrder.getOrderingSystem());
		verify(ediSplStoreXrefRepository,times(2)).findByIdCustCodeAndIdOrderingSys(blankAddress.getCustomerCode(), blankAddress.getOrderingSystem());
	}

}
