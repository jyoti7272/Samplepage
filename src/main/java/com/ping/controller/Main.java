package com.ping.controller;

import java.util.ArrayList;
import java.util.List;

import com.ping.entity.EmailModel;
import com.ping.service.EmailService;
import com.ping.service.IEmailService;

public class Main {
	public static void main(String[] args) {
		IEmailService emailService = new EmailService();
		
		EmailModel emailModel = new EmailModel();
		emailModel.setFromEmail("singhujjawal751@gmail.com");
		List<String> to = new ArrayList<String>();
		to.add("gupta.pradeepkumar07@gmail.com");
		to.add("satyender301@gmail.com");
		emailModel.setToEmail(to);
		List<String> cc = new ArrayList<String>();
		cc.add("gupta.pradeepkumar07@gmail.com");
		cc.add("satyender301@gmail.com");
		emailModel.setCcEmail(cc);
		List<String> bcc = new ArrayList<String>();
		bcc.add("gupta.pradeepkumar07@gmail.com");
		bcc.add("satyender301@gmail.com");
		
		emailModel.setBccEmail(bcc);
		emailModel.setSubject("Test Email");
		emailModel.setEmailBody("Test email 21");
		
		emailService.sendEmail(emailModel);
	}
}
