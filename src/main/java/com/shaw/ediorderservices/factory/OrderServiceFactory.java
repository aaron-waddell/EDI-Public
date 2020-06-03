package com.shaw.ediorderservices.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.shaw.ediorderservices.service.OrderService;

@Component
public class OrderServiceFactory implements IFactory{

	@Autowired
	@Qualifier("samplesOrderService")
	private OrderService samplesOrderService;

	@Autowired
	@Qualifier("hardsurfacesOrderService")
	private OrderService hardsurfacesOrderService;
	
	public  OrderServiceFactory() {
		// TODO Auto-generated constructor stub
	}

	public OrderService getInstance(String orderType)
	{
		switch (orderType) {
		case "SAMPLES":
			return samplesOrderService;
		case "HARDSURFACES":
			return hardsurfacesOrderService;

		default:
			throw new UnsupportedOperationException("Unsupported OrderType: " + orderType);
		}
	}
}
