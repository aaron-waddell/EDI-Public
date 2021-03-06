package com.shaw.ediorderservices.service.audit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.shaw.ediorderservices.IOperations;
import com.shaw.ediorderservices.persistance.db2.entity.EdiAudit;

public interface IAuditService extends IOperations<EdiAudit> {

	final static Logger logger = LoggerFactory.getLogger(IAuditService.class);

	void createCarrierAudit(boolean callManh);
	
}
