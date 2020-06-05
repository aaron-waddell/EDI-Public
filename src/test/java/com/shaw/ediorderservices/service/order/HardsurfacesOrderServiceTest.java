package com.shaw.ediorderservices.service.order;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.shaw.ediorderservices.helper.MockTest;

@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
@ExtendWith(SpringExtension.class)
class HardsurfacesOrderServiceTest extends MockTest {

	@Test
	void testSave() {
		fail("Not yet implemented");
	}

	@Test
	void testResubmit() {
		fail("Not yet implemented");
	}

	@Test
	void testConvert() {
		fail("Not yet implemented");
	}

	@Test
	void testGetDao() {
		fail("Not yet implemented");
	}

}
