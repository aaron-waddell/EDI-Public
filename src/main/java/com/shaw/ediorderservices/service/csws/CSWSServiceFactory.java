package com.shaw.ediorderservices.service.csws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.shaw.ediorderservices.factory.IFactory;

@Component
public class CSWSServiceFactory implements IFactory {

	@Autowired
	@Qualifier("samplesCswsService")
	CSWSService samplesCswsService;

	@Autowired
//	@Qualifier("hardsurfacesCswsService")
	CSWSService hardsurfacesCswsService;
	
	public  CSWSServiceFactory() {
		// TODO Auto-generated constructor stub
	}

	public ICSWSService getInstance(String orderType)
	{
		switch (orderType) {
		case "SAMPLES":
			return samplesCswsService;
		case "HARDSURFACES":
			return hardsurfacesCswsService;

		default:
			throw new UnsupportedOperationException("Unsupported OrderType: " + orderType);
		}
	}
}
