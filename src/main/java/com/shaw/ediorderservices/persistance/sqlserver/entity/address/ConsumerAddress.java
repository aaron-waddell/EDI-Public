package com.shaw.ediorderservices.persistance.sqlserver.entity.address;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.shaw.ediorderservices.persistance.sqlserver.entity.order.EdiOrder;

@SuppressWarnings("serial")
@Entity @Table(schema = "CSD")
public class ConsumerAddress extends Address {

	@Column
	LocalDate poDate;
	@Column(length = 1)
	String shipFlag = "";

	@OneToOne
	private volatile EdiOrder ediOrder;

	public LocalDate getPoDate() {
		return poDate;
	}
	public void setPoDate(LocalDate poDate) {
		this.poDate = poDate;
	}
	public String getShipFlag() {
		return shipFlag;
	}
	public void setShipFlag(String shipFlag) {
		this.shipFlag = shipFlag;
	}
	public EdiOrder getEdiOrder() {
		return ediOrder;
	}
	public void setEdiOrder(EdiOrder ediOrder) {
		this.ediOrder = ediOrder;
	}

}
