package com.shaw.ediorderservices.persistance.db2.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.shaw.ediorderservices.persistance.db2.entity.EdiAudit;

public interface EdiAuditRepository extends PagingAndSortingRepository<EdiAudit, Long> {

}
