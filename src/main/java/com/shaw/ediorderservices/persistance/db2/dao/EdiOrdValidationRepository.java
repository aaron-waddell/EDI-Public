package com.shaw.ediorderservices.persistance.db2.dao;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.shaw.ediorderservices.persistance.db2.entity.EdiOrdValidation;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrdValidation.EdiOrdValidationPK;

@Repository
public interface EdiOrdValidationRepository extends JpaRepository<EdiOrdValidation,EdiOrdValidationPK> 
{

	@Transactional(propagation = Propagation.REQUIRED)
	@Modifying(flushAutomatically = true)
	@Query("update EdiOrdValidation v set v.status = :status where id.ediOrderNbr = :ediOrderNbr")
	int updateStatusByIdEdiOrderNbr(@Param("status")String status, @Param("ediOrderNbr") long ediOrderNbr);

	List<EdiOrdValidation> findByIdEdiOrderNbr(long ediOrderNbr);

	@Transactional(propagation = Propagation.REQUIRED)
	@Modifying(flushAutomatically = true)
	Integer deleteByIdEdiOrderNbr(long ediOrderNbr);

	@Procedure(name = "validationProcedure")
	@Modifying(flushAutomatically = true)
    Map<String, String> validateEdiOrder(
    		 @Param("in_edi_order_nbr")long ediOrderNbr
			,@Param("in_default_action") String defaultAction);

	@Procedure(name = "preorderUpdateProcedure")
	@Modifying(flushAutomatically = true)
    Map<String, String> preorderUpdate(@Param("in_edi_order_nbr")long ediOrderNbr);
	
}
