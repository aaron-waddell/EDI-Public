package com.shaw.ediorderservices.persistance.sqlserver.entity.date;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

import com.shaw.ediorderservices.persistance.sqlserver.entity.order.EdiOrder;

@Entity
public class ShipDate extends EdiDate {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@OneToOne
	private volatile EdiOrder ediOrder; //exclude from json


	public ShipDate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ShipDate(String qualifier, LocalDate dateValue) {
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
