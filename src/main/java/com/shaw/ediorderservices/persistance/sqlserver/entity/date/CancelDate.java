package com.shaw.ediorderservices.persistance.sqlserver.entity.date;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import com.shaw.ediorderservices.persistance.sqlserver.entity.order.EdiOrder;

@Entity
public class CancelDate extends EdiDate {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@OneToOne
	private volatile EdiOrder ediOrder; //exclude from json

	public CancelDate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CancelDate(String qualifier, LocalDate dateValue) {
		super(qualifier, dateValue);
		// TODO Auto-generated constructor stub
	}

	public EdiOrder getEdiOrder() {
		return ediOrder;
	}


	public void setEdiOrder(EdiOrder ediOrder) {
		this.ediOrder = ediOrder;
	}


}
