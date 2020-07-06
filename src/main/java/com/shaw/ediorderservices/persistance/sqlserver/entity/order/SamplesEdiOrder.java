package com.shaw.ediorderservices.persistance.sqlserver.entity.order;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import com.shaw.ediorderservices.exception.ResourceCreationException;
import com.shaw.ediorderservices.persistance.sqlserver.entity.line.EdiLine;

@Entity
@PrimaryKeyJoinColumn(name = "samplesOrderId")
public class SamplesEdiOrder extends EdiOrder {

	private static final long serialVersionUID = 1L;

	public SamplesEdiOrder()
	{
		super(OrderType.SAMPLES.toString());
	}
	
	private String sampType;
	public String getSampType() {
		return sampType;
	}

	public void setSampType(String sampType) {
		this.sampType = sampType;
	}

	public String getSampVvalue() {
		return sampVvalue;
	}

	public void setSampVvalue(String sampVvalue) {
		this.sampVvalue = sampVvalue;
	}

	private String sampVvalue;
	
	@Override
	public void addLine(EdiLine line) {
		if(line.getLineType().equals(OrderType.SAMPLES.toString())==false)
			throw new ResourceCreationException("Samples Order: " + line.getLineType());
		if (lines==null)
			lines = new ArrayList<EdiLine>();
		this.lines.add(line);
		line.setEdiOrder(this);
	}
	
	
}
