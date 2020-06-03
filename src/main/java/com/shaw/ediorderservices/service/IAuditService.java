package com.shaw.ediorderservices.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.shaw.ediorderservices.IOperations;
import com.shaw.ediorderservices.persistance.db2.entity.EdiAudit;
import com.shaw.ediorderservices.persistance.db2.entity.EdiShipInfo;

public interface IAuditService extends IOperations<EdiAudit> {

	final static Logger logger = LoggerFactory.getLogger(IAuditService.class);

	void createCarrierAudit(boolean callManh);
	
}
