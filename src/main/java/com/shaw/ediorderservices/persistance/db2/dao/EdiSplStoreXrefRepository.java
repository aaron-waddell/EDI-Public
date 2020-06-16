package com.shaw.ediorderservices.persistance.db2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shaw.ediorderservices.persistance.db2.entity.EdiSplStoreXref;
import com.shaw.ediorderservices.persistance.db2.entity.EdiSplStoreXref.EdiSplStoreXrefPK;

@Repository
public interface EdiSplStoreXrefRepository extends JpaRepository<EdiSplStoreXref,EdiSplStoreXrefPK>
{

	List<EdiSplStoreXref> findByIdCustCodeAndIdOrderingSys(String custCode, String orderingSys);

}
