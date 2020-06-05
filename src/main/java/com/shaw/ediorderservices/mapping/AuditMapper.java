package com.shaw.ediorderservices.mapping;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import com.shaw.ediorderservices.persistance.db2.entity.EdiAudit;
import com.shaw.ediorderservices.persistance.sqlserver.entity.order.EdiOrder;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface AuditMapper {

    @Mapping(source="poDate.dateValue", target="poDate")
    @Mapping(source="shawOrderNbr", target="orderNumber")
    @Mapping(source="legacyOrderNumber", target="ediOrderNumber")
    @Mapping(source="orderingSystem", target="orderingSys")
    @Mapping(target="lineNumber", constant = "0L")
    @Mapping(target="poLineNo", constant = "0")
    @Mapping(target="chngFunction", constant = "CARR")
    @Mapping(target="chngLid", constant = "CARR")
    @Mapping(target="orderDate", expression = "java(java.time.LocalDateTime.now())")
	EdiAudit ediOrderToEdiAudit(EdiOrder ediOrder);
}
