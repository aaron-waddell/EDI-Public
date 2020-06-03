package com.shaw.ediorderservices.persistance.db2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shaw.ediorderservices.persistance.db2.entity.EdiReasonCode;

@Repository
public interface EdiReasonCodeRepository extends JpaRepository<EdiReasonCode,Integer> 
{

}
