package com.shaw.ediorderservices.gson;

import java.lang.reflect.Type;
import java.time.LocalTime;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class LocalTimeSerializer implements JsonSerializer<LocalTime> {
	 
    public JsonElement serialize(LocalTime ldt, Type type,
        JsonSerializationContext jsonSerializationContext) 
    {
        return new JsonPrimitive(ldt.format(java.time.format.DateTimeFormatter.ISO_LOCAL_TIME));
    }
}