package com.example.aw_constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		//step1 - to start IOC container
		ApplicationContext ap = new ClassPathXmlApplicationContext("springConstructor.xml");
		
		BookingService bs = ap.getBean(BookingService.class);
		bs.getBookingService(3);
	}
	
}
