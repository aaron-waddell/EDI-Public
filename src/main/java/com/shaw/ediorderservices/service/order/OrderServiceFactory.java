package com.shaw.ediorderservices.service.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.shaw.ediorderservices.factory.IFactory;

@Component
public class OrderServiceFactory implements IFactory{

	@Autowired
	@Qualifier("samplesOrderService")
	private OrderService samplesOrderService;

	@Autowired
	@Qualifier("unitsOrderService")
	private OrderService unitsOrderService;
	
	public  OrderServiceFactory() {
		// TODO Auto-generated constructor stub
	}

	public OrderService getInstance(String orderType)
	{
		switch (orderType) {
		case "SAMPLES":
			return samplesOrderService;
		case "UNITS":
			return unitsOrderService;

		default:
			throw new UnsupportedOperationException("Unsupported OrderType: " + orderType);
		}
	}
}
