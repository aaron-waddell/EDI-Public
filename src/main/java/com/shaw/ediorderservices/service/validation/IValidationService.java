package com.shaw.ediorderservices.service.validation;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.shaw.ediorderservices.IOperations;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrdValidation;
import com.shaw.ediorderservices.persistance.db2.entity.EdiReasonCode;
import com.shaw.ediorderservices.persistance.sqlserver.entity.EdiValidation;
import com.shaw.ediorderservices.persistance.sqlserver.entity.line.EdiLine;

public interface IValidationService extends IOperations<EdiValidation> {

	final static Logger logger = LoggerFactory.getLogger(IValidationService.class);

	public void fillPreorder();

	public void validate();

	public default List<EdiOrdValidation> processSystemRules(List<EdiReasonCode> systemRules) {
		return systemRules.stream()
				.map(this::processSystemRule)
				.filter(r->r!=null).collect(Collectors.toList());
	}

	public default List<EdiOrdValidation> processHeaderRules(List<EdiReasonCode> headerRules) {
		return headerRules.stream()
				.map(this::processHeaderRule)
				.filter(r->r!=null).collect(Collectors.toList());
	}

	public default List<EdiOrdValidation> processLineRules(List<EdiReasonCode> lineRules) {
		return lineRules.stream()
				.flatMap(this::processLineRule)
				.filter(r->r!=null).collect(Collectors.toList());		
	}

	
	Stream<EdiOrdValidation> processLineRule( EdiReasonCode rule);

	EdiOrdValidation processSystemRule( EdiReasonCode systemRule);

	EdiOrdValidation processHeaderRule( EdiReasonCode headerRule);

	EdiOrdValidation processLine(EdiLine l, EdiReasonCode rule, String commCust);
	
}
