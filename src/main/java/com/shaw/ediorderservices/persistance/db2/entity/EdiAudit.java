package com.shaw.ediorderservices.persistance.db2.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.ColumnDefault;
import org.springframework.boot.context.properties.bind.DefaultValue;


/**
 * The persistent class for the EDI_AUDIT database table.
 * 
 */
@Entity
@Table(name="EDI_AUDIT")
@NamedQuery(name="EdiAudit.findAll", query="SELECT e FROM EdiAudit e")
public class EdiAudit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID", nullable=false, insertable = false, updatable = false)
	private Integer id;
	
	@Column(name="AUDIT_MSG", nullable=false, length=100)
	private String auditMsg;

	@Column(name="BILL_TO_STORE", nullable=false, length=10)
	private String billToStore;

	@Column(name="CHNG_FUNCTION", nullable=false, length=4)
	private String chngFunction;

	@Column(name="CHNG_LID", nullable=false, length=8)
	private String chngLid;

	@Column(name="CHNG_TIMESTAMP", nullable=false, insertable=false)
	@ColumnDefault( value = "CURRENT_TIMESTAMP" ) 
	private LocalDateTime chngTimestamp;

	@Column(name="CUSTOMER_CODE", nullable=false, length=2)
	private String customerCode;

	@Column(name="EDI_ORDER_NUMBER", nullable=false, precision=10)
	private long ediOrderNumber;

	@Column(name="LINE_NUMBER", nullable=false, precision=3)
	private long lineNumber;

	@Column(name="ORDER_DATE")
	private LocalDateTime orderDate;

	@Column(name="ORDER_NUMBER", nullable=false, length=6)
	private String orderNumber;

	@Column(name="ORDERING_SYS", nullable=false, length=2)
	private String orderingSys;

	@Column(name="PO_DATE")
	private LocalDate poDate;

	@Column(name="PO_LINE_NO", nullable=false, length=6)
	private String poLineNo;

	@Column(name="PO_NUMBER", nullable=false, length=22)
	private String poNumber;

	public EdiAudit() {
	}

	public String getAuditMsg() {
		return this.auditMsg;
	}

	public void setAuditMsg(String auditMsg) {
		this.auditMsg = auditMsg;
	}

	public String getBillToStore() {
		return this.billToStore;
	}

	public void setBillToStore(String billToStore) {
		this.billToStore = billToStore;
	}

	public String getChngFunction() {
		return this.chngFunction;
	}

	public void setChngFunction(String chngFunction) {
		this.chngFunction = chngFunction;
	}

	public String getChngLid() {
		return this.chngLid;
	}

	public void setChngLid(String chngLid) {
		this.chngLid = chngLid;
	}

	public LocalDateTime getChngTimestamp() {
		return this.chngTimestamp;
	}

	public void setChngTimestamp(LocalDateTime chngTimestamp) {
		this.chngTimestamp = chngTimestamp;
	}

	public String getCustomerCode() {
		return this.customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public long getEdiOrderNumber() {
		return this.ediOrderNumber;
	}

	public void setEdiOrderNumber(long ediOrderNumber) {
		this.ediOrderNumber = ediOrderNumber;
	}

	public long getLineNumber() {
		return this.lineNumber;
	}

	public void setLineNumber(long lineNumber) {
		this.lineNumber = lineNumber;
	}

	public LocalDateTime getOrderDate() {
		return this.orderDate;
	}

	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderNumber() {
		return this.orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getOrderingSys() {
		return this.orderingSys;
	}

	public void setOrderingSys(String orderingSys) {
		this.orderingSys = orderingSys;
	}

	public LocalDate getPoDate() {
		return this.poDate;
	}

	public void setPoDate(LocalDate poDate) {
		this.poDate = poDate;
	}

	public String getPoLineNo() {
		return this.poLineNo;
	}

	public void setPoLineNo(String poLineNo) {
		this.poLineNo = poLineNo;
	}

	public String getPoNumber() {
		return this.poNumber;
	}

	public void setPoNumber(String poNumber) {
		this.poNumber = poNumber;
	}

}