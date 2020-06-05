package com.shaw.ediorderservices.service.rest;

import java.net.URI;

import com.shaw.ediorderservices.service.common.IEntityBody;

public interface IRestService {
	
	public String postForObject(URI uri, IEntityBody body);

	public String putForObject(URI uri, IEntityBody body);

	String postForObject(URI uri);

	String getForObject(URI uri);

}
