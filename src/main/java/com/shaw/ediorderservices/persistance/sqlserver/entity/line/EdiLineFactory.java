package com.shaw.ediorderservices.persistance.sqlserver.entity.line;

import org.mapstruct.ObjectFactory;
import org.mapstruct.TargetType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shaw.ediorderservices.exception.ResourceCreationException;
import com.shaw.ediorderservices.factory.IFactory;
import com.shaw.ediorderservices.mapping.LineMapper;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderLine;

@Component
public class EdiLineFactory implements IFactory {

	@Autowired
	LineMapper mapper;

	public  EdiLineFactory() {
		// TODO Auto-generated constructor stub
	}

    @SuppressWarnings("unchecked")
	public <T extends EdiLine> T mapToEdiLine(EdiOrderLine l) {
		String orderType = l.getId().getEdiOrderHeader().getOrderType();
		switch (orderType ) {
		case "S":
			return (T) mapper.legacyLineToSamplesEdiLine(l);
		case "C":
			return (T) mapper.legacyLineToCarpetEdiLine(l);
		case "H":
			return (T) mapper.legacyLineToHardsurfacesEdiLine(l);

		default:
			
			throw new ResourceCreationException("EdiOrder for " + orderType);
		}
    }

	@SuppressWarnings("unchecked")
	@ObjectFactory
    public <T extends EdiLine> T createMapperInstance(EdiOrderLine l, @TargetType Class<T> clazz) {
		return (T) getInstance(l.getId().getEdiOrderHeader().getOrderType());
    }
    
//	@ObjectFactory
//	public <T extends EdiLine>T getLineInstance(EdiOrderLine l)
//	{
//		return (T) getInstance(l.getPk().getEdiOrderHeader().getOrderType());
//	}
	
	public EdiLine getInstance(String orderType)
	{
		switch (orderType) {
		case "SAMPLES":
			return new SamplesEdiLine();
		case "CARPET":
			return new CarpetEdiLine();
		case "HARDSURFACES":
			return new HardsurfacesEdiLine();

		default:
			
			throw new ResourceCreationException("EdiLine for " + orderType);
		}
	}
}
