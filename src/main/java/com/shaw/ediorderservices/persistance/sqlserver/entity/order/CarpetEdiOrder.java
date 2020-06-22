package com.shaw.ediorderservices.persistance.sqlserver.entity.order;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import com.shaw.ediorderservices.exception.ResourceCreationException;
import com.shaw.ediorderservices.persistance.sqlserver.entity.line.EdiLine;

@Entity
@PrimaryKeyJoinColumn(name = "carpetOrderId")

public class CarpetEdiOrder extends StandardEdiOrder {

	private static final long serialVersionUID = 1L;
	
	public CarpetEdiOrder() {
		// TODO Auto-generated constructor stub
		super(OrderType.CARPET.toString());
	}

	@Override
	public void addLine(EdiLine line) {
		if(line.getLineType().equals(OrderType.CARPET.toString())==false)
			throw new ResourceCreationException("Carpet Order: " + line.getLineType());
		if (lines==null)
			lines = new ArrayList<EdiLine>();
		this.lines.add(line);
		line.setEdiOrder(this);
	}

}
