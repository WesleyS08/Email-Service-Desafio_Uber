package com.wesley.emailservice.application;

import com.wesley.emailservice.adapters.EmailSenderGateway;
import com.wesley.emailservice.core.EmailSendeUserCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class EmailSendService implements EmailSendeUserCase {

    private final EmailSenderGateway emailSenderGateway;

    @Autowired
    public EmailSendService(EmailSenderGateway emailGateway){
        this.emailSenderGateway = emailGateway;

    }
    @Override
    public static void sendEmail(String to, String subject, String body) {
        this.emailSenderGateway.sendEmail(to, subject, body);
    }
}
