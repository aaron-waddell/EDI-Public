package com.shaw.ediorderservices.helper;

import static com.shaw.mock.builder.MockBuilder.build;
import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

import org.apache.commons.lang3.RandomUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.shaw.ediorderservices.exception.ResourceCreationException;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderDate;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderDate.EdiOrderDatePK;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderHeader;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderLine;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderLine.EdiOrderLinePK;
import com.shaw.ediorderservices.persistance.db2.entity.LegacyConsumerAddress;
import com.shaw.ediorderservices.persistance.db2.entity.LegacyShipToAddress;
import com.shaw.ediorderservices.persistance.db2.entity.LegacyThirdPartyAddress;
import com.shaw.ediorderservices.persistance.sqlserver.entity.line.CarpetEdiLine;
import com.shaw.ediorderservices.persistance.sqlserver.entity.line.EdiLine;
import com.shaw.ediorderservices.persistance.sqlserver.entity.line.HardsurfacesEdiLine;
import com.shaw.ediorderservices.persistance.sqlserver.entity.line.SamplesEdiLine;
import com.shaw.ediorderservices.persistance.sqlserver.entity.order.CarpetEdiOrder;
import com.shaw.ediorderservices.persistance.sqlserver.entity.order.EdiOrder;
import com.shaw.ediorderservices.persistance.sqlserver.entity.order.HardsurfacesEdiOrder;
import com.shaw.ediorderservices.persistance.sqlserver.entity.order.OrderType;
import com.shaw.ediorderservices.persistance.sqlserver.entity.order.SamplesEdiOrder;

public class MockHelper {

    protected static final Logger logger = LogManager.getLogger();

	static LocalDate randomDate() {
		return LocalDate.ofEpochDay(RandomUtils.nextInt(0,10000));
	}

	static LocalDateTime randomDateTime() {
		return LocalDateTime.ofEpochSecond(RandomUtils.nextInt(0,10000), 0, ZoneOffset.UTC);
	}

	public static EdiOrder buildEdiOrder(OrderType orderType)
	{
		EdiOrder ediOrder = getOrderInstance(orderType.toString());
		
//		ediOrder.setConsumerAddress(build(ConsumerAddress.class));
//		ediOrder.setShipToAddress(build(ShipToAddress.class));
//		ediOrder.setThirdPartyAddress(build(ThirdPartyAddress.class));
		ediOrder.getConsumerAddress().setEdiOrder(ediOrder);
		ediOrder.getShipToAddress().setEdiOrder(ediOrder);
		ediOrder.getThirdPartyAddress().setEdiOrder(ediOrder);
		ediOrder.getCancelDate().setEdiOrder(ediOrder);
		ediOrder.getPoDate().setEdiOrder(ediOrder);
		ediOrder.getShipDate().setEdiOrder(ediOrder);
		EdiLine ediLine = getLineInstance(orderType.toString());
		ediLine.setLineType(orderType.toString());
		ediOrder.addLine(ediLine);
//		ediOrder.setCancelDate(build(CancelDate.class));
//		ediOrder.setPoDate(build(PoDate.class));
//		ediOrder.setShipDate(build(ShipDate.class));

		ediOrder.getConsumerAddress().setShipFlag("N");
		
		logger.debug(ediOrder.toString());
		return ediOrder;
	}

	private static EdiOrder getOrderInstance(String orderType) {
		switch (orderType) {
		case "SAMPLES":
			return build(SamplesEdiOrder.class);
		case "CARPET":
			return build(CarpetEdiOrder.class);
		case "HARDSURFACES":
			return build(HardsurfacesEdiOrder.class);
		default:
			throw new ResourceCreationException("EdiOrder for " + orderType);
		}
	}

	private static EdiLine getLineInstance(String orderType) {
		switch (orderType) {
		case "SAMPLES":
			return build(SamplesEdiLine.class);
		case "CARPET":
			return build(CarpetEdiLine.class);
		case "HARDSURFACES":
			return build(HardsurfacesEdiLine.class);
		default:
			throw new ResourceCreationException("EdiLine for " + orderType);
		}
	}

	public static EdiOrderHeader buildEdiOrderHeader(OrderType orderType)
	{
		EdiOrderHeader ediOrderHeader = build(EdiOrderHeader.class);
//		ediOrderHeader.addDate(buildEdiOrderDate());
//		ediOrderHeader.addLine(buildEdiOrderLine());
		ediOrderHeader.getDates().forEach(d->d.getPk().setEdiOrderHeader(ediOrderHeader));
		ediOrderHeader.getLines().forEach(l->l.getId().setEdiOrderHeader(ediOrderHeader));
//		ediOrderHeader.setConsumerAddress(build(LegacyConsumerAddress.class));
//		ediOrderHeader.setShipToAddress(build(LegacyShipToAddress.class));
//		ediOrderHeader.setThirdPartyAddress(build(LegacyThirdPartyAddress.class));
		ediOrderHeader.setOrderType(orderType.toString().substring(0,1));
		ediOrderHeader.setOrderTypeDesc(orderType.toString());
		ediOrderHeader.setOrderLoc("01");
		logger.debug(ediOrderHeader.toString());
		return ediOrderHeader;
	}

	public static EdiOrderDate buildEdiOrderDate()
	{
		EdiOrderDate ediOrderDate = build(EdiOrderDate.class);
		ediOrderDate.setPk(new EdiOrderDatePK(randomAlphabetic(3),null));
		logger.debug(ediOrderDate.toString());
		return ediOrderDate;
	}

	public static EdiOrderLine buildEdiOrderLine()
	{
		EdiOrderLine ediOrderLine = build(EdiOrderLine.class);
		ediOrderLine.setId(new EdiOrderLinePK(null,randomAlphabetic(10)));
		logger.debug(ediOrderLine.toString());
		return ediOrderLine;
	}

}
