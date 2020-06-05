package com.shaw.ediorderservices.factory;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.shaw.ediorderservices.helper.MockTest;
import com.shaw.ediorderservices.persistance.sqlserver.entity.order.OrderType;
import com.shaw.ediorderservices.service.csws.CSWSHardsurfacesService;
import com.shaw.ediorderservices.service.csws.CSWSSamplesService;
import com.shaw.ediorderservices.service.csws.CSWSServiceFactory;
import com.shaw.ediorderservices.service.csws.ICSWSService;

@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
@ExtendWith(SpringExtension.class)
class CSWSServiceFactoryTest extends MockTest {

	@Autowired
	CSWSServiceFactory cswsServiceFactory;
	
	@Test
	void test() {
		ICSWSService s = cswsServiceFactory.getInstance(OrderType.SAMPLES.toString());
		assertTrue(s.getClass().getSimpleName().contains(CSWSSamplesService.class.getSimpleName()));
		
		//TODO check validations
		assertNotNull(s.toString());

		s = cswsServiceFactory.getInstance(OrderType.HARDSURFACES.toString());
		assertTrue(s.getClass().getSimpleName().contains(CSWSHardsurfacesService.class.getSimpleName()));
		assertNotNull(s.toString());
		
		assertThrows(UnsupportedOperationException.class, ()->cswsServiceFactory.getInstance(OrderType.CARPET.toString()));
	}

}
