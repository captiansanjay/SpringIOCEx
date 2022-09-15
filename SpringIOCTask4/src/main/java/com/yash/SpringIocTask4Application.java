package com.yash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringIocTask4Application {

	public static void main(String[] args) {
		// SpringApplication.run(SpringIocTask4Application.class, args);

		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		ConstructorMessage cm = (ConstructorMessage) context.getBean("constructormessage");
		System.out.println(cm.getMessage());
		

	}

}
