package com.example.emailsenderservice.service;

public interface EmailSenderService {

    void sendEmail(String to, String subject, String message);

}
