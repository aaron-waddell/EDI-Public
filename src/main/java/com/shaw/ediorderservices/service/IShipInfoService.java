package com.shaw.ediorderservices.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.shaw.ediorderservices.IOperations;
import com.shaw.ediorderservices.persistance.db2.entity.EdiShipInfo;

public interface IShipInfoService extends IOperations<EdiShipInfo> {

	final static Logger logger = LoggerFactory.getLogger(IShipInfoService.class);

	void createShipInfo();
	
}
