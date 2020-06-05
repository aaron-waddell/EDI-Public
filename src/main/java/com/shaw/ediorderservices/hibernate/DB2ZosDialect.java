package com.shaw.ediorderservices.hibernate;

import org.hibernate.dialect.DB2Dialect;

public class DB2ZosDialect extends DB2Dialect {

	@Override
	public String getSequenceNextValString(String sequenceName) {
	
		return  "SELECT " + sequenceName + ".NEXTVAL FROM SYSIBM.SYSDUMMY1";
	}
	
	@Override
	public String getQuerySequencesString() {
//		return "select * from sysibm.syssequences";
		return null;
	}
	
}
