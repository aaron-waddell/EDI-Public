package com.shaw.ediorderservices.service.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.shaw.ediorderservices.persistance.db2.entity.EdiOrdValidation;
import com.shaw.ediorderservices.persistance.db2.entity.EdiReasonCode;
import com.shaw.ediorderservices.persistance.sqlserver.entity.EdiLine;
import com.shaw.ediorderservices.service.ValidationService;

@Service
@Qualifier("hardsurfacesValidationService")
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class HardsurfacesValidationService extends ValidationService {

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
//		if (ediOrder.getOrderType().equals(OrderType.HARDSURFACES.toString())==false)
//			//TODO add validation to order
//			return null;
//		return ediOrder;
//		
//	}

}
