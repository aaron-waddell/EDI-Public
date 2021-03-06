package com.shaw.ediorderservices.service.validation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.shaw.ediorderservices.persistance.db2.entity.EdiOrdValidation;
import com.shaw.ediorderservices.persistance.db2.entity.EdiReasonCode;
import com.shaw.ediorderservices.persistance.sqlserver.entity.line.EdiLine;

@Service
@Qualifier("unitsValidationService")
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class UnitsValidationService extends ValidationService {

	@Override
	public EdiOrdValidation processSystemRule( EdiReasonCode systemRule) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EdiOrdValidation processHeaderRule( EdiReasonCode headerRule) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EdiOrdValidation processLine(EdiLine l, EdiReasonCode rule, String commCust) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public void validate() {
//		logger.info("validate hs order");
//		if (ediOrder.getOrderType().equals(OrderType.UNITS.toString())==false)
//			//TODO add validation to order
//			return null;
//		return ediOrder;
//		
//	}

}
