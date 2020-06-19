package com.shaw.ediorderservices.gson;

import java.lang.reflect.Type;
import java.time.LocalTime;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

public class LocalTimeDeserializer implements JsonDeserializer<LocalTime> {
	 
	@Override
	public LocalTime deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
			throws JsonParseException {
		String j = json.getAsString();
        LocalTime lt = LocalTime.parse(j);
        return lt;
	}
}