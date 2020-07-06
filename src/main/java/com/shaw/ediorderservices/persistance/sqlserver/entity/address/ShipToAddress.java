package com.shaw.ediorderservices.persistance.sqlserver.entity.address;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.shaw.ediorderservices.persistance.sqlserver.entity.order.EdiOrder;

@SuppressWarnings("serial")
@Entity @Table(schema = "CSD")
public class ShipToAddress extends Address {

	public ShipToAddress() {
		// TODO Auto-generated constructor stub
	}
	@Column(length = 2)
	private String destinationCode = "";
	@Column(length = 7)
	private String custNbr = "";
	@Column(length = 1)
	private double shipToFlag;
	@Column(length = 1)
	private String truncFlag = "";

	@OneToOne
	private volatile EdiOrder ediOrder;

	public String getDestinationCode() {
		return destinationCode;
	}

	public void setDestinationCode(String destinationCode) {
		this.destinationCode = destinationCode;
	}

	public String getCustNbr() {
		return custNbr;
	}

	public void setCustNbr(String custNbr) {
		this.custNbr = custNbr;
	}

	public double getShipToFlag() {
		return shipToFlag;
	}

	public void setShipToFlag(double shipToFlag) {
		this.shipToFlag = shipToFlag;
	}

	public String getTruncFlag() {
		return truncFlag;
	}

	public void setTruncFlag(String truncFlag) {
		this.truncFlag = truncFlag;
	}

	public EdiOrder getEdiOrder() {
		return ediOrder;
	}

	public void setEdiOrder(EdiOrder ediOrder) {
		this.ediOrder = ediOrder;
	}


}
