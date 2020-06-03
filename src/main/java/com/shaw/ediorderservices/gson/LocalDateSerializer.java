package com.shaw.ediorderservices.gson;

import java.lang.reflect.Type;
import java.time.LocalDate;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class LocalDateSerializer implements JsonSerializer<LocalDate> {
	 
    public JsonElement serialize(LocalDate ld, Type type,
        JsonSerializationContext jsonSerializationContext) 
    {
        return new JsonPrimitive(ld.format(java.time.format.DateTimeFormatter.ISO_LOCAL_DATE));
    }
}