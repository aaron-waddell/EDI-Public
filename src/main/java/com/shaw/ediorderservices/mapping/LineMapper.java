package com.shaw.ediorderservices.mapping;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.ReportingPolicy;

import com.shaw.ediorderservices.csws.CartLine;
import com.shaw.ediorderservices.csws.SamplesLine;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderLine;
import com.shaw.ediorderservices.persistance.db2.entity.SamplesInfo;
import com.shaw.ediorderservices.persistance.sqlserver.entity.line.CarpetEdiLine;
import com.shaw.ediorderservices.persistance.sqlserver.entity.line.EdiLine;
import com.shaw.ediorderservices.persistance.sqlserver.entity.line.HardsurfacesEdiLine;
import com.shaw.ediorderservices.persistance.sqlserver.entity.line.SamplesEdiLine;

@Mapper(uses = ValidationMapper.class
, unmappedTargetPolicy = ReportingPolicy.IGNORE
, componentModel = "spring"
, imports = {com.shaw.ediorderservices.persistance.db2.entity.EdiOrderLine.class
		,com.shaw.ediorderservices.persistance.db2.entity.EdiOrderLine.EdiOrderLinePK.class}
)
@Named("LineMapper")
public interface LineMapper {

//    @Mapping(target = "id", constant =  "0L")
    @Mapping(target = "roundedFlag", constant =  "N")
    @Mapping(source = "custReqShipDate", target = "custReqShipDate")
//    @Mapping(expression = "java(new EdiOrderLinePK(ediOrder,lineNbr))", target = "id")
//    @Mapping(source="ediOrder", target="id.ediOrderHeader")
    @Mapping(source="lineNbr", target="id.poLineNo")
    @Mapping(target="ediOrderHeader", ignore = true)
    EdiOrderLine ediLineToLegacy(EdiLine ediLine);

    @Mapping(target = "id", constant =  "0L")
    @Named("ToSamplesLine")
    SamplesEdiLine legacyLineToSamplesEdiLine(EdiOrderLine line);

    @Mapping(target = "id", constant =  "0L")
    @Named("ToCarpetLine")
    CarpetEdiLine legacyLineToCarpetEdiLine(EdiOrderLine line);

    @Mapping(target = "id", constant =  "0L")
    @Named("ToHardsurfacesLine")
    HardsurfacesEdiLine legacyLineToHardsurfacesEdiLine(EdiOrderLine line);

    CartLine ediLineToCartLine(EdiLine ediLine);

//    EdiLine CartLineToEdiLine(CartLine cartLine);

    @Mapping(target = "grade", constant = "A")
    @Mapping(target = "location", constant = "01")
    @Mapping(target = "samplesPrivateStyle", source = "samplesStyleNbr")
    @Mapping(target = "styleNbr", source = "samplesStyleNbr")
    @Mapping(target = "colorNbr", source = "samplesColorNbr")
    @Mapping(target = "samplesSeqNbr", constant = "")
    @Mapping(target = "typesetDesc", source = "delVehName")
    @Mapping(target = "sidemarkType1", constant = "S")
    @Mapping(target = "sidemarkType2", constant = "S")
    @Mapping(target = "genericLabelFlag", constant = "true")
    @Mapping(target = "uom", constant = "EA")
    @Mapping(target = "unitsPerSubset", constant = "1")
    @Mapping(target = "weightUom", constant = "LBS")
    SamplesLine samplesInfoToSamplesLine(SamplesInfo samplesInfo);
}
