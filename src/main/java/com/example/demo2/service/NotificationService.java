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
        StringBuilder mailContent = new StringBuilder();
        mailMessage.setTo(student.getEmail());
        mailMessage.setFrom("razvandragos099@gmail.com");
        mailMessage.setSubject("Register confirmation");
        mailContent
                .append("Hello ")
                .append(student.getFirstName())
                .append(" ")
                .append(student.getLastName())
                .append(", \n")
                .append("Thank you for registering with us!");
        mailMessage.setText(mailContent.toString());
        javaMailSender.send(mailMessage);
    }
}
