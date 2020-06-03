package com.shaw.ediorderservices.mapping;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import com.shaw.ediorderservices.factory.EdiOrderFactory;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderDate;
import com.shaw.ediorderservices.persistance.sqlserver.entity.GenericDate;
import com.shaw.ediorderservices.persistance.sqlserver.entity.IEdiDate;

@Mapper(uses = EdiOrderFactory.class, unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface DateMapper {

//    @Mapping(source = "ediOrder.legacyId", target = "ediOrderNumber")
    EdiOrderDate ediDateToLegacy(IEdiDate ediDate);

    @Mapping(target = "id", constant =  "0")
    GenericDate legacyDateToEdiDate(EdiOrderDate ediOrderDate);
}
