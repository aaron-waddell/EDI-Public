package com.shaw.ediorderservices.service.audit;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

import com.shaw.ediorderservices.helper.MockTest;
import com.shaw.ediorderservices.persistance.db2.dao.EdiAuditRepository;
import com.shaw.ediorderservices.persistance.db2.entity.EdiAudit;
import com.shaw.ediorderservices.service.audit.AuditService;

@WebAppConfiguration
@ContextConfiguration
@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
@ExtendWith(SpringExtension.class)
class AuditServiceTest extends MockTest {

	@Autowired
	AuditService service;
	
	@Autowired
	EdiAuditRepository ediAuditRepository;

	final static Logger logger = LoggerFactory.getLogger(AuditServiceTest.class);

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void testCreateCarrierAudit() {
		ediOrderBean.setEdiOrder(hsEdiOrder);
		ediOrderBean.setLegacyHeader(ediOrderHeader);
		
		service.createCarrierAudit(true);
		
		EdiAudit audit = ediAuditRepository.findByEdiOrderNumber(hsEdiOrder.getLegacyOrderNumber()).get(0);
		assertNotNull(audit);
		logger.info(audit.toString());
		assertTrue(audit.getAuditMsg().contains("MANHATTAN"));
		
	}

}
