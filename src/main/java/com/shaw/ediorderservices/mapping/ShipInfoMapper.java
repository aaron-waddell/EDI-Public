package com.shaw.ediorderservices.mapping;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import com.shaw.ediorderservices.csws.OrderLine;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderHeader;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderLine;
import com.shaw.ediorderservices.persistance.db2.entity.EdiShipInfo;
import com.shaw.ediorderservices.persistance.db2.entity.EdiShipInfoLn;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ShipInfoMapper {

//    @Mapping(source="ediOrder.poDate.dateValue", target="poDate")
	@Mapping(target="id", expression = "java(new com.shaw.ediorderservices.persistance.db2.entity.EdiShipInfo.EdiShipInfoPK(header.getShawOrderNumber(),java.time.LocalDate.now()))")
//	@Mapping(target="id.dateStamp", expression="java(java.time.LocalDate.now())")
//    @Mapping(source="shawOrderNumber", target="id.orderNbr")
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
	@Mapping(source="markForStore",target="receivingStore")
	@Mapping(source="shipToAddress.destCode",target="shipToDestCode")
	EdiShipInfo EdiOrderHeaderToShipInfo(EdiOrderHeader header);

//    @Mapping(source="id.poLineNo", target="id.lineNbr")
    @Mapping(target="id.ediShipInfo", ignore = true)
    @Mapping(source="ediLine.quantityOrdered", target="orderQtyFt")
    @Mapping(constant="0", target="orderQtyIn")
	@Mapping(expression = "java(org.apache.commons.lang3.StringUtils.truncate(ediLine.getUomCode(),2))", target="uom")
    @Mapping(source="ediLine.style", target="styleNbr")
    @Mapping(source="ediLine.color", target="colorNbr")
    @Mapping(constant="", target="rollNbr")
    @Mapping(source="ediLine.quantityOrdered", target="length")
//    @Mapping(constant="", target="width")
    @Mapping(source="ediLine.quantityOrdered", target="custQty")
    @Mapping(constant="", target="lastChngId")
    @Mapping(source="ediLine.itemNo", target="ediItemNbr")
    @Mapping(source="ediLine.retailPrice", target="price")
    @Mapping(source="ediLine.unitPrice", target="unitPrice")
//	@Mapping(target="id", expression = "java(new EdiShipInfoLnPK(line.getShipInfo(),id.getLineNbr()))")
    @Mapping(source="ediLine.id.poLineNo", target="poLineNbr")
    @Mapping(source="ediLine.id.poLineNo", target="id.lineNbr")
	@Mapping(target="lastChngDate", expression = "java(java.time.LocalDateTime.now())")
	@Mapping(source = "orderLine.repromDate", target="repromDate")
	@Mapping(expression = "java(org.apache.commons.lang3.StringUtils.truncate(orderLine.getStatusCode(),1))", target="status")
	EdiShipInfoLn EdiLineAndOrderLineToShipInfoLn(EdiOrderLine ediLine, OrderLine orderLine);

}
