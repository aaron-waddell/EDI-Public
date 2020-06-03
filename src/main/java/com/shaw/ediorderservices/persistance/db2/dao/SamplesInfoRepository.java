package com.shaw.ediorderservices.persistance.db2.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.shaw.ediorderservices.persistance.db2.entity.SamplesInfo;

public interface SamplesInfoRepository extends JpaRepository<SamplesInfo, Long> {

	@Query(name = "getSamplesInfo")
	Optional<SamplesInfo> getSamplesInfo(String itemNbr);

	@Query(name = "checkValidSKU")
	List<String> checkValidSKU(String sellStyle, String sellColor, String custCode, String orderingSys);
}
