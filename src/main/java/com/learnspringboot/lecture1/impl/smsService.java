package com.learnspringboot.lecture1.impl;
import  com.learnspringboot.lecture1.notificationService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class smsService implements notificationService{
    @Override
    public void send(String massage) {
        System.out.println("You are using sms as service");
    }
}
