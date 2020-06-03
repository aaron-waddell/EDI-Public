package com.shaw.ediorderservices.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.shaw.ediorderservices.mapping.AuditMapper;
import com.shaw.ediorderservices.persistance.db2.dao.EdiAuditRepository;
import com.shaw.ediorderservices.persistance.db2.entity.EdiAudit;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderHeader;
import com.shaw.ediorderservices.persistance.sqlserver.entity.EdiOrder;
import com.shaw.ediorderservices.service.EdiOrderBean;
import com.shaw.ediorderservices.service.IAuditService;
import com.shaw.ediorderservices.service.common.AbstractService;

public class AuditService extends AbstractService<EdiAudit> implements IAuditService {

	@Autowired
	EdiAuditRepository ediAuditRepository;
	
	@Autowired
	AuditMapper auditMapper;
	
	@Autowired
	EdiOrderBean ediOrderBean;
	
	@Override
	public void createCarrierAudit(boolean callManh) {
		EdiOrder ediOrder = ediOrderBean.getEdiOrder();
		EdiAudit ediAudit = auditMapper.ediOrderToEdiAudit(ediOrder);

        String carrCode = ediOrder.getCarrierCode();

        String auditCarrFrom = "";
		if (!callManh && carrCode.equals("99"))
        {
			auditCarrFrom  = "DEFAULT";        	      	
        }
        else if (!callManh)
        {
			auditCarrFrom = "PROFILE";        	      	
        }
        else if (callManh && carrCode.equals("99"))
        {
			auditCarrFrom = "DEFAULT-M";        	      	
        }
        else  // (callManh)
        {
			auditCarrFrom = "MANHATTAN";
        }
		
		EdiOrderHeader header = ediOrderBean.getLegacyHeader();
		String auditMsg = "CARRIER: " + ediOrder.getCarrierCode()
        + " / ORDERING LOC: " + header.getOrderLoc()
        + " / FRT CODE: " + ediOrder.getFreightType() + " " + auditCarrFrom;
		ediAudit.setAuditMsg(auditMsg);
		ediAuditRepository.save(ediAudit); 
	}

	@Override
	protected PagingAndSortingRepository<EdiAudit, Long> getDao() {
		// TODO Auto-generated method stub
		return null;
	}

}
