package com.shaw.ediorderservices.service.common;

import java.util.List;

public class EmailRequest implements IEntityBody {

	private String emailBody;
	private String subject;
	private List<String> addresses;

	public EmailRequest() {
		super();
	}

	public EmailRequest(String subject, String emailBody, List<String> addresses) {
		this.subject = subject;
		this.emailBody = emailBody;
		this.addresses = addresses;
	}

	public String getEmailBody() {
		return emailBody;
	}

	public void setEmailBody(String emailBody) {
		this.emailBody = emailBody;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public List<String> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<String> addresses) {
		this.addresses = addresses;
	}

}
