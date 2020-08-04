package com.shaw.ediorderservices.persistance.db2.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shaw.ediorderservices.exception.ResourceNotFoundException;
import com.shaw.ediorderservices.helper.MockTest;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrdValidation;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrdValidation.EdiOrdValidationPK;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderHeader;

@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
class EdiOrdValidationRepositoryTest extends MockTest {

	final static Logger logger = LoggerFactory.getLogger(EdiOrdValidationRepositoryTest.class);

	private static long EDI_ORDER_NBR = 0;

	private static final String PO_LINE_NBR = "1";
	
	@PersistenceContext(unitName = "db2PU")
	private EntityManager em;
	
	@Autowired
	EdiOrdValidationRepository ediOrdValidationRepository;

	@Autowired
	EdiReasonCodeRepository ediReasonCodeRepository;

	@Autowired
	EdiOrderHeaderRepository ediOrderHeaderRepository;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUpBefore() throws Exception {
		if (EDI_ORDER_NBR==0)
		{
			EdiOrderHeader header = ediOrderHeaderRepository.findFirstByOrderType("S").orElseThrow(ResourceNotFoundException::new);
			EDI_ORDER_NBR = header.getLegacyOrderNumber();
		}
	}

	@Test
	@Disabled
	void testPreorderUpdate() {
		Map<String,String> returnMap = ediOrdValidationRepository.preorderUpdate(EDI_ORDER_NBR);
		assertNotNull(returnMap);
		logger.info(returnMap.toString());
	}

	@Test
	@Disabled
	void testValidateEdiOrder() {
		Map<String,String> returnMap = ediOrdValidationRepository.validateEdiOrder(EDI_ORDER_NBR,"1");
		assertNotNull(returnMap);
		logger.info(returnMap.toString());
	}

	@Test
	void testUpdateStatusByIdEdiOrderNbr() {
		EdiOrdValidation ediOrdValidation = mockBuilder.build(EdiOrdValidation.class);
		ediOrdValidation.setId(new EdiOrdValidationPK(EDI_ORDER_NBR, PO_LINE_NBR));
		ediOrdValidation.setEdiReasonCode(ediReasonCodeRepository.findById(63).orElse(null));
		ediOrdValidationRepository.save(ediOrdValidation);

		int result = ediOrdValidationRepository.updateStatusByIdEdiOrderNbr("Q", EDI_ORDER_NBR);
		logger.info(result + " row status set");
		assertNotEquals(0,result);

		em.clear();
		EdiOrdValidation ordVal = ediOrdValidationRepository.findByIdEdiOrderNbr(EDI_ORDER_NBR).get(0);
		logger.info(ordVal.toString());
		assertEquals("Q",ordVal.getStatus());

		result = ediOrdValidationRepository.updateStatusByIdEdiOrderNbr("X", EDI_ORDER_NBR);
		logger.info(result + " row status updated");
		assertNotEquals(0,result);
		
		em.clear();
		ordVal = ediOrdValidationRepository.findByIdEdiOrderNbr(EDI_ORDER_NBR).get(0);
		logger.info(ordVal.toString());
		assertEquals("X",ordVal.getStatus().trim());

		result = ediOrdValidationRepository.updateStatusByIdEdiOrderNbr(" ", EDI_ORDER_NBR);
		logger.info(result + " row status cleared");
		assertNotEquals(0,result);
		
		em.clear();
		ordVal = ediOrdValidationRepository.findByIdEdiOrderNbr(EDI_ORDER_NBR).get(0);
		logger.info(ordVal.toString());
		assertEquals("",ordVal.getStatus().trim());

	}

}
