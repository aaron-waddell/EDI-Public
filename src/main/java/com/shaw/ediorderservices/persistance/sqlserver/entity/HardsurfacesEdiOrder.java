package com.shaw.ediorderservices.persistance.sqlserver.entity;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import com.shaw.ediorderservices.enums.OrderType;
import com.shaw.ediorderservices.exception.ResourceCreationException;

@Entity
@PrimaryKeyJoinColumn(name = "hardsurfacesOrderId")

public class HardsurfacesEdiOrder extends StandardEdiOrder {

	private static final long serialVersionUID = 1L;
	
	public HardsurfacesEdiOrder() {
		// TODO Auto-generated constructor stub
		super(OrderType.HARDSURFACES.toString());
	}

	@Override
	public void addLine(EdiLine line) {
		if(line.getLineType().equals(OrderType.HARDSURFACES.toString())==false)
			throw new ResourceCreationException("Hardsurfaces Order: " + line.getLineType());
		if (lines==null)
			lines = new ArrayList<EdiLine>();
		this.lines.add(line);
	}

}
