package com.shaw.ediorderservices.mapping;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderHeader;
import com.shaw.ediorderservices.persistance.db2.entity.EdiShipInfo;
import com.shaw.ediorderservices.persistance.db2.entity.EdiShipInfoLn;
import com.shaw.ediorderservices.persistance.sqlserver.entity.line.EdiLine;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ShipInfoMapper {

//    @Mapping(source="ediOrder.poDate.dateValue", target="poDate")
//	@Mapping(target="id", expression = "java(new EdiShipInfoPK(header.getId().getOrderNbr(),java.time.LocalDate.now()))")
	@Mapping(target="id.dateStamp", expression="java(java.time.LocalDate.now())")
    @Mapping(source="shawOrderNumber", target="id.orderNbr")
	@Mapping(source="poDateValue", target="poDate")
	@Mapping(source="agreementNumber",target="agreementNbr")
//	@Mapping(source="authorizationNo",target="authorizationNo")
	@Mapping(source="billToStore",target="billToStoreNbr")
//	@Mapping(source="",target="consStatusMsg")
	@Mapping(source="consumerAddress",target="consumerAddress")
	@Mapping(source="crossDockCenter",target="crossDock")
	@Mapping(source="poNumber",target="custPo")
	@Mapping(source="custDept",target="department")
	@Mapping(source="vendorNo",target="vendorNo")
	@Mapping(source="specialPoNo",target="specPoNumber")
	@Mapping(source="salesCheckNumber",target="salesCheckNo")
	@Mapping(source="orderingSystem",target="orderingSys")
	EdiShipInfo EdiOrderHeaderToShipInfo(EdiOrderHeader header);

    @Mapping(source="lineNbr", target="id.lineNbr")
    @Mapping(target="id.ediShipInfo", ignore = true)
//	@Mapping(target="id", expression = "java(new EdiShipInfoLnPK(line.getShipInfo(),id.getLineNbr()))")
	EdiShipInfoLn EdiLineToShipInfoLn(EdiLine line);

}
