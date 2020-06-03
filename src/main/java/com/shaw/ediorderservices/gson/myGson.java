package com.shaw.ediorderservices.gson;

import java.time.LocalDate;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.shaw.ediorderservices.enums.OrderType;
import com.shaw.ediorderservices.persistance.sqlserver.entity.CarpetEdiLine;
import com.shaw.ediorderservices.persistance.sqlserver.entity.CarpetEdiOrder;
import com.shaw.ediorderservices.persistance.sqlserver.entity.EdiLine;
import com.shaw.ediorderservices.persistance.sqlserver.entity.EdiOrder;
import com.shaw.ediorderservices.persistance.sqlserver.entity.HardsurfacesEdiLine;
import com.shaw.ediorderservices.persistance.sqlserver.entity.HardsurfacesEdiOrder;
import com.shaw.ediorderservices.persistance.sqlserver.entity.SamplesEdiLine;
import com.shaw.ediorderservices.persistance.sqlserver.entity.SamplesEdiOrder;

import javassist.Modifier;

public class myGson {

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
