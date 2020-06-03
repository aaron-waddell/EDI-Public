package com.shaw.ediorderservices.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceCreationException extends RuntimeException {

	public ResourceCreationException() {
		super();
	}

	public ResourceCreationException(String msg) {
		super(msg);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
