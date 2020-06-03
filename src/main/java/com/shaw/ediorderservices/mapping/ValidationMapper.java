package com.shaw.ediorderservices.mapping;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import com.shaw.ediorderservices.factory.EdiOrderFactory;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrdValidation;
import com.shaw.ediorderservices.persistance.sqlserver.entity.EdiValidation;

@Mapper(uses = EdiOrderFactory.class, unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ValidationMapper {

    @Mapping(target = "id", expression =  "java(null)")
    EdiOrdValidation validationToLegacy(EdiValidation v);

    @Mapping(source = "ediReasonCode.description", target = "description")
    @Mapping(target = "id", constant =  "0L")
    EdiValidation legacyToValidation(EdiOrdValidation v);

}
