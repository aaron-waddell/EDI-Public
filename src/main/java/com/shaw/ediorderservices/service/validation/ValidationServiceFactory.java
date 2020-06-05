package com.shaw.ediorderservices.service.validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.shaw.ediorderservices.factory.IFactory;

@Component
public class ValidationServiceFactory implements IFactory {

	@Autowired
	@Qualifier("samplesValidationService")
	private ValidationService samplesValidationService;

	@Autowired
	@Qualifier("hardsurfacesValidationService")
	private ValidationService hardsurfacesValidationService;
	
	public  ValidationServiceFactory() {
		// TODO Auto-generated constructor stub
	}

	public ValidationService getInstance(String orderType)
	{
		switch (orderType) {
		case "SAMPLES":
			return samplesValidationService;
		case "HARDSURFACES":
			return hardsurfacesValidationService;

		default:
			throw new UnsupportedOperationException("Unsupported OrderType: " + orderType);
		}
	}
}
