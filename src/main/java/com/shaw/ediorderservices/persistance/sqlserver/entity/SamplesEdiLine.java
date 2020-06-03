package com.shaw.ediorderservices.persistance.sqlserver.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.shaw.ediorderservices.enums.OrderType;

@Entity @Table(schema = "CSD")
@PrimaryKeyJoinColumn(name = "samplesLineId")
public class SamplesEdiLine extends EdiLine {

	public SamplesEdiLine() {
		super(OrderType.SAMPLES.toString());
	}

	private static final long serialVersionUID = 1L;

	@Column
	private String samplesValue;
}
