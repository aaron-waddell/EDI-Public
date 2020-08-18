package com.shaw.ediorderservices.gson;

import java.lang.reflect.Type;
import java.time.LocalDate;

import javax.xml.datatype.XMLGregorianCalendar;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;

public class XMLGregorianCalendarDeserializer implements JsonDeserializer<XMLGregorianCalendar> {
	 
	@Override
	public XMLGregorianCalendar deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
			throws JsonParseException {
		String j = json.getAsString();
		XMLGregorianCalendar gc = XMLGregorianCalendarImpl.parse(j);
        return gc;
	}
}