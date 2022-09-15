package com.yash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringIocTask5Application {

	public static void main(String[] args) {
		// SpringApplication.run(SpringIocTask5Application.class, args);

		System.out.println("Using Setter Injection");
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		SetterMessage sm = (SetterMessage) context.getBean("settermessage");
		System.out.println(sm.getMessage());

	}

}
