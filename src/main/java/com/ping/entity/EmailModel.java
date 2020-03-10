package com.ping.entity;

import java.util.List;

public class EmailModel {
	private String fromEmail;
	private List<String> toEmail;
	private List<String> ccEmail;
	private List<String> bccEmail;
	private String subject;
	private String emailBody;
	public String getFromEmail() {
		return fromEmail;
	}
	public void setFromEmail(String fromEmail) {
		this.fromEmail = fromEmail;
	}
	public List<String> getToEmail() {
		return toEmail;
	}
	public void setToEmail(List<String> toEmail) {
		this.toEmail = toEmail;
	}
	public List<String> getCcEmail() {
		return ccEmail;
	}
	public void setCcEmail(List<String> ccEmail) {
		this.ccEmail = ccEmail;
	}
	public List<String> getBccEmail() {
		return bccEmail;
	}
	public void setBccEmail(List<String> bccEmail) {
		this.bccEmail = bccEmail;
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
	
	
	
}
