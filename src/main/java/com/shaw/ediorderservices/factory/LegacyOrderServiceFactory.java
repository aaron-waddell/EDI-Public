package com.shaw.ediorderservices.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.shaw.ediorderservices.service.OrderService;
import com.shaw.ediorderservices.service.impl.LegacyService;

@Component
public class LegacyOrderServiceFactory implements IFactory{

	@Autowired
	@Qualifier("samplesLegacyService")
	private LegacyService samplesLegacyService;

	@Autowired
	@Qualifier("hardsurfacesLegacyService")
	private LegacyService hardsurfacesLegacyService;
	
	public  LegacyOrderServiceFactory() {
		// TODO Auto-generated constructor stub
	}

	public LegacyService getInstance(String orderType)
	{
		switch (orderType) {
		case "SAMPLES":
			return samplesLegacyService;
		case "HARDSURFACES":
			return hardsurfacesLegacyService;

		default:
			throw new UnsupportedOperationException("Unsupported OrderType: " + orderType);
		}
	}
}
