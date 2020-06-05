package com.shaw.ediorderservices.service;

import static com.shaw.ediorderservices.gson.MyGson.gson;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.shaw.ediorderservices.IOperations;
import com.shaw.ediorderservices.csws.Order;
import com.shaw.ediorderservices.factory.CSWSServiceFactory;
import com.shaw.ediorderservices.factory.LegacyOrderServiceFactory;
import com.shaw.ediorderservices.factory.ValidationServiceFactory;
import com.shaw.ediorderservices.persistance.sqlserver.dao.EdiOrderRepository;
import com.shaw.ediorderservices.persistance.sqlserver.entity.EdiOrder;
import com.shaw.ediorderservices.persistance.sqlserver.entity.EdiValidation;
import com.shaw.ediorderservices.service.common.AbstractService;
import com.shaw.ediorderservices.service.impl.EmailService;
import com.shaw.ediorderservices.service.impl.LegacyService;
import com.shaw.ediorderservices.service.impl.SamplesOrderService;

public abstract class OrderService extends AbstractService<EdiOrder> implements IOperations<EdiOrder> {

	final static Logger logger = LoggerFactory.getLogger(SamplesOrderService.class);
	@Autowired
	protected EdiOrderBean ediOrderBean;
	
	@Autowired
	LegacyOrderServiceFactory legacyServiceFactory;
	@Autowired
	EmailService emailService;
	@Autowired
	ValidationServiceFactory validationServiceFactory;
	@Autowired
	CSWSServiceFactory cswsServiceFactory;
	@Autowired
	private EdiOrderRepository ediOrderRepository;

	
//	public abstract Class<? extends EdiOrder> appliesTo();
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void place()
	{
		try {
			EdiOrder ediOrder = ediOrderBean.getEdiOrder();
			ValidationService validationService = validationServiceFactory.getInstance(ediOrder.getOrderType());
			LegacyService legacyService = legacyServiceFactory.getInstance(ediOrder.getOrderType());
			logger.info("placing order");
			ediOrderBean.getEdiOrder().setRequestOrderJson(gson.toJson(ediOrder));
			//TODO clear validations?
			ediOrderBean.setEdiOrder(ediOrderRepository.save(ediOrder));

			if (ediOrder.getLegacyOrderNumber()==null)
			{
				legacyService.createLegacyOrder();
			}
			List<EdiValidation> validations = ediOrderBean.getEdiOrder().getValidations();
			if (validations==null || validations.size()==0)
			{
				validationService.fillPreorder();
				validationService.validate();
			}
			if (ediOrderBean.getEdiOrder().getValidations().parallelStream().allMatch(v->v.getStatus().equals("ACCEPTED")))
			{
				//Call CSWS Services (Cart/Convert)
				Order order = convert();
				legacyService.updateOrderHeader(order.getOrderNbr());
			}
			else
				emailService.sendEmails();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			emailService.sendEmail(e.toString());
			throw e;
		}
//		return ediOrder;
	}
	
//	protected void save()
//	{
//		ediOrderRepository.save();
//	}
	
	public abstract void resubmit();

	public Order convert() {
		ICSWSService cswsService = cswsServiceFactory.getInstance(ediOrderBean.getEdiOrder().getOrderType());
		return cswsService.place();
	}

}
