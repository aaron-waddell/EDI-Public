package com.shaw.ediorderservices.persistance;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


/**
 * abstract entity with audit columns.
 * 
 */
@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
public abstract class AuditableEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CREATED_BY", nullable=false, updatable = false, length=10)
	@CreatedBy
	private String createdBy;

	@Column(name="CREATE_TIMESTAMP", nullable=false, updatable = false)
	@CreatedDate
	private LocalDateTime createTimestamp;

	@Column(name="CHANGED_BY", nullable=true, insertable = false, length=10)
	@LastModifiedBy
	private String changedBy;

	@Column(name="CHNG_TIMESTAMP", nullable=true, insertable = false)
	@LastModifiedDate
	private LocalDateTime changeTimestamp;

}