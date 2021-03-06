package com.shaw.ediorderservices.persistance.sqlserver.entity.line;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.shaw.ediorderservices.persistance.sqlserver.entity.order.OrderType;

@Entity @Table(schema = "CSD")
@PrimaryKeyJoinColumn(name = "carpetLineId")

public class CarpetEdiLine extends EdiLine {

	private static final long serialVersionUID = 1L;

	public CarpetEdiLine() {
		super(OrderType.CARPET.toString());
	}

	@Column
	private String carpetValue;
}
