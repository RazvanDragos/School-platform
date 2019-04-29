package com.example.demo2.controller;

import com.example.demo2.model.Student;
import com.example.demo2.service.NotificationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {
    private final NotificationService notificationService;
    private Logger logger = LoggerFactory.getLogger(RegistrationController.class);

    @Autowired
    public RegistrationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @RequestMapping(path = "/signup")
    public String signUp() {
        return "Please sign in for our service.";
    }

    @RequestMapping(path = "signup-success")
    public String signUpSuccess() {
        Student student = new Student();
        student.setFirstName("Mircea-Razvan");
        student.setLastName("Dragos");
        student.setAge(30);
        student.setEmail("razvan_dragos09@yahoo.com"); //where the email is sent

        try {
            notificationService.sendNotification(student);
        } catch (MailException e) {
            logger.info("Error sending email: " + e.getMessage());
        }

        return "Successful sign up!";
    }
}
