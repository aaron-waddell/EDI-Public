package com.shaw.ediorderservices.persistance.db2.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Immutable;
import org.springframework.lang.Nullable;


/**
 * The persistent class for the EDI_REASON_CODE database table.
 * 
 */
@Entity
@Immutable @Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
@Table(name="EDI_REASON_CODE")
@NamedQuery(name="EdiReasonCode.findAll", query="SELECT e FROM EdiReasonCode e")
public class EdiReasonCode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="EDI_REASON_CODE", unique=true, nullable=false)
	private int ediReasonCode;

	@Column(name="AUTO_CREATE_FLAG", nullable=false, length=1)
	private String autoCreateFlag;

	@Column(name="CHANGE_TIMESTAMP", nullable=false)
	private LocalDateTime changeTimestamp;

	@Column(name="CHANGED_BY", nullable=false, length=8)
	private String changedBy;

	@Column(name="CREATE_TIMESTAMP", nullable=false)
	private LocalDateTime createTimestamp;

	@Column(name="CREATED_BY", nullable=false, length=8)
	private String createdBy;

	@Column(name="DEFAULT_ACTION", nullable=false, length=1)
	private String defaultAction;

	@Column(nullable=false, length=50)
	private String description;

	@Column(name="LEVEL", nullable=false, length=1)
	private String level;

	@Column(nullable=false, precision=3)
	private Double precedence;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "ediReasonCode")
	@Nullable
	List<EdiOrdValidation> ediOrdValidations;
	
	public EdiReasonCode() {
	}

	public int getEdiReasonCode() {
		return this.ediReasonCode;
	}

	public void setEdiReasonCode(int ediReasonCode) {
		this.ediReasonCode = ediReasonCode;
	}

	public String getAutoCreateFlag() {
		return this.autoCreateFlag;
	}

	public void setAutoCreateFlag(String autoCreateFlag) {
		this.autoCreateFlag = autoCreateFlag;
	}

	public LocalDateTime getChangeTimestamp() {
		return this.changeTimestamp;
	}

	public void setChangeTimestamp(LocalDateTime changeTimestamp) {
		this.changeTimestamp = changeTimestamp;
	}

	public String getChangedBy() {
		return this.changedBy;
	}

	public void setChangedBy(String changedBy) {
		this.changedBy = changedBy;
	}

	public LocalDateTime getCreateTimestamp() {
		return this.createTimestamp;
	}

	public void setCreateTimestamp(LocalDateTime createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getDefaultAction() {
		return this.defaultAction;
	}

	public void setDefaultAction(String defaultAction) {
		this.defaultAction = defaultAction;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLevel() {
		return this.level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public Double getPrecedence() {
		return this.precedence;
	}

	public void setPrecedence(Double precedence) {
		this.precedence = precedence;
	}

}