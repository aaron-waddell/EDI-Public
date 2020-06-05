package com.shaw.ediorderservices.persistance.sqlserver.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.lang.Nullable;

import com.shaw.ediorderservices.persistance.AuditableEntity;

@Entity @Table(schema = "CSD")
@EntityListeners(AuditingEntityListener.class)
public class EdiValidation  extends AuditableEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name="ACTION_CODE", nullable=false, length=10)
	@ColumnDefault("")
	private String actionCode;

	@Column(name="ASSIGNED_TO", nullable=false, length=10)
	@ColumnDefault("")
	private String assignedTo;

	@Column(nullable = false)
	@ColumnDefault("")
	private String description;

	@Column(nullable=false, length=1)
	@ColumnDefault("")
	private String status;
	
	@Nullable
	@ManyToOne
	private volatile EdiLine ediLine;

	@Nullable
	@ManyToOne
	private volatile EdiOrder ediOrder;

	public EdiValidation() {
		// TODO Auto-generated constructor stub
	}

	public EdiValidation(String description, String status) {
		super();
		this.description = description;
		this.actionCode = status;
		this.status = status;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getActionCode() {
		return actionCode;
	}

	public void setActionCode(String actionCode) {
		this.actionCode = actionCode;
	}

	public String getAssignedTo() {
		return assignedTo;
	}

	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public EdiLine getEdiLine() {
		return ediLine;
	}

	public void setEdiLine(EdiLine ediLine) {
		this.ediLine = ediLine;
	}

	public EdiOrder getEdiOrder() {
		return ediOrder;
	}

	public void setEdiOrder(EdiOrder ediOrder) {
		this.ediOrder = ediOrder;
	}

	@Override
	public String toString() {
		return "EdiLineValidation [id=" + id + ", actionCode=" + actionCode + ", assignedTo=" + assignedTo
				+ ", description=" + description + ", status=" + status + ", ediLine=" + ediLine + "]";
	}

}
