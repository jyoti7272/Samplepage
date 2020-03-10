package com.ping.service;

import com.ping.entity.EmailModel;

public interface IEmailService {
	public boolean sendEmail(EmailModel emailModel);
}
