package com.shaw.ediorderservices.service.csws;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shaw.ediorderservices.csws.CartRequest;
import com.shaw.ediorderservices.csws.UnitsLine;
import com.shaw.ediorderservices.persistance.sqlserver.entity.order.EdiOrder;

@Service
@Transactional
@Qualifier("unitsCswsService")
public class UnitsCSWSService extends CSWSService {

	public UnitsCSWSService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected CartRequest createCartRequest() {
		// TODO Auto-generated method stub
		CartRequest req = new CartRequest();
		req.setApplicationId("EDIS");
		req.setApplicationGuid(config.getAppGuid());
		req.setBusinessFunc("Add To Cart");
		req.setUserId("EDIS");
		req.setCartNbr("");
		req.setProductType("A");
		EdiOrder ediOrder = ediOrderBean.getEdiOrder();
		req.setCustNbr(ediOrder.getCustomerNumber());
		List<UnitsLine> unitsLines = ediOrder.getLines().stream()
				.map(l->lineMapper.ediLineAndShipDateToUnitsLine(l, ediOrder.getShipDate().getDateValue()))
				.collect(Collectors.toList());
		logger.info(unitsLines.toString());
		req.getUnitsLines().addAll(unitsLines);
		return req;
	}

}
