package com.shaw.ediorderservices.service.csws;

import com.shaw.ediorderservices.csws.Cart;
import com.shaw.ediorderservices.csws.Order;
import com.shaw.ediorderservices.csws.OrderViewResponse;
import com.shaw.ediorderservices.exception.ResourceNotFoundException;

public interface ICSWSService {

	Order place();

	OrderViewResponse getOrderView(String orderNbr) throws ResourceNotFoundException;

	Cart createCart();
	
}