package com.shaw.ediorderservices.persistance.sqlserver.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity @Table(schema = "CSD")
@Inheritance(strategy = InheritanceType.JOINED)

public abstract class EdiDate implements Serializable, IEdiDate {

	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length=3)
	private String qualifier = "";
	@Column
	private LocalDate dateValue;

	public EdiDate(String qualifier, LocalDate dateValue) {
		super();
		this.qualifier = qualifier;
		this.dateValue = dateValue;
	}

	public EdiDate() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getQualifier() {
		return qualifier;
	}

	public void setQualifier(String qualifier) {
		this.qualifier = qualifier;
	}

	public LocalDate getDateValue() {
		return dateValue;
	}

	public void setDateValue(LocalDate dateValue) {
		this.dateValue = dateValue;
	}

}
