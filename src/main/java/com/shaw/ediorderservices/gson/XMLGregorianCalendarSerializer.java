package com.shaw.ediorderservices.gson;

import java.lang.reflect.Type;

import javax.xml.datatype.XMLGregorianCalendar;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class XMLGregorianCalendarSerializer implements JsonSerializer<XMLGregorianCalendar> {
	 
    public JsonElement serialize(XMLGregorianCalendar gc, Type type,
        JsonSerializationContext jsonSerializationContext) 
    {
        return new JsonPrimitive(gc.toString());
    }
}