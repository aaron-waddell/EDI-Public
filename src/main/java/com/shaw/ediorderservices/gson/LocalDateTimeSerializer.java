package com.shaw.ediorderservices.gson;

import java.lang.reflect.Type;
import java.time.LocalDateTime;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class LocalDateTimeSerializer implements JsonSerializer<LocalDateTime> {
	 
    public JsonElement serialize(LocalDateTime ldt, Type type,
        JsonSerializationContext jsonSerializationContext) 
    {
        return new JsonPrimitive(ldt.format(java.time.format.DateTimeFormatter.ISO_LOCAL_DATE_TIME));
    }
}