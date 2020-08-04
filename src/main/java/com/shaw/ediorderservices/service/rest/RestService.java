package com.shaw.ediorderservices.service.rest;

import java.net.URI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.shaw.ediorderservices.ServiceConfig;
import com.shaw.ediorderservices.service.common.IEntityBody;

@Service
//@Transactional(propagation = Propagation.REQUIRED)
public class RestService implements IRestService {

	@Autowired
	ServiceConfig config;
	

	protected final static Logger logger = LoggerFactory.getLogger(RestService.class);

	@Override
	public String postForObject(URI uri, IEntityBody body) {
		String response;
		try {
			HttpEntity<IEntityBody> httpEntityRequest = new HttpEntity<IEntityBody>(body,getHeaders());
			RestTemplate restTemplate = new RestTemplate();
			logger.debug("calling rest service (post): " + uri.getPath() + " : " + httpEntityRequest.toString());
			response = restTemplate.postForObject(uri, httpEntityRequest, String.class);
			return response;
		}
		catch (Exception e) {
			logger.error("Error in Rest Service: " + e.toString());
			throw new RuntimeException(e);
		}
	}

	private HttpHeaders getHeaders() {
		// TODO Auto-generated method stub
		return new HttpHeadersBuilder()
//				headers.setContentType(MediaType.APPLICATION_JSON);
				.add("userId", "EDIS")
				.add("applicationId", "EDIS")
				.add("businessFunc", "Edi Order Create")
				.add("applicationGuid", config.getAppGuid())
//				.setContentType(MediaType.APPLICATION_JSON);
				.add("x-3scale-proxy-secret-token", config.getSecretToken())
				.add("user-key", config.getUserKey())
				.build();
}

	@Override
	public String putForObject(URI uri, IEntityBody body) {
		ResponseEntity<String> response;
		try {
			HttpEntity<IEntityBody> httpEntityRequest = new HttpEntity<IEntityBody>(body,getHeaders());
			RestTemplate restTemplate = new RestTemplate();
			logger.debug("calling rest service (put): " + uri.getPath() + " : " + httpEntityRequest.toString());
			response = restTemplate.exchange(uri, HttpMethod.PUT, httpEntityRequest, String.class);
			return response.getBody();
		}
		catch (Exception e) {
			logger.error("Error in Rest Service : " + e.toString());
			throw new RuntimeException(e);
		}
	}

	@Override
	public String postForObject(URI uri) {
		String response;
		try {
			RestTemplate restTemplate = new RestTemplate();
			logger.debug("calling rest service (post): " + uri.getPath());
			response = restTemplate.postForObject(uri, null, String.class);
			return response;
		}
		catch (Exception e) {
			logger.error("Error in Rest Service : " + e.toString());
			throw new RuntimeException(e);
		}
	}

	@Override
	public String getForObject(URI uri) {
		String response;
		try {
			RestTemplate restTemplate = new RestTemplate();
			logger.debug("calling rest service (get): " + uri.getPath());
			response = restTemplate.getForObject(uri, String.class);
			return response;
		}
		catch (Exception e) {
			logger.error("Error in Rest Service : " + e.toString());
			throw new RuntimeException(e);
		}
	}

}
