package com.shaw.ediorderservices.persistance.sqlserver.entity.line;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.shaw.ediorderservices.persistance.sqlserver.entity.order.OrderType;

@Entity @Table(schema = "CSD")
@PrimaryKeyJoinColumn(name = "hardsurfacesLineId")

public class HardsurfacesEdiLine extends EdiLine {

	private static final long serialVersionUID = 1L;

	public HardsurfacesEdiLine() {
		super(OrderType.HARDSURFACES.toString());
	}

	@Column
	private String hsValue;
}
