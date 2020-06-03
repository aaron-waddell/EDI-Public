package com.shaw.ediorderservices.service.common;

import org.springframework.http.HttpHeaders;

public class HttpHeadersBuilder {

	private HttpHeaders headers = new HttpHeaders();

	public HttpHeadersBuilder add(String key, String value)
	{
		headers.add(key, value);
		return this;
	}
	
	public HttpHeaders build()
	{
		return headers;
	}
}
