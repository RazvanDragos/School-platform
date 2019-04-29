package com.example.demo2.service;

import com.example.demo2.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    private JavaMailSender javaMailSender;

    @Autowired
    public NotificationService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    public void sendNotification(Student student) throws MailException {
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo(student.getEmail());
        mailMessage.setFrom("razvandragos099@gmail.com");
        mailMessage.setSubject("Test application mail");
        mailMessage.setText("Hello, " + "\n" +
                "This is a test to verify if the mail was successfully sent!" + "\n" +
                "If successful, please send a :* on messenger!");
        javaMailSender.send(mailMessage);
    }
}
