package com.shaw.ediorderservices.persistance.sqlserver.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.shaw.ediorderservices.persistance.AuditableEntity;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(schema = "CSD")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Address extends AuditableEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column
	private String name = "";
	@Column
	private String careOf = "";
	@Column
	private String addressLine1 = "";
	@Column
	private String addressLine2 = "";
	@Column(length = 30)
	private String city = "";
	@Column(length = 2)
	private String state = "";
	@Column(length = 19)
	private String province = "";
	@Column(length = 2)
	private String country = "US";
	@Column(length = 16)
	private String zip = "";
	@Column(length=15)
	private String phone = "";
	
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public String getCareOf() {
//		return careOf;
//	}
//
//	public void setCareOf(String careOf) {
//		this.careOf = careOf;
//	}

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

}
