package com.ping.service;

import java.util.List;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.ping.common.EmailUtility;
import com.ping.entity.EmailModel;

public class EmailService implements IEmailService {
	private Session session;

	public EmailService() {
		session = EmailUtility.setEmailDetails();
	}

	public boolean sendEmail(EmailModel emailModel) {
		session.setDebug(true);
		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(emailModel.getFromEmail()));
			if(emailModel.getToEmail().size() > 0) {
				for (String to : emailModel.getToEmail()) {
					message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
				}
			}
			if(emailModel.getCcEmail().size() > 0) {
				for (String cc : emailModel.getCcEmail()) {
					message.addRecipient(Message.RecipientType.CC, new InternetAddress(cc));
				}
			}
			if(emailModel.getBccEmail().size() > 0) {
				for (String bcc : emailModel.getBccEmail()) {
					message.addRecipient(Message.RecipientType.BCC, new InternetAddress(bcc));
				}
			}
			
			message.setSubject(emailModel.getSubject());
			message.setText(emailModel.getEmailBody());
			System.out.println("sending...");
			Transport.send(message);
			System.out.println("Sent message successfully....");
			return true;
		} catch (MessagingException mex) {
			mex.printStackTrace();
			return false;
		}
	}

	public String emailWithComma(List<String> list) {
		StringBuilder builder = new StringBuilder();
		for (String string : list) {
			builder.append(string+",");
		}
		return builder.toString().substring(0, builder.toString().length() - 1 );
	}

}
