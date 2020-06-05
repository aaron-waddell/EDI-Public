package com.shaw.ediorderservices.service.legacy;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderHeader;
import com.shaw.ediorderservices.persistance.sqlserver.entity.order.EdiOrder;

@Service
@Transactional
@Qualifier("samplesLegacyService")
public class SamplesLegacyService extends LegacyService {

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
