package com.shaw.ediorderservices.persistance.sqlserver.entity.line;

import com.shaw.ediorderservices.persistance.sqlserver.entity.EdiValidation;

public interface IEdiLine {

	void addValidation(EdiValidation v);

	String getLineType();

}