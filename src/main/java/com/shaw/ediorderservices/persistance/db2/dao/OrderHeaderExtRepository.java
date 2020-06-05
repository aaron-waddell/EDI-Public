package com.shaw.ediorderservices.persistance.db2.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.shaw.ediorderservices.persistance.db2.entity.OrderHeaderExt;

public interface OrderHeaderExtRepository extends PagingAndSortingRepository<OrderHeaderExt, String> {

}
