package com.shaw.ediorderservices.service.order;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shaw.ediorderservices.csws.Order;
import com.shaw.ediorderservices.exception.NotImplementedException;
import com.shaw.ediorderservices.persistance.sqlserver.dao.EdiOrderRepository;
import com.shaw.ediorderservices.persistance.sqlserver.entity.order.EdiOrder;

@Service
@Transactional
@Primary
@Qualifier("unitsOrderService")
public class UnitsOrderService extends  OrderService {

	final static Logger logger = LoggerFactory.getLogger(UnitsOrderService.class);

	@Autowired
	EdiOrderRepository ediOrderRepository;

	public UnitsOrderService() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected PagingAndSortingRepository<EdiOrder, Long> getDao() {
		// TODO Auto-generated method stub
		return ediOrderRepository;
	}

	//Custom 
	
	@Override
	public void resubmit() {
		logger.info("resubmit hs order");
		throw new NotImplementedException();
	}

//	@Override
//	public Order convert() {
//		// TODO Auto-generated method stub
//		throw new NotImplementedException();
//	}

//	@Override
//	public Class<? extends EdiOrder> appliesTo() {
//		return UnitsEdiOrder.class;
//	}

}
