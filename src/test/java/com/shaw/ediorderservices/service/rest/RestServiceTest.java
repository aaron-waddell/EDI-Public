package com.shaw.ediorderservices.service.rest;

import static org.junit.jupiter.api.Assertions.fail;

import java.net.URI;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.shaw.ediorderservices.helper.MockTest;
import com.shaw.ediorderservices.service.EdiOrderBean;
import com.shaw.ediorderservices.service.common.IEntityBody;

@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
@ExtendWith(SpringExtension.class)
@Disabled
class RestServiceTest extends MockTest {

	final static Logger logger = LoggerFactory.getLogger(RestServiceTest.class);

	private static final URI uri = null;

	@Autowired
	protected EdiOrderBean ediOrderBean;
	
	@MockBean
	RestService restService;

	@Test
	final void testPostForObjectURIIEntityBody() {
		String result = restService.postForObject(uri, new IEntityBody() {
		});
		logger.info(result);
	}

	@Test
	final void testPutForObject() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	final void testPostForObjectURI() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	final void testGetForObject() {
		fail("Not yet implemented"); // TODO
	}

}
