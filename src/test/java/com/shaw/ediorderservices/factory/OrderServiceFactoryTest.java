package com.shaw.ediorderservices.factory;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.shaw.ediorderservices.enums.OrderType;
import com.shaw.ediorderservices.helper.MockTest;
import com.shaw.ediorderservices.service.OrderService;
import com.shaw.ediorderservices.service.impl.HardsurfacesOrderService;
import com.shaw.ediorderservices.service.impl.SamplesOrderService;

@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
@ExtendWith(SpringExtension.class)
class OrderServiceFactoryTest extends MockTest {

	@Autowired
	OrderServiceFactory orderServiceFactory;
	
//	@MockBean
//	EdiOrdValidationRepository ediOrdValidationRepository;
	
	@Test
	void testGetInstance() {
//		when(ediOrdValidationRepository.validateEdiOrder(any(long.class), anyString())).thenReturn(validationMap);
		OrderService s = orderServiceFactory.getInstance(OrderType.SAMPLES.toString());
		assertTrue(s.getClass().getSimpleName().contains(SamplesOrderService.class.getSimpleName()));
		
		s = orderServiceFactory.getInstance(OrderType.HARDSURFACES.toString());
		assertTrue(s.getClass().getSimpleName().contains(HardsurfacesOrderService.class.getSimpleName()));
		
		assertThrows(UnsupportedOperationException.class, ()->orderServiceFactory.getInstance(OrderType.CARPET.toString()));
	}

}
