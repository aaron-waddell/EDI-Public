package com.shaw.ediorderservices.persistance.db2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shaw.ediorderservices.persistance.db2.entity.EdiCustCode;
import com.shaw.ediorderservices.persistance.db2.entity.EdiCustCode.EdiCustCodePK;

@Repository
public interface EdiCustCodeRepository extends JpaRepository<EdiCustCode,EdiCustCodePK> 
{
	
}
