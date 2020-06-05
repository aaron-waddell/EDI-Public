package com.shaw.ediorderservices.persistance.db2.dao;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shaw.ediorderservices.helper.MockTest;
import com.shaw.ediorderservices.persistance.db2.entity.EdiReasonCode;

import net.sf.ehcache.CacheManager;

@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
class EdiReasonCodeRepositoryTest extends MockTest {

	final static Logger logger = LoggerFactory.getLogger(EdiReasonCodeRepositoryTest.class);

	@Autowired
	EdiReasonCodeRepository ediReasonCodeRepository;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	@Disabled
	void testCache() {
		EdiReasonCode code = ediReasonCodeRepository.findById(63).orElse(null);
		logger.info(code.toString());
		int size = CacheManager.ALL_CACHE_MANAGERS.get(0)
		  .getCache("com.shaw.ediorderservices.persistance.db2.entity.EdiReasonCode").getSize();
		assertNotEquals(size, 0);
	}
}
