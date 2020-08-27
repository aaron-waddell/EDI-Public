package com.shaw.ediorderservices.persistance.sqlserver.entity.order;

import org.mapstruct.ObjectFactory;
import org.mapstruct.TargetType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shaw.ediorderservices.exception.ResourceCreationException;
import com.shaw.ediorderservices.factory.IFactory;
import com.shaw.ediorderservices.mapping.OrderMapper;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderHeader;

@Component
public class EdiOrderFactory implements IFactory {

	@Autowired
	OrderMapper mapper;
	
	public  EdiOrderFactory() {
		// TODO Auto-generated constructor stub
	}

    @SuppressWarnings("unchecked")
	public <T extends EdiOrder> T mapToEdiOrder(EdiOrderHeader h) {
		switch (h.getOrderType()) {
		case "S":
			return (T) mapper.legacyHeaderToSamplesEdiOrder(h);
		case "C":
			return (T) mapper.legacyHeaderToCarpetEdiOrder(h);
		case "H":
			return (T) mapper.legacyHeaderToUnitsEdiOrder(h);

		default:
			
			throw new ResourceCreationException("EdiOrder for " + h.getOrderType());
		}
   }

	@SuppressWarnings("unchecked")
	@ObjectFactory
    public <T extends EdiOrder> T createMapperInstance(EdiOrderHeader h, @TargetType Class<T> clazz) {
		return (T) getInstance(h.getOrderType());
    }
    
//	@ObjectFactory
//	public <T extends EdiOrder>T getInstance(EdiOrderHeader h)
//	{
//		return (T) getInstance(h.getOrderType());
//	}

	public EdiOrder getInstance(String orderType)
	{
		switch (orderType) {
		case "S":
			return new SamplesEdiOrder();
		case "C":
			return new CarpetEdiOrder();
		case "U":
			return new UnitsEdiOrder();

		default:
			
			throw new ResourceCreationException("EdiOrder for " + orderType);
		}
	}
}
