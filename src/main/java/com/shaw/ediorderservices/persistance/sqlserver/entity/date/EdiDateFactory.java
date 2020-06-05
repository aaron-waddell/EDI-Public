package com.shaw.ediorderservices.persistance.sqlserver.entity.date;

import org.springframework.stereotype.Component;

import com.shaw.ediorderservices.factory.IFactory;

@Component
public class EdiDateFactory implements IFactory {

	public  EdiDateFactory() {
		// TODO Auto-generated constructor stub
	}

	public IEdiDate getInstance(String orderType)
	{
		switch (orderType) {
		case "SHIP":
			return new ShipDate();
		case "PO":
			return new PoDate();
		case "CANCEL":
			return new CancelDate();

		default:
			
			return new GenericDate();
		}
	}
}
