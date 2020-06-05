package com.shaw.ediorderservices.service.csws;

import com.shaw.ediorderservices.csws.Order;
import com.shaw.ediorderservices.csws.OrderHeader;
import com.shaw.ediorderservices.exception.ResourceNotFoundException;

public interface ICSWSService {

	Order place();

	OrderHeader getOrderView(String orderNbr) throws ResourceNotFoundException;
	
}