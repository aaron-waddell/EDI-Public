package com.shaw.ediorderservices.persistance.sqlserver.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.shaw.ediorderservices.persistance.sqlserver.entity.date.EdiDate;

public interface EdiDateRepository extends PagingAndSortingRepository<EdiDate, Long> {

}
