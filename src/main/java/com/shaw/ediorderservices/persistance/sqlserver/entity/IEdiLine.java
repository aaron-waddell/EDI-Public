package com.shaw.ediorderservices.persistance.sqlserver.entity;

public interface IEdiLine {

	void addValidation(EdiValidation v);

	String getLineType();

}