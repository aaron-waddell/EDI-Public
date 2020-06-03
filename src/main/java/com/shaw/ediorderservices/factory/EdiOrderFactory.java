package com.shaw.ediorderservices.factory;

import org.mapstruct.ObjectFactory;
import org.mapstruct.TargetType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shaw.ediorderservices.exception.ResourceCreationException;
import com.shaw.ediorderservices.mapping.OrderMapper;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderHeader;
import com.shaw.ediorderservices.persistance.sqlserver.entity.CarpetEdiOrder;
import com.shaw.ediorderservices.persistance.sqlserver.entity.EdiOrder;
import com.shaw.ediorderservices.persistance.sqlserver.entity.HardsurfacesEdiOrder;
import com.shaw.ediorderservices.persistance.sqlserver.entity.SamplesEdiOrder;

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
			return (T) mapper.legacyHeaderToHardsurfacesEdiOrder(h);

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
		case "H":
			return new HardsurfacesEdiOrder();

		default:
			
			throw new ResourceCreationException("EdiOrder for " + orderType);
		}
	}
}
