package com.shaw.ediorderservices.helper;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;

import java.util.ArrayList;

import org.apache.commons.lang3.RandomUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.shaw.ediorderservices.exception.ResourceCreationException;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderDate;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderDate.EdiOrderDatePK;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderHeader;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderLine;
import com.shaw.ediorderservices.persistance.db2.entity.EdiOrderLine.EdiOrderLinePK;
import com.shaw.ediorderservices.persistance.sqlserver.entity.line.CarpetEdiLine;
import com.shaw.ediorderservices.persistance.sqlserver.entity.line.EdiLine;
import com.shaw.ediorderservices.persistance.sqlserver.entity.line.UnitsEdiLine;
import com.shaw.ediorderservices.persistance.sqlserver.entity.line.SamplesEdiLine;
import com.shaw.ediorderservices.persistance.sqlserver.entity.order.CarpetEdiOrder;
import com.shaw.ediorderservices.persistance.sqlserver.entity.order.EdiOrder;
import com.shaw.ediorderservices.persistance.sqlserver.entity.order.UnitsEdiOrder;
import com.shaw.ediorderservices.persistance.sqlserver.entity.order.OrderType;
import com.shaw.ediorderservices.persistance.sqlserver.entity.order.SamplesEdiOrder;
import com.shaw.mock.builder.MockBuilder;

public class MockHelper {

    protected static final Logger logger = LogManager.getLogger();

	protected static MockBuilder mockBuilder = new MockBuilder();

	public EdiOrder buildEdiOrder(OrderType orderType)
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
		ediOrder.setLines(new ArrayList<EdiLine>());
		ediOrder.addLine(ediLine);
//		ediOrder.setCancelDate(build(CancelDate.class));
//		ediOrder.setPoDate(build(PoDate.class));
//		ediOrder.setShipDate(build(ShipDate.class));

		ediOrder.getConsumerAddress().setShipFlag("N");
		ediOrder.setOrderType(orderType.toString());
		
		logger.debug(ediOrder.toString());
		return ediOrder;
	}

	private EdiOrder getOrderInstance(String orderType) {
		switch (orderType) {
		case "SAMPLES":
			return mockBuilder.build(SamplesEdiOrder.class);
		case "CARPET":
			return mockBuilder.build(CarpetEdiOrder.class);
		case "UNITS":
			return mockBuilder.build(UnitsEdiOrder.class);
		default:
			throw new ResourceCreationException("EdiOrder for " + orderType);
		}
	}

	private EdiLine getLineInstance(String orderType) {
		switch (orderType) {
		case "SAMPLES":
			return mockBuilder.build(SamplesEdiLine.class);
		case "CARPET":
			return mockBuilder.build(CarpetEdiLine.class);
		case "UNITS":
			return mockBuilder.build(UnitsEdiLine.class);
		default:
			throw new ResourceCreationException("EdiLine for " + orderType);
		}
	}

	public EdiOrderHeader buildEdiOrderHeader(OrderType orderType)
	{
		EdiOrderHeader ediOrderHeader = mockBuilder.build(EdiOrderHeader.class);
//		ediOrderHeader.setLegacyOrderNumber(RandomUtils.nextLong());
//		ediOrderHeader.addDate(buildEdiOrderDate());
//		ediOrderHeader.addLine(buildEdiOrderLine());
//		ediOrderHeader.getDates().forEach(d->d.setEdiOrderHeader(ediOrderHeader));
//		ediOrderHeader.getLines().forEach(l->l.setEdiOrderHeader(ediOrderHeader));
//		ediOrderHeader.setConsumerAddress(build(LegacyConsumerAddress.class));
//		ediOrderHeader.setShipToAddress(build(LegacyShipToAddress.class));
//		ediOrderHeader.setThirdPartyAddress(build(LegacyThirdPartyAddress.class));
		ediOrderHeader.setOrderType(orderType.toString().substring(0,1));
		ediOrderHeader.setOrderTypeDesc(orderType.toString());
//		ediOrderHeader.setLegacyOrderNumber(RandomUtils.nextLong(0,999999999));
		ediOrderHeader.setOrderLoc("01");
		logger.debug(ediOrderHeader.toString());
		return ediOrderHeader;
	}

	public EdiOrderDate buildEdiOrderDate()
	{
		EdiOrderDate ediOrderDate = mockBuilder.build(EdiOrderDate.class);
		ediOrderDate.setId(new EdiOrderDatePK(randomAlphabetic(3),null));
		logger.debug(ediOrderDate.toString());
		return ediOrderDate;
	}

	public EdiOrderLine buildEdiOrderLine()
	{
		EdiOrderLine ediOrderLine = mockBuilder.build(EdiOrderLine.class);
		ediOrderLine.setId(new EdiOrderLinePK(null,RandomUtils.nextInt(0, 999)));
		logger.debug(ediOrderLine.toString());
		return ediOrderLine;
	}

}
