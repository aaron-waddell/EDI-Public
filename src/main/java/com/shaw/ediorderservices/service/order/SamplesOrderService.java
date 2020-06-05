package com.shaw.ediorderservices.service.order;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shaw.ediorderservices.exception.NotImplementedException;
import com.shaw.ediorderservices.persistance.sqlserver.dao.EdiOrderRepository;
import com.shaw.ediorderservices.persistance.sqlserver.entity.order.EdiOrder;

@Service
@Transactional
@Qualifier("samplesOrderService")
public class SamplesOrderService extends OrderService {

	final static Logger logger = LoggerFactory.getLogger(SamplesOrderService.class);

	@Autowired
	EdiOrderRepository ediOrderRepository;

	public SamplesOrderService() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected PagingAndSortingRepository<EdiOrder, Long> getDao() {
		// TODO Auto-generated method stub
		return ediOrderRepository;
	}

	//Custom 
	
//	@Override
//	public void fillPreorder(long id) {
//		logger.info("fill samples order");
//		return new SamplesEdiOrder();
//		
//	}

	@Override
	public void resubmit() {
		logger.info("resubmit samples order");
		throw new NotImplementedException();
	}


//	@Override
//	public void convert() {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	@Override
//	public Class<? extends EdiOrder> appliesTo() {
//		// TODO Auto-generated method stub
//		return SamplesEdiOrder.class;
//	}
//	
	
}
