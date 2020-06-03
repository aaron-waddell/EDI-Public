package com.shaw.ediorderservices.persistance.db2.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.shaw.ediorderservices.exception.ResourceNotFoundException;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderHeader;

public interface EdiOrderHeaderRepository extends PagingAndSortingRepository<EdiOrderHeader, Long> {

	public default EdiOrderHeader getHeader(Long id)
	{
		EdiOrderHeader legacyHeader = getHeaderDates(id).orElseThrow(()->new ResourceNotFoundException("legacy header"));
		legacyHeader = getHeaderLines(id).orElseThrow(()->new ResourceNotFoundException("legacy header"));
		return legacyHeader;		
	}
	
	@Query("SELECT oh FROM EdiOrderHeader oh LEFT JOIN FETCH oh.dates WHERE oh.legacyOrderNumber = :id")
	Optional<EdiOrderHeader> getHeaderDates(Long id);
	
	@Query("SELECT oh FROM EdiOrderHeader oh JOIN FETCH oh.lines WHERE oh.legacyOrderNumber = :id")
	Optional<EdiOrderHeader> getHeaderLines(Long id);

	@Transactional(propagation = Propagation.REQUIRED)
	@Modifying @Query(name = "EdiOrderHeader.updateAgent")
	int updateAgent(long ediOrderNbr, String status,
			String desc, String agent);

	Optional<EdiOrderHeader> findFirstByOrderType(String orderType);

}
