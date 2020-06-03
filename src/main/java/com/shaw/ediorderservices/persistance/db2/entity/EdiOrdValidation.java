package com.shaw.ediorderservices.persistance.db2.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Comparator;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;


/**
 * The persistent class for the EDI_ORD_VALIDATION database table.
 * 
 */
@Entity
@Table(name="EDI_ORD_VALIDATION")
@NamedQuery(name="EdiOrdValidation.findAll", query="SELECT e FROM EdiOrdValidation e")
@NamedStoredProcedureQuery(name = "validationProcedure", 
procedureName = "SHXP.OWSNP094SEDI_UPDT_VALIDATEORD", parameters = {
  @StoredProcedureParameter(mode = ParameterMode.IN, name = "in_edi_order_nbr", type = Long.class),
  @StoredProcedureParameter(mode = ParameterMode.IN, name = "in_default_action", type = String.class),
  @StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_ret_code", type = String.class),
  @StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_ret_desc", type = String.class),
  @StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_error_cd", type = String.class),
  @StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_error_msg", type = String.class)})

@NamedStoredProcedureQuery(name = "preorderUpdateProcedure", 
procedureName = "SHXP.OWSNP098SEDI_UPDT_PREORDER", parameters = {
  @StoredProcedureParameter(mode = ParameterMode.IN, name = "in_edi_order_nbr", type = Long.class),
  @StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_error_code", type = String.class),
  @StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_error_msg", type = String.class)})

public class EdiOrdValidation implements Serializable {
	private static final long serialVersionUID = 1L;

	public static Comparator<EdiOrdValidation> comparator = new Comparator<EdiOrdValidation>() {
		@Override
		public int compare(EdiOrdValidation o1, EdiOrdValidation o2) {
			if (o1==null || o2==null)
				return 0;
			return o1.actionCode.compareTo(o2.actionCode); //reverse order so lowest first
		}
	};

	/**
	 * The primary key class for the EDI_ORD_VALIDATION database table.
	 * 
	 */
	@Embeddable
	public static class EdiOrdValidationPK implements Serializable {
		//default serial version id, required for serializable classes.
		private static final long serialVersionUID = 1L;

		@Column(name="EDI_ORDER_NBR", updatable=false, nullable=false, precision=10)
		private long ediOrderNbr;

		@Column(name="PO_LINE_NBR", updatable=false, nullable=false, length=6)
		private String poLineNbr;

		@Column(name="TIME_STAMP",  updatable=false, nullable=false, insertable = false)
		private LocalDateTime timeStamp;

		public EdiOrdValidationPK() {
		}

		public EdiOrdValidationPK(long ediOrderNumber, String poLineNbr) {
			this();
			this.ediOrderNbr = ediOrderNumber;
			this.poLineNbr = poLineNbr;
			this.timeStamp = LocalDateTime.now();
//			try {Thread.sleep(100);} catch (InterruptedException e) {}
		}
		public long getEdiOrderNbr() {
			return this.ediOrderNbr;
		}
		public void setEdiOrderNbr(long ediOrderNbr) {
			this.ediOrderNbr = ediOrderNbr;
		}
		public String getPoLineNbr() {
			return this.poLineNbr;
		}
		public void setPoLineNbr(String poLineNbr) {
			this.poLineNbr = poLineNbr;
		}
		public LocalDateTime getTimeStamp() {
			return this.timeStamp;
		}
		public void setTimeStamp(LocalDateTime timeStamp) {
			this.timeStamp = timeStamp;
		}

		public boolean equals(Object other) {
			if (this == other) {
				return true;
			}
			if (!(other instanceof EdiOrdValidationPK)) {
				return false;
			}
			EdiOrdValidationPK castOther = (EdiOrdValidationPK)other;
			return 
				(this.ediOrderNbr == castOther.ediOrderNbr)
				&& this.poLineNbr.equals(castOther.poLineNbr)
				&& this.timeStamp.equals(castOther.timeStamp);
		}

		public int hashCode() {
			final int prime = 31;
			int hash = 17;
			hash = hash * prime + ((int) (this.ediOrderNbr ^ (this.ediOrderNbr >>> 32)));
			hash = hash * prime + this.poLineNbr.hashCode();
			hash = hash * prime + this.timeStamp.hashCode();
			
			return hash;
		}
	}
	
	@EmbeddedId
	private EdiOrdValidationPK id;

	@Column(name="ACTION_CODE", nullable=false, length=10)
	@ColumnDefault("")
	private String actionCode;

	@Column(name="ASSIGNED_TO", nullable=false, length=10)
	@ColumnDefault("")
	private String assignedTo;

	@Column(name="CHANGED_BY", nullable=false, length=10)
	@ColumnDefault("")
	private String changedBy;

	@Column(name="CHANGED_TIMESTAMP")
	private LocalDateTime changedTimestamp;

	@Column(name="CREATED_BY", nullable=false, length=10)
	@ColumnDefault("")
	private String createdBy;

	@Column(name="CREATED_TIMESTAMP", nullable=false, insertable = false)
	@ColumnDefault("CURRENT_TIMESTAMP")
	private LocalDateTime createdTimestamp;

//	@Column(name="RULE_ID", precision=5)
//	@ColumnDefault("0")
//	private Integer ruleId;

	@Column(nullable=false, length=1)
	@ColumnDefault("")
	private String status;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "edi_reason_code")
	EdiReasonCode ediReasonCode;
	
	public EdiOrdValidation() {
	}

//	public EdiOrdValidation(EdiValidationException ve) {
//		this();
//		EdiOrdValidationPK id = new EdiOrdValidationPK(ve.getEdiOrderNbr(),ve.getPoLineNbr());
//		this.id = id;
//		this.status = ve.getActionCode();
//		this.createdBy = "EDIS";
//		this.assignedTo = ve.getAssignedTo();
//		this.actionCode = ve.getActionCode();
//		this.ruleId = ve.getRuleId();
//		this.ediReasonCode = ve.getEdiReasonCode();
//	}

	public EdiOrdValidation(long legacyId, EdiReasonCode rule) {
		this.id = new EdiOrdValidationPK(legacyId, "0");
		this.status = rule.getDefaultAction();
		this.createdBy = "EDIS";
		this.assignedTo = "";
		this.actionCode = rule.getDefaultAction();
		this.ediReasonCode = rule;
	}

	public EdiOrdValidationPK getId() {
		return this.id;
	}

	public void setId(EdiOrdValidationPK id) {
		this.id = id;
	}

	public String getActionCode() {
		return this.actionCode;
	}

	public void setActionCode(String actionCode) {
		this.actionCode = actionCode;
	}

	public String getAssignedTo() {
		return this.assignedTo;
	}

	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}

	public String getChangedBy() {
		return this.changedBy;
	}

	public void setChangedBy(String changedBy) {
		this.changedBy = changedBy;
	}

	public LocalDateTime getChangedTimestamp() {
		return this.changedTimestamp;
	}

	public void setChangedTimestamp(LocalDateTime changedTimestamp) {
		this.changedTimestamp = changedTimestamp;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDateTime getCreatedTimestamp() {
		return this.createdTimestamp;
	}

	public void setCreatedTimestamp(LocalDateTime createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}

	public EdiReasonCode getEdiReasonCode() {
		return this.ediReasonCode;
	}

	public void setEdiReasonCode(EdiReasonCode ediReasonCode) {
		this.ediReasonCode = ediReasonCode;
	}

//	public int getRuleId() {
//		return this.ruleId;
//	}
//
//	public void setRuleId(int ruleId) {
//		this.ruleId = ruleId;
//	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "EdiOrdValidation [id=" + id + ", actionCode=" + actionCode + ", assignedTo=" + assignedTo
				+ ", changedBy=" + changedBy + ", changedTimestamp=" + changedTimestamp + ", createdBy=" + createdBy
				+ ", createdTimestamp=" + createdTimestamp + ", status=" + status
				+ ", ediReasonCode=" + ediReasonCode.getEdiReasonCode() + "]";
	}

}