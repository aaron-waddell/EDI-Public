package com.shaw.ediorderservices.persistance.db2.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Transient;

@Embeddable
//@Inheritance(strategy = InheritanceType.JOINED)
public class LegacyThirdPartyAddress implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Transient
	private String tpprovince = "";
	@Transient
	private String tpcountry = "";
	@Transient
	private String tpphone = "";

	@Column(name="THIRD_PARTY_ADDR_1", nullable=false, length=45)
	private String addressLine1 = "";

	@Column(name="THIRD_PARTY_ADDR_2", nullable=false, length=45)
	private String addressLine2 = "";

	@Column(name="THIRD_PARTY_ACCT_NBR", nullable=false, length=20)
	private String accountNbr = "";

	@Column(name="THIRD_PARTY_BILL_FLAG", nullable=false, length=1)
	private String billFlag = "";

	@Column(name="THIRD_PARTY_CITY", nullable=false, length=30)
	private String city = "";

	@Column(name="THIRD_PARTY_NAME", nullable=false, length=45)
	private String name = "";

	@Column(name="THIRD_PARTY_NAME_2", nullable=false, length=45)
	private String name2 = "";

	@Column(name="THIRD_PARTY_STATE", nullable=false, length=2)
	private String state = "";

	@Column(name="THIRD_PARTY_ZIP", nullable=false, length=16)
	private String zip = "";



	public LegacyThirdPartyAddress() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getTpprovince() {
		return tpprovince;
	}

	public void setTpprovince(String tpprovince) {
		this.tpprovince = tpprovince;
	}

	public String getTpcountry() {
		return tpcountry;
	}

	public void setTpcountry(String tpcountry) {
		this.tpcountry = tpcountry;
	}

	public String getTpphone() {
		return tpphone;
	}

	public void setTpphone(String tpphone) {
		this.tpphone = tpphone;
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

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	@Override
	public String toString() {
		return "LegacyThirdPartyAddress [tpprovince=" + tpprovince + ", tpcountry=" + tpcountry + ", tpphone=" + tpphone
				+ ", addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", accountNbr=" + accountNbr
				+ ", billFlag=" + billFlag + ", city=" + city + ", name=" + name + ", name2=" + name2 + ", state="
				+ state + ", zip=" + zip + "]";
	}


}
