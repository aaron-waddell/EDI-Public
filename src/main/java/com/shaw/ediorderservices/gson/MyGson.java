package com.shaw.ediorderservices.gson;

import java.time.LocalDate;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.shaw.ediorderservices.persistance.sqlserver.entity.line.CarpetEdiLine;
import com.shaw.ediorderservices.persistance.sqlserver.entity.line.EdiLine;
import com.shaw.ediorderservices.persistance.sqlserver.entity.line.HardsurfacesEdiLine;
import com.shaw.ediorderservices.persistance.sqlserver.entity.line.SamplesEdiLine;
import com.shaw.ediorderservices.persistance.sqlserver.entity.order.CarpetEdiOrder;
import com.shaw.ediorderservices.persistance.sqlserver.entity.order.EdiOrder;
import com.shaw.ediorderservices.persistance.sqlserver.entity.order.HardsurfacesEdiOrder;
import com.shaw.ediorderservices.persistance.sqlserver.entity.order.OrderType;
import com.shaw.ediorderservices.persistance.sqlserver.entity.order.SamplesEdiOrder;

import javassist.Modifier;

public class MyGson {

	public static Gson gson = new Gson();
	static {
		RuntimeTypeAdapterFactory<EdiOrder> orderAdapter = RuntimeTypeAdapterFactory.of(EdiOrder.class,"type")
				.registerSubtype(SamplesEdiOrder.class,OrderType.SAMPLES.toString())
				.registerSubtype(HardsurfacesEdiOrder.class,OrderType.HARDSURFACES.toString())
				.registerSubtype(CarpetEdiOrder.class,OrderType.CARPET.toString());

		RuntimeTypeAdapterFactory<EdiLine> lineAdapter = RuntimeTypeAdapterFactory.of(EdiLine.class,"type")
				.registerSubtype(SamplesEdiLine.class,OrderType.SAMPLES.toString())
				.registerSubtype(HardsurfacesEdiLine.class,OrderType.HARDSURFACES.toString())
				.registerSubtype(CarpetEdiLine.class,OrderType.CARPET.toString());
        
		gson = new GsonBuilder()
                .registerTypeAdapter(LocalDate.class, new LocalDateSerializer())
                .registerTypeAdapter(LocalDate.class, new LocalDateDeserializer())
                .registerTypeAdapterFactory(orderAdapter)
                .registerTypeAdapterFactory(lineAdapter)
                .setPrettyPrinting()
                .excludeFieldsWithModifiers(Modifier.VOLATILE, Modifier.STATIC)
                .create();

	}
	
}
