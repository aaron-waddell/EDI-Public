package com.shaw.ediorderservices.mapping;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderDate;
import com.shaw.ediorderservices.persistance.sqlserver.entity.date.GenericDate;
import com.shaw.ediorderservices.persistance.sqlserver.entity.date.IEdiDate;
import com.shaw.ediorderservices.persistance.sqlserver.entity.order.EdiOrderFactory;

@Mapper(uses = EdiOrderFactory.class, unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface DateMapper {

//    @Mapping(source = "ediOrder.legacyId", target = "ediOrderNumber")
    EdiOrderDate ediDateToLegacy(IEdiDate ediDate);

    @Mapping(target = "id", constant =  "0")
    GenericDate legacyDateToEdiDate(EdiOrderDate ediOrderDate);
}
