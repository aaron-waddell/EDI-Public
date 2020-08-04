package com.shaw.ediorderservices.persistance.sqlserver.entity.date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import org.hibernate.type.DateType;

import com.shaw.ediorderservices.persistance.sqlserver.entity.order.EdiOrder;

@Entity
public class GenericDate extends EdiDate {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column
	private String type = "";

	@ManyToOne(fetch= FetchType.LAZY)
	private volatile EdiOrder ediOrder; //exclude from json

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public void setType(DateType type) {
		this.type = type.toString();
	}

	public EdiOrder getEdiOrder() {
		return ediOrder;
	}

	public void setEdiOrder(EdiOrder ediOrder) {
		this.ediOrder = ediOrder;
	}
	

}
