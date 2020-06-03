package com.shaw.ediorderservices.service.impl;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.shaw.ediorderservices.hibernate.ServiceConfig;
import com.shaw.ediorderservices.persistance.sqlserver.entity.EdiValidation;
import com.shaw.ediorderservices.service.EdiOrderBean;
import com.shaw.ediorderservices.service.IEmailService;
import com.shaw.ediorderservices.service.IRestService;
import com.shaw.ediorderservices.service.common.EmailRequest;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class EmailService implements IEmailService {

	@Autowired
	protected EdiOrderBean ediOrderBean;

 	@Autowired
	ServiceConfig config;

	@Autowired
	IRestService restService;

	@Override
	public List<String> sendEmails() {
		List<String> descriptions = null;
		try {
			StringBuffer emailBody = new StringBuffer();
			// TODO Auto-generated method stub
			descriptions = ediOrderBean.getEdiOrder().getValidations().stream().map(EdiValidation::getDescription).collect(Collectors.toList());		
			descriptions.stream().forEach(d->emailBody.append(d.trim() + "<br>"));		
			sendEmail(emailBody.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return descriptions;
	}

	@Override
	public int sendEmail(String message) {

//			List<String> addresses = Arrays.asList(
////					"EDS030@shawinc.com"
////					,
//					"aaron.waddell@shawinc.com");

		List<String> addresses = Arrays.asList(config.getEmailAddresses());
		logger.info("sending email to: " 
				+ (addresses.size()>0?addresses.size() + " recipients" :"empty list"));

		logger.info("contents: " + message); 

	    String subjectLine = "Samples Order Entry Errors - " + config.getDatabaseRegion();
		
		EmailRequest request = new EmailRequest(subjectLine,message,addresses);
		
		URI uri;
		try {
			uri = new URI(config.getCswsServername() + "/Email");
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}

		restService.postForObject(uri,request);
		return 1;
	}
}
