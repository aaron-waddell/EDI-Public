package com.shaw.ediorderservices.service.shipinfo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static com.shaw.ediorderservices.gson.MyGson.gson;

import java.time.LocalDate;

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
import com.shaw.ediorderservices.gson.MyGson;
import com.shaw.ediorderservices.helper.MockTest;
import com.shaw.ediorderservices.persistance.db2.dao.EdiShipInfoRepository;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderLine;
import com.shaw.ediorderservices.persistance.db2.entity.EdiShipInfo;
import com.shaw.ediorderservices.persistance.db2.entity.EdiShipInfo.EdiShipInfoPK;
import com.shaw.ediorderservices.service.legacy.LegacyService;
import com.shaw.ediorderservices.service.shipInfo.ShipInfoService;
import com.shaw.ediorderservices.persistance.db2.entity.EdiShipInfoLn;

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
	LegacyService orderService;

	final static Logger logger = LoggerFactory.getLogger(ShipInfoServiceTest.class);

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void testCreateShipInfo() {
//		when(orderService.getOrderView(ediOrderHeader.getShawOrderNumber())).thenReturn(orderHeaderView);
		logger.info(gson.toJson(orderHeaderView));
		ediOrderBean.setLegacyHeader(ediOrderHeader);
		service.createShipInfo();
		EdiShipInfo shipInfo = shipInfoRepository.findById(new EdiShipInfoPK(ediOrderHeader.getShawOrderNumber(), LocalDate.now())).orElseThrow(()->new ResourceNotFoundException());
		logger.info(shipInfo.toString());
		assertEquals(ediOrderHeader.getCustDept(),shipInfo.getDepartment());
		EdiShipInfoLn ln = shipInfo.getLines().get(0);
		EdiOrderLine samplesLine = ediOrderHeader.getLines().get(0);
		logger.info(ln.toString());
		assertEquals(samplesLine.getColor(), ln.getColorNbr());
	}

}