package com.shaw.ediorderservices.mapping;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import com.shaw.ediorderservices.persistance.db2.entity.LegacyConsumerAddress;
import com.shaw.ediorderservices.persistance.db2.entity.LegacyShipToAddress;
import com.shaw.ediorderservices.persistance.db2.entity.LegacyThirdPartyAddress;
import com.shaw.ediorderservices.persistance.db2.entity.OrderHeaderExt;
import com.shaw.ediorderservices.persistance.sqlserver.entity.address.ConsumerAddress;
import com.shaw.ediorderservices.persistance.sqlserver.entity.address.ShipToAddress;
import com.shaw.ediorderservices.persistance.sqlserver.entity.address.ThirdPartyAddress;
import com.shaw.ediorderservices.persistance.sqlserver.entity.order.EdiOrderFactory;

@Mapper(uses = EdiOrderFactory.class, unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface AddressMapper {

    @Mapping(source = "poDate", target = "consumerPoDateValue")
    @Mapping(source = "shipFlag", target = "consumerShipFlg")
    @Mapping(expression = "java((addr.getZip() + \"         \").substring(0,9))", target = "zip")
    @Mapping(expression = "java((addr.getCity() + \"                   \").substring(0,19))", target = "city")
    LegacyConsumerAddress consumerAddressToLegacyConsumerAddress(ConsumerAddress addr);

    @Mapping(expression = "java((addr.getZip() + \"           \").substring(0,11))", target = "zip")
    @Mapping(expression = "java((addr.getCity() + \"                   \").substring(0,19))", target = "city")
    LegacyShipToAddress shipToAddressToLegacyShipToAddress(ShipToAddress addr);

    @Mapping(expression = "java((addr.getZip() + \"         \").substring(0,9))", target = "zip")
    LegacyThirdPartyAddress thirdPartyAddressToLegacyThirdPartyAddress(ThirdPartyAddress addr);

    @Mapping(target = "country", expression= "java(addr.getCountry().equals(\"CANADA\")?\"CN\":addr.getCountry().substring(0,2))")
    ShipToAddress legacyShipToAddressToShipToAddress(LegacyShipToAddress addr);

//    @Mapping(target = "country", expression= "java(addr.getCountry().equals(\"CANADA\")?\"CN\":addr.getCountry().substring(0,2))")
//    ShipToAddress legacyConsumerAddressToConsumerAddress(LegacyConsumerAddress addr);

//    @Mapping(target = "country", expression= "java(addr.getCountry().equals(\"CANADA\")?\"CN\":addr.getCountry().substring(0,2))")
//    ShipToAddress legacyThirdPartyAddressToThirdPartyAddress(LegacyThirdPartyAddress addr);
}
