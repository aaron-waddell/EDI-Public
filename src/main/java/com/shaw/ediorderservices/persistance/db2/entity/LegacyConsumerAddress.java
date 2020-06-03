package com.shaw.ediorderservices.persistance.db2.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Transient;

@Embeddable
//@Inheritance(strategy = InheritanceType.JOINED)
public class LegacyConsumerAddress implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Transient
	private String cprovince;
	@Transient
	private String ccountry;
	@Transient
	private String cphone;

	@Column(name="CONSUMER_ADDRESS", nullable=false, length=35)
	private String addressLine1;

	@Column(name="CONSUMER_ADDRESS_2", nullable=false, length=35)
	private String addressLine2;

	@Column(name="CONSUMER_CITY", nullable=false, length=19)
	private String city;

	@Column(name="CONSUMER_NAME", nullable=false, length=35)
	private String name;

	@Column(name="CONSUMER_PO_DATE", nullable=false)
	private LocalDate consumerPoDateValue;

	@Column(name="CONSUMER_SHIP_FLG", nullable=false, length=1)
	private String consumerShipFlg;

	@Column(name="CONSUMER_STATE", nullable=false, length=2)
	private String state;

	@Column(name="CONSUMER_ZIP", nullable=false, length=9)
	private String zip;


	public LegacyConsumerAddress() {
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

	public String getCprovince() {
		return cprovince;
	}

	public void setCprovince(String cprovince) {
		this.cprovince = cprovince;
	}

	public String getCcountry() {
		return ccountry;
	}

	public void setCcountry(String ccountry) {
		this.ccountry = ccountry;
	}

	public String getCphone() {
		return cphone;
	}

	public void setCphone(String cphone) {
		this.cphone = cphone;
	}

	public LocalDate getConsumerPoDateValue() {
		return consumerPoDateValue;
	}

	public void setConsumerPoDateValue(LocalDate consumerPoDateValue) {
		this.consumerPoDateValue = consumerPoDateValue;
	}

	public String getConsumerShipFlg() {
		return consumerShipFlg;
	}

	public void setConsumerShipFlg(String consumerShipFlg) {
		this.consumerShipFlg = consumerShipFlg;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "LegacyConsumerAddress [cprovince=" + cprovince + ", ccountry=" + ccountry + ", cphone=" + cphone
				+ ", addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", city=" + city + ", name="
				+ name + ", consumerPoDateValue=" + consumerPoDateValue + ", consumerShipFlg=" + consumerShipFlg
				+ ", state=" + state + ", zip=" + zip + "]";
	}

}
