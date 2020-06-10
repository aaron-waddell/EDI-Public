package com.shaw.ediorderservices.helper;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;

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
import com.shaw.ediorderservices.persistance.sqlserver.entity.address.ConsumerAddress;
import com.shaw.ediorderservices.persistance.sqlserver.entity.address.ShipToAddress;
import com.shaw.ediorderservices.persistance.sqlserver.entity.address.ThirdPartyAddress;
import com.shaw.ediorderservices.persistance.sqlserver.entity.date.CancelDate;
import com.shaw.ediorderservices.persistance.sqlserver.entity.date.PoDate;
import com.shaw.ediorderservices.persistance.sqlserver.entity.date.ShipDate;
import com.shaw.ediorderservices.persistance.sqlserver.entity.line.CarpetEdiLine;
import com.shaw.ediorderservices.persistance.sqlserver.entity.line.EdiLine;
import com.shaw.ediorderservices.persistance.sqlserver.entity.line.HardsurfacesEdiLine;
import com.shaw.ediorderservices.persistance.sqlserver.entity.line.SamplesEdiLine;
import com.shaw.ediorderservices.persistance.sqlserver.entity.order.CarpetEdiOrder;
import com.shaw.ediorderservices.persistance.sqlserver.entity.order.EdiOrder;
import com.shaw.ediorderservices.persistance.sqlserver.entity.order.HardsurfacesEdiOrder;
import com.shaw.ediorderservices.persistance.sqlserver.entity.order.OrderType;
import com.shaw.ediorderservices.persistance.sqlserver.entity.order.SamplesEdiOrder;

public class MockObject<Any> {

    protected static final Logger logger = LogManager.getLogger();

    @SuppressWarnings("unchecked")
	public static <Any>Any build(Class<?> clazz)
	{
    	List<Field> fields = collectFields(clazz).collect(Collectors.toList());
		fields = fields.parallelStream()
				.filter(fi->Modifier.isStatic(fi.getModifiers())==false 
							&& Modifier.isFinal(fi.getModifiers())==false
							&& Modifier.isTransient(fi.getModifiers())==false
							&& Modifier.isVolatile(fi.getModifiers())==false)
				.filter(f->f.getAnnotation(GeneratedValue.class)==null)
				.collect(Collectors.toList());

		fields.parallelStream().forEach(m->m.setAccessible(true));
		Object obj;
		try {
			obj = clazz.getDeclaredConstructor().newInstance();
			fields.parallelStream().forEach(f->setMockValue(obj, f));
			return (Any) obj;
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		}
		return null;
	}

    private static Stream<Field> collectFields(Class<?> clazz)
    {
		if (clazz.getDeclaredFields().length==0)
			return Stream.empty();
		Stream<Field> s = Stream.of(clazz.getDeclaredFields());
		if (clazz.getSuperclass()!=null)
			return Stream.concat(s, collectFields(clazz.getSuperclass()));
    	return s;
    }

    private static void setMockValue(Object obj, Field f) {
		f.setAccessible(true);

		int strLength = f.getAnnotation(Column.class)!=null?f.getAnnotation(Column.class).length():20;  //limit length of Strings for data columns
		Object value = null;
		if (f.getType().getSimpleName().equals("String") && f.getName().toLowerCase().endsWith("date"))
			value = randomDate().toString(); //added for OrderHeaderView
		else if (f.getType().getSimpleName().equals("String"))
			value = randomAlphabetic(Math.min(strLength,20));
		else if (f.getType().getSimpleName().equals("int") || f.getType().isAssignableFrom(Integer.class))
			value = RandomUtils.nextInt(0,999999);
		else if (f.getType().getSimpleName().equals("long") || f.getType().isAssignableFrom(Long.class))
			value = RandomUtils.nextLong(0,999999999);
		else if (f.getType().getSimpleName().equals("double") || f.getType().isAssignableFrom(Double.class))
			value = RandomUtils.nextDouble(0,9999999);		
		else if (f.getType().getSimpleName().equals("boolean") || f.getType().isAssignableFrom(Boolean.class))
			value = true;		
		else if (f.getType().isAssignableFrom(LocalDate.class))
			value = randomDate();
		else if (f.getType().isAssignableFrom(LocalDateTime.class))
			value = randomDateTime();
		else if (f.getType().isAssignableFrom(List.class))
			value = null;
		else
			value = build(f.getType());

		try {
			f.set(obj,value);
		} catch (IllegalArgumentException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger.debug("set " + f.getName() + " -> " + value);
	}

	static LocalDate randomDate() {
		return LocalDate.ofEpochDay(RandomUtils.nextInt(0,10000));
	}

	static LocalDateTime randomDateTime() {
		return LocalDateTime.ofEpochSecond(RandomUtils.nextInt(0,10000), 0, ZoneOffset.UTC);
	}

	public static EdiOrder buildEdiOrder(OrderType orderType)
	{
		EdiOrder ediOrder = getOrderInstance(orderType.toString());
		
		ediOrder.setConsumerAddress(build(ConsumerAddress.class));
		ediOrder.setShipToAddress(build(ShipToAddress.class));
		ediOrder.setThirdPartyAddress(build(ThirdPartyAddress.class));
		EdiLine ediLine = getLineInstance(orderType.toString());
		ediLine.setLineType(orderType.toString());
		ediOrder.addLine(ediLine);
		ediOrder.setCancelDate(build(CancelDate.class));
		ediOrder.setPoDate(build(PoDate.class));
		ediOrder.setShipDate(build(ShipDate.class));

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
		ediOrderHeader.addDate(buildEdiOrderDate());
		ediOrderHeader.addLine(buildEdiOrderLine());
		ediOrderHeader.setConsumerAddress(MockObject.build(LegacyConsumerAddress.class));
		ediOrderHeader.setShipToAddress(MockObject.build(LegacyShipToAddress.class));
		ediOrderHeader.setThirdPartyAddress(MockObject.build(LegacyThirdPartyAddress.class));
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
