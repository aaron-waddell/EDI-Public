package com.shaw.ediorderservices.persistance.sqlserver.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity @Table(schema = "CSD")
public class ThirdPartyAddress extends Address {

	@Column(nullable = false)
	private String accountNbr = "";
	@Column(nullable = false, length=1)
	private String billFlag = "";
	
	@OneToOne
	private EdiOrder ediOrder;


	public ThirdPartyAddress() {
		// TODO Auto-generated constructor stub
	}


	public String getAccountNbr() {
		return accountNbr;
	}


	public void setAccountNbr(String accountNbr) {
		this.accountNbr = accountNbr;
	}


	public String getBillFlag() {
		return billFlag;
	}


	public void setBillFlag(String billFlag) {
		this.billFlag = billFlag;
	}


	public EdiOrder getEdiOrder() {
		return ediOrder;
	}


	public void setEdiOrder(EdiOrder ediOrder) {
		this.ediOrder = ediOrder;
	}

}
