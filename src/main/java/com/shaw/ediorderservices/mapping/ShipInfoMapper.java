package com.shaw.ediorderservices.mapping;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import com.shaw.ediorderservices.csws.OrderHeader;
import com.shaw.ediorderservices.csws.OrderLine;
import com.shaw.ediorderservices.persistance.db2.entity.EdiShipInfo;
import com.shaw.ediorderservices.persistance.db2.entity.EdiShipInfoLn;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ShipInfoMapper {

//    @Mapping(source="ediOrder.poDate.dateValue", target="poDate")
    @Mapping(target="id.dateStamp", expression="java(java.time.LocalDate.now())")
	EdiShipInfo orderHeaderToShipInfo(OrderHeader header);

	EdiShipInfoLn orderLineToShipInfoLn(OrderLine line);

}
