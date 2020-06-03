package com.shaw.ediorderservices.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.shaw.ediorderservices.service.ICSWSService;

@Component
public class CSWSServiceFactory implements IFactory {

	@Autowired
	@Qualifier("cswsSamplesService")
	ICSWSService cswsSamplesService;

	@Autowired
	@Qualifier("cswsHardsurfacesService")
	ICSWSService cswsHardsurfacesService;
	
	public  CSWSServiceFactory() {
		// TODO Auto-generated constructor stub
	}

	public ICSWSService getInstance(String orderType)
	{
		switch (orderType) {
		case "SAMPLES":
			return cswsSamplesService;
		case "HARDSURFACES":
			return cswsHardsurfacesService;

		default:
			throw new UnsupportedOperationException("Unsupported OrderType: " + orderType);
		}
	}
}
