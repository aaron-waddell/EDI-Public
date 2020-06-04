package com.shaw.ediorderservices.persistance.db2.dao;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.shaw.ediorderservices.persistance.db2.entity.EdiAudit;

public interface EdiAuditRepository extends PagingAndSortingRepository<EdiAudit, Long> {

	List<EdiAudit> findByEdiOrderNumber(long ediOrderNumber);
	
}
