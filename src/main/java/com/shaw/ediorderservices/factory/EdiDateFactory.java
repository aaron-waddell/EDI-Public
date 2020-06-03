package com.shaw.ediorderservices.factory;

import org.springframework.stereotype.Component;

import com.shaw.ediorderservices.persistance.sqlserver.entity.CancelDate;
import com.shaw.ediorderservices.persistance.sqlserver.entity.GenericDate;
import com.shaw.ediorderservices.persistance.sqlserver.entity.IEdiDate;
import com.shaw.ediorderservices.persistance.sqlserver.entity.PoDate;
import com.shaw.ediorderservices.persistance.sqlserver.entity.ShipDate;

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
