package com.learnspringboot.lecture1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LearnByAnujApplication implements CommandLineRunner {
	notificationService serviceHandler;

	public LearnByAnujApplication(notificationService serviceHandler){
		this.serviceHandler = serviceHandler;
	}
	public static void main(String[] args) {
		SpringApplication.run(LearnByAnujApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//checking commit
		//i am in newBranch
		serviceHandler.send("Yes");
	}

}
