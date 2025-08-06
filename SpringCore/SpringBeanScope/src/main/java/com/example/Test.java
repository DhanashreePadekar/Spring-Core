package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		//step1 - to start IOC container
		ApplicationContext ap = new ClassPathXmlApplicationContext("spring.xml");
		
		// Gold class is singleton scope
		Gold g1 = ap.getBean(Gold.class);
		System.out.println(g1.hashCode());
		
		Gold g2 = ap.getBean(Gold.class);
		System.out.println(g2.hashCode());
		
		// Silver class is prototype scope
		
		Silver s1 = ap.getBean(Silver.class);
		System.out.println(s1.hashCode());
		
		Silver s2 = ap.getBean(Silver.class);
		System.out.println(s2.hashCode());
	}

}
