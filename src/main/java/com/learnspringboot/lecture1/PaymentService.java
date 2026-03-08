package com.learnspringboot.lecture1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PaymentService {
    public void pay(){
        System.out.println("Using Pay");
    }

    @PostConstruct
    public void afterConstruct(){
        System.out.println("Hey i am initialization phase");
    }

    @PreDestroy
    public void beforeDestroy(){
        System.out.println("Hey i am destroy phase");
    }
}
