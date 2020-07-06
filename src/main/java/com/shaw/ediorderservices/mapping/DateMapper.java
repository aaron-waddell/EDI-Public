package com.shaw.ediorderservices.mapping;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderDate;
import com.shaw.ediorderservices.persistance.sqlserver.entity.date.EdiDate;
import com.shaw.ediorderservices.persistance.sqlserver.entity.date.GenericDate;
import com.shaw.ediorderservices.persistance.sqlserver.entity.order.EdiOrderFactory;

@Mapper(uses = EdiOrderFactory.class, unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface DateMapper {

//    @Mapping(source = "ediOrder.legacyId", target = "ediOrderNumber")
//    @Mapping(source="qualifier", target="pk.qualifier")
    EdiOrderDate ediDateToLegacy(EdiDate ediDate);

    @Mapping(target = "id", constant =  "0")
    @Mapping(source="pk.qualifier", target="qualifier")
    GenericDate legacyDateToEdiDate(EdiOrderDate ediOrderDate);
}
