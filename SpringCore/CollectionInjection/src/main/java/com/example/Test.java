package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main (String arg[]) {
		
		//step 1 : start to IOC container
		ApplicationContext ap = new ClassPathXmlApplicationContext("spring.xml");
		Student s1 = ap.getBean(Student.class);
		
		System.out.println(s1);
	}
}
