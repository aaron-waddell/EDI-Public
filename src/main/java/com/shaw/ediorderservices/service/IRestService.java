package com.shaw.ediorderservices.service;

import java.net.URI;

import com.shaw.ediorderservices.service.common.IEntityBody;

public interface IRestService {
	
	public String postForObject(URI uri, IEntityBody body);

	public String putForObject(URI uri, IEntityBody body);

	String postForObject(URI uri);

}
