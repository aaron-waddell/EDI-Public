package com.shaw.ediorderservices.persistance.sqlserver.entity;

import java.util.List;

public interface IEdiOrder {

	public List<EdiLine> getLines();

	public void setLines(List<EdiLine> lines);

	public void addLine(EdiLine line);

	public List<EdiValidation> getValidations();
	
	public void setValidations(List<EdiValidation> validations);

	public void addValidation(EdiValidation v) ;

}