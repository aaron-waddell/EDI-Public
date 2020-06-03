package com.shaw.ediorderservices.mapping;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import com.shaw.ediorderservices.factory.EdiOrderFactory;
import com.shaw.ediorderservices.persistance.db2.entity.EdiAudit;
import com.shaw.ediorderservices.persistance.db2.entity.LegacyShipToAddress;
import com.shaw.ediorderservices.persistance.sqlserver.entity.EdiOrder;
import com.shaw.ediorderservices.persistance.sqlserver.entity.ShipToAddress;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface AuditMapper {

    @Mapping(source="poDate.dateValue", target="poDate")
    @Mapping(target="chngFunction", constant = "CARR")
    @Mapping(target="chngLid", constant = "CARR")
	EdiAudit ediOrderToEdiAudit(EdiOrder ediOrder);
}
