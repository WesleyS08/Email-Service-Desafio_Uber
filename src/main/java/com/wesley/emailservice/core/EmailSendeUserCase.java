package com.wesley.emailservice.core;


public interface EmailSendeUserCase {

    void sendEmail(String to, String subject, String body);
}

