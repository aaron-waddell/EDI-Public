package com.shaw.ediorderservices.persistance.db2.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
//@Inheritance(strategy = InheritanceType.JOINED)
public class LegacyShipToAddress implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name="SHIP_TO_ADDRESS_1", nullable=false, length=35)
	private String addressLine1 = "";

	@Column(name="SHIP_TO_ADDRESS_2", nullable=false, length=35)
	private String addressLine2 = "";

	@Column(name="SHIP_TO_CITY", nullable=false, length=19)
	private String city = "";

	@Column(name="SHIP_TO_CN_CITY", nullable=false, length=19)
	private String cnCity = "";

	@Column(name="SHIP_TO_COUNTRY", nullable=false, length=19)
	private String country = "";

	@Column(name="SHIP_TO_CUST_NBR", length=7)
	private String custNbr = "";

	@Column(name="SHIP_TO_DEST_COD", nullable=false, length=2)
	private String destCode = "";

	@Column(name="SHIP_TO_FLAG", nullable=false, precision=1)
	private int flag = 0;

	@Column(name="SHIP_TO_NAME", nullable=false, length=35)
	private String name = "";

	@Column(name="SHIP_TO_PHONE", nullable=false, length=15)
	private String phone = "";

	@Column(name="SHIP_TO_PROVENCE", nullable=false, length=19)
	private String province = "";

	@Column(name="SHIP_TO_STATE", nullable=false, length=2)
	private String state = "";

	@Column(name="SHIP_TO_STORE", nullable=false, length=10)
	private String store = "";

	@Column(name="SHIP_TO_TRUNC_FLG", nullable=false, length=1)
	private String truncFlag = "";

	@Column(name="SHIP_TO_ZIP", nullable=false, length=11)
	private String zip = "";

	public LegacyShipToAddress() {
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

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCnCity() {
		return cnCity;
	}

	public void setCnCity(String cnCity) {
		this.cnCity = cnCity;
	}

	public String getCustNbr() {
		return custNbr;
	}

	public void setCustNbr(String custNbr) {
		this.custNbr = custNbr;
	}

	public String getDestCode() {
		return destCode;
	}

	public void setDestCode(String destCode) {
		this.destCode = destCode;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public String getStore() {
		return store;
	}

	public void setStore(String store) {
		this.store = store;
	}

	public String getTruncFlag() {
		return truncFlag;
	}

	public void setTruncFlag(String truncFlag) {
		this.truncFlag = truncFlag;
	}

	@Override
	public String toString() {
		return "LegacyShipToAddress [addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", city=" + city
				+ ", cnCity=" + cnCity + ", country=" + country + ", custNbr=" + custNbr + ", destCode=" + destCode
				+ ", flag=" + flag + ", name=" + name + ", phone=" + phone + ", province=" + province + ", state="
				+ state + ", store=" + store + ", truncFlag=" + truncFlag + ", zip=" + zip + "]";
	}

}
