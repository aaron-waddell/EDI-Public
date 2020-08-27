package com.shaw.ediorderservices.service.legacy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.shaw.ediorderservices.factory.IFactory;

@Component
public class LegacyServiceFactory implements IFactory{

	@Autowired
	@Qualifier("samplesLegacyService")
	private LegacyService samplesLegacyService;

	@Autowired
	@Qualifier("unitsLegacyService")
	private LegacyService unitsLegacyService;
	
	public  LegacyServiceFactory() {
		// TODO Auto-generated constructor stub
	}

	public LegacyService getInstance(String orderType)
	{
		switch (orderType) {
		case "SAMPLES":
			return samplesLegacyService;
		case "UNITS":
			return unitsLegacyService;

		default:
			throw new UnsupportedOperationException("Unsupported OrderType: " + orderType);
		}
	}
}
