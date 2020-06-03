package com.shaw.ediorderservices.persistance.db2.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderLine;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderLine.EdiOrderLinePK;

public interface EdiOrderLineRepository extends PagingAndSortingRepository<EdiOrderLine, EdiOrderLinePK> {

}
