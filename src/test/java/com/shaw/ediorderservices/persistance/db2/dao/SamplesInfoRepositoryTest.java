package com.shaw.ediorderservices.persistance.db2.dao;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.shaw.ediorderservices.persistance.db2.entity.SamplesInfo;

class SamplesInfoRepositoryTest {

	private static final String ITEM_NBR = "0123400100";

	final static Logger logger = LoggerFactory.getLogger(SamplesInfoRepositoryTest.class);

	@Autowired
	SamplesInfoRepository samplesInfoRepository;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	@Disabled
	void testGetSamplesInfo() {
		SamplesInfo result = samplesInfoRepository.getSamplesInfo(ITEM_NBR).orElse(null);
		assertNotNull(result);
		logger.info(result.toString());

	}

}
