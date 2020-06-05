package com.shaw.ediorderservices.service.impl;

import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderHeader;
import com.shaw.ediorderservices.persistance.sqlserver.entity.EdiOrder;

public class LegacySamplesService extends LegacyService {

	@Override
	public void updateOrderHeader(String shawOrderNbr)
	{
		if (ediOrderBean.getEdiOrder().getOrderingSystem().equals("NS"))
		{
//TODO			orderHeaderRepository.updateAckPrint();
		}
		super.updateOrderHeader(shawOrderNbr);
	}
}
