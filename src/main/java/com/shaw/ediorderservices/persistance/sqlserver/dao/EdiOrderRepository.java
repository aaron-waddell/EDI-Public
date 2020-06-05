package com.shaw.ediorderservices.persistance.sqlserver.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.shaw.ediorderservices.persistance.sqlserver.entity.order.EdiOrder;

public interface EdiOrderRepository extends PagingAndSortingRepository<EdiOrder, Long> {

}
