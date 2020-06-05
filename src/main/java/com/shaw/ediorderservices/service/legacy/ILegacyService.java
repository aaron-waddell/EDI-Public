package com.shaw.ediorderservices.service.legacy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.shaw.ediorderservices.IOperations;
import com.shaw.ediorderservices.exception.ResourceNotFoundException;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderHeader;

public interface ILegacyService extends IOperations<EdiOrderHeader> {

	final static Logger logger = LoggerFactory.getLogger(ILegacyService.class);

	void createLegacyOrder();

	void convertLegacyOrder();

	void getOrder(long ediOrderNbr) throws ResourceNotFoundException;

//	OrderHeader getOrderView(String orderNbr) throws ResourceNotFoundException;

	void updateOrderHeader(String shawOrderNbr);

}
