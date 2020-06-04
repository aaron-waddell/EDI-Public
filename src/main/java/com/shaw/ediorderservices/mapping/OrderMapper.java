package com.shaw.ediorderservices.mapping;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;

import com.shaw.ediorderservices.csws.CustInfo;
import com.shaw.ediorderservices.csws.ShipInfo;
import com.shaw.ediorderservices.factory.EdiOrderFactory;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderHeader;
import com.shaw.ediorderservices.persistance.sqlserver.entity.CarpetEdiOrder;
import com.shaw.ediorderservices.persistance.sqlserver.entity.EdiOrder;
import com.shaw.ediorderservices.persistance.sqlserver.entity.HardsurfacesEdiOrder;
import com.shaw.ediorderservices.persistance.sqlserver.entity.SamplesEdiOrder;

@Mapper(uses = {EdiOrderFactory.class,LineMapper.class, DateMapper.class, AddressMapper.class, ValidationMapper.class}, unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface OrderMapper {

    @Mapping(target = "poDateValue", source = "ediOrder.poDate.dateValue")
    @Mapping(target = "poDateQualifier", source = "ediOrder.poDate.qualifier")
    @Mapping(target = "ohCancelDateValue", source = "ediOrder.cancelDate.dateValue")
    @Mapping(target = "cancelDateQualifier", source = "ediOrder.cancelDate.qualifier")
    @Mapping(target = "shipDateValue", source = "ediOrder.shipDate.dateValue")
    @Mapping(target = "shipDateQualifier", source = "ediOrder.shipDate.qualifier")
    @Mapping(target = "orderType", expression = "java(ediOrder.getOrderType().substring(0,1))")
    EdiOrderHeader ediOrderToLegacy(EdiOrder ediOrder);//, EdiDate poDate, EdiDate cancelDate, EdiDate shipDate);

    @Mapping(target = "id", constant =  "0L")
    @Mapping(target = "shipDate", expression = "java(new com.shaw.ediorderservices.persistance.sqlserver.entity.ShipDate(header.getShipDateQualifier(), header.getShipDateValue()))")
    @Mapping(target = "poDate", expression = "java(new com.shaw.ediorderservices.persistance.sqlserver.entity.PoDate(header.getPoDateQualifier(), header.getPoDateValue()))")
    @Mapping(target = "cancelDate", expression = "java(new com.shaw.ediorderservices.persistance.sqlserver.entity.CancelDate(header.getCancelDateQualifier(), header.getOhCancelDateValue()))")
    @Mapping( target = "lines", qualifiedByName = "ToSamplesLine")
//    @Mapping(target = "orderType", expression = "java(java.util.Arrays.asList(com.shaw.ediorderservices.enums.OrderType.values()).stream().filter(v->v.toString().startsWith(header.getOrderType())).map(Enum::toString).findFirst().orElse(null))")
    SamplesEdiOrder legacyHeaderToSamplesEdiOrder(EdiOrderHeader header);

    @Mapping(target = "id", constant =  "0L")
    @Mapping(target = "shipDate", expression = "java(new com.shaw.ediorderservices.persistance.sqlserver.entity.ShipDate(header.getShipDateQualifier(), header.getShipDateValue()))")
    @Mapping(target = "poDate", expression = "java(new com.shaw.ediorderservices.persistance.sqlserver.entity.PoDate(header.getPoDateQualifier(), header.getPoDateValue()))")
    @Mapping(target = "cancelDate", expression = "java(new com.shaw.ediorderservices.persistance.sqlserver.entity.CancelDate(header.getCancelDateQualifier(), header.getOhCancelDateValue()))")
    @Mapping( target = "lines", qualifiedByName = "ToCarpetLine")
    CarpetEdiOrder legacyHeaderToCarpetEdiOrder(EdiOrderHeader header);

    @Mapping(target = "id", constant =  "0L")
    @Mapping(target = "shipDate", expression = "java(new com.shaw.ediorderservices.persistance.sqlserver.entity.ShipDate(header.getShipDateQualifier(), header.getShipDateValue()))")
    @Mapping(target = "poDate", expression = "java(new com.shaw.ediorderservices.persistance.sqlserver.entity.PoDate(header.getPoDateQualifier(), header.getPoDateValue()))")
    @Mapping(target = "cancelDate", expression = "java(new com.shaw.ediorderservices.persistance.sqlserver.entity.CancelDate(header.getCancelDateQualifier(), header.getOhCancelDateValue()))")
    @Mapping( target = "lines", qualifiedByName = "ToHardsurfacesLine")
    HardsurfacesEdiOrder legacyHeaderToHardsurfacesEdiOrder(EdiOrderHeader header);

    @Mappings({
        @Mapping(target = "resDelvFlag", constant = "false")
       ,@Mapping(target = "headerSidemarkCode1", constant = "S")
       ,@Mapping(target = "headerSidemarkCode2", constant = "S")
       ,@Mapping(target = "hsmChargeCode1", constant = "99")
       ,@Mapping(target = "hsmChargeCode2", constant = "99")
       ,@Mapping(target = "requestedBy", constant = "EDIS")
       ,@Mapping(target = "shipCityI", constant = "")
       ,@Mapping(target = "shipStateI", constant = "")
       ,@Mapping(target = "shipZipI", constant = "")
       ,@Mapping(target = "shipName2", constant = "")
       ,@Mapping(source = "ediOrder.shipDate.dateValue",target = "shipDate")
       ,@Mapping(target = "shipZip", expression = "java(shipInfo.getDestCountry().equals(\"US\")?ediOrder.getShipToAddress().getZip().substring(0,5):ediOrder.getShipToAddress().getZip())")
       ,@Mapping(target = "shipCountry", source = "ediOrder.shipToAddress.country")
       ,@Mapping(target = "destCountry", source = "ediOrder.shipToAddress.country")
//       ,@Mapping(source = "ediOrder.custInfo.specialInst1",target = "specialInst1")
//       ,@Mapping(source = "ediOrder.custInfo.specialInst2",target = "specialInst2")
//       ,@Mapping(source = "ediOrder.custInfo.specialInst3",target = "specialInst3")
//       ,@Mapping(source = "ediOrder.custInfo.specialInst4",target = "specialInst4")

//		shipInfo.setFreightType(ediOrder.getFrtCode().trim());
//		shipInfo.setOrderType(orderType);
//		shipInfo.setServiceCode(ediOrder.getSrvLevel().trim());
//		shipInfo.setShipDate(ediOrder.getShipDate().getDateValue().format(USA_FORMAT));
//		shipInfo.setSpecialInst1(custInfo.getSpecialInst1());
//		shipInfo.setSpecialInst2(custInfo.getSpecialInst2());
//		shipInfo.setSpecialInst3(custInfo.getSpecialInst3());
//		shipInfo.setSpecialInst4(custInfo.getSpecialInst4());
      })
    ShipInfo ediOrderAndCustInfoToShipInfo(EdiOrder ediOrder, CustInfo custInfo);

}
