package com.shaw.ediorderservices.service;

import org.springframework.stereotype.Component;

import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderHeader;
import com.shaw.ediorderservices.persistance.sqlserver.entity.EdiOrder;

@Component
//@Scope(scopeName = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class EdiOrderBean {

	private EdiOrder ediOrder;
	private EdiOrderHeader legacyHeader;
	//TODO add Rules
	
	
	public EdiOrderBean() {
		
	}
	
	public EdiOrder getEdiOrder() {
		return ediOrder;
	}
	public void setEdiOrder(EdiOrder ediOrder) {
		this.ediOrder = ediOrder;
	}
	public EdiOrderHeader getLegacyHeader() {
		return legacyHeader;
	}
	public void setLegacyHeader(EdiOrderHeader ediOrderHeader) {
		this.legacyHeader = ediOrderHeader;
	}
	
}
