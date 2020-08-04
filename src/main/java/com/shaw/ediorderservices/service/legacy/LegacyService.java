package com.shaw.ediorderservices.service.legacy;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.shaw.ediorderservices.ServiceConfig;
import com.shaw.ediorderservices.exception.ResourceNotFoundException;
import com.shaw.ediorderservices.mapping.AddressMapper;
import com.shaw.ediorderservices.mapping.OrderMapper;
import com.shaw.ediorderservices.persistance.db2.dao.EdiOrderHeaderRepository;
import com.shaw.ediorderservices.persistance.db2.dao.OrderHeaderExtRepository;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderHeader;
import com.shaw.ediorderservices.persistance.db2.entity.OrderHeaderExt;
import com.shaw.ediorderservices.persistance.sqlserver.dao.EdiOrderRepository;
import com.shaw.ediorderservices.persistance.sqlserver.entity.order.EdiOrder;
import com.shaw.ediorderservices.persistance.sqlserver.entity.order.EdiOrderFactory;
import com.shaw.ediorderservices.persistance.sqlserver.entity.order.OrderStatus;
import com.shaw.ediorderservices.service.EdiOrderBean;
import com.shaw.ediorderservices.service.common.AbstractService;
import com.shaw.ediorderservices.service.rest.RestService;

@Transactional(propagation = Propagation.REQUIRED)
public abstract class LegacyService extends AbstractService<EdiOrderHeader> implements ILegacyService {

	@Autowired
	EdiOrderBean ediOrderBean;

	@Autowired
	EdiOrderHeaderRepository ediOrderHeaderRepository;

	@Autowired
	EdiOrderRepository ediOrderRepository;

	@Autowired
	OrderHeaderExtRepository orderHeaderExtRepository;
	
	@Autowired
	OrderMapper orderMapper;

	@Autowired
	AddressMapper addressMapper;

	@Autowired
	RestService restService;

	@Autowired
	private EdiOrderFactory ediOrderFactory;

    @Autowired
	protected ServiceConfig config;


	public LegacyService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createLegacyOrder() {
		EdiOrderHeader legacyHeader = orderMapper.ediOrderToLegacy(ediOrderBean.getEdiOrder());//, poDate, cancelDate, shipDate);
		logger.debug(legacyHeader.toString());
		legacyHeader = ediOrderHeaderRepository.save(legacyHeader);
		ediOrderBean.setLegacyHeader(legacyHeader);
		EdiOrder ediOrder = ediOrderBean.getEdiOrder();
		ediOrder.setLegacyOrderNumber(legacyHeader.getLegacyOrderNumber());
		ediOrderRepository.save(ediOrder);
	}

	@Override
	public void convertLegacyOrder() {
		EdiOrderHeader h = ediOrderBean.getLegacyHeader();
//		EdiOrder ediOrder = ediOrderFactory.getInstance(h.getOrderType());
		EdiOrder ediOrder = ediOrderFactory.mapToEdiOrder(h);
//		EdiOrder ediOrder = mapper.legacyHeaderToEdiOrder(ediOrderBean.getLegacyHeader());
//		Arrays.asList(OrderType.values()).stream().filter(v->v.toString().startsWith(null))
		logger.debug(ediOrder.toString());	
		ediOrderRepository.save(ediOrder);
		ediOrderBean.setEdiOrder(ediOrder);
//		List<Validations> validations = ediOrder.getVailidations().parallelStream().map(d-> mapper.map(d, EdiDate.class));
	}

//	EdiOrderHeader saveHeader(EdiOrderHeader h)
//	{
//		EdiOrderHeader result = ediOrderHeaderRepository.save(h);
//		logger.debug(result.toString());
//		return result;
//	}
	
	@Override
	public void getOrder(long ediOrderNbr) throws ResourceNotFoundException {
//		Supplier<ResourceNotFoundException> s = ResourceNotFoundException::new;
		// TODO Auto-generated method stub
		EdiOrderHeader legacyHeader = ediOrderHeaderRepository.getHeader(ediOrderNbr);
//		legacyHeader = ediOrderHeaderRepository.getHeaderLines(ediOrderNbr).orElseThrow(()->new ResourceNotFoundException("legacy header"));
		ediOrderBean.setLegacyHeader(legacyHeader);
	}

	@Override
	public void updateOrderHeader(String shawOrderNbr)
	{
		EdiOrder ediOrder = ediOrderBean.getEdiOrder();
		EdiOrderHeader header = ediOrderBean.getLegacyHeader();
		ediOrder.setShawOrderNbr(shawOrderNbr);
		header.setShawOrderNumber(shawOrderNbr);
		header.setStatusCode(OrderStatus.COMPLETE);
		header.getLines().forEach(l->l.setStatusCode(OrderStatus.COMPLETE));
		header.setOrderDate(LocalDate.now());
//TODO		
//		OrderHeaderExt ext = new OrderHeaderExt(); 
		ediOrderBean.setEdiOrder(ediOrder);
		ediOrderHeaderRepository.save(header);
//		OrderHeader shawHeader = orderHeaderRepository.findById(shawOrderNbr).orElseThrow(ResourceNotFoundException::new);
		OrderHeaderExt ext = orderHeaderExtRepository.findById(shawOrderNbr).orElseThrow(ResourceNotFoundException::new);
		ext.setThirdPartyAddress(addressMapper.thirdPartyAddressToLegacyThirdPartyAddress(ediOrder.getThirdPartyAddress()));
		orderHeaderExtRepository.save(ext);
		
	}

	@Override
	protected PagingAndSortingRepository<EdiOrderHeader, Long> getDao() {
		// TODO Auto-generated method stub
		return ediOrderHeaderRepository;
	}

}
