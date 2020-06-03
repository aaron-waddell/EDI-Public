package com.shaw.ediorderservices.factory;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shaw.ediorderservices.enums.OrderType;
import com.shaw.ediorderservices.helper.MockTest;
import com.shaw.ediorderservices.service.ValidationService;
import com.shaw.ediorderservices.service.impl.HardsurfacesValidationService;
import com.shaw.ediorderservices.service.impl.SamplesValidationService;

@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
class ValidationServiceFactoryTest extends MockTest {

	@Autowired
	ValidationServiceFactory factory;

	@Test
	final void testGetInstance() {
		ValidationService s = factory.getInstance(OrderType.SAMPLES.toString());
		assertTrue(s.getClass().getSimpleName().contains(SamplesValidationService.class.getSimpleName()));
		
		s = factory.getInstance(OrderType.HARDSURFACES.toString());
		assertTrue(s.getClass().getSimpleName().contains(HardsurfacesValidationService.class.getSimpleName()));
		
		assertThrows(UnsupportedOperationException.class, ()->factory.getInstance(OrderType.CARPET.toString()));
	}

}
