package com.yash.springIOCExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		Employee e = context.getBean("emp", Employee.class);
		System.out.println(e);
	}

}
