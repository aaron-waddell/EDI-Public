package com.shaw.ediorderservices.persistance.db2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shaw.ediorderservices.persistance.db2.entity.EdiShipInfo;
import com.shaw.ediorderservices.persistance.db2.entity.EdiShipInfoLn;
import com.shaw.ediorderservices.persistance.db2.entity.EdiShipInfoLn.EdiShipInfoLnPK;

@Repository
public interface EdiShipInfoLnRepository extends JpaRepository<EdiShipInfoLn,EdiShipInfoLnPK> 
{
	List<EdiShipInfoLn> findAllByIdEdiShipInfo(EdiShipInfo ediShipInfo);
}
