package com.shaw.ediorderservices.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface IEmailService {

	final static Logger logger = LoggerFactory.getLogger(IEmailService.class);

	public List<String> sendEmails();

	public int sendEmail(String message);
}
