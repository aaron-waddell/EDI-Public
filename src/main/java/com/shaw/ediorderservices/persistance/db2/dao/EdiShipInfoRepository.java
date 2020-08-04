package com.shaw.ediorderservices.persistance.db2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shaw.ediorderservices.persistance.db2.entity.EdiShipInfo;
import com.shaw.ediorderservices.persistance.db2.entity.EdiShipInfo.EdiShipInfoPK;

@Repository
public interface EdiShipInfoRepository extends JpaRepository<EdiShipInfo,EdiShipInfoPK> 
{
	
}
