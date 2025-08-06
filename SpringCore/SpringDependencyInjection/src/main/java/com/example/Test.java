package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		//step1 - to start IOC container
		ApplicationContext ap = new ClassPathXmlApplicationContext("spring.xml");
		
		/*//explicitly gold class method call through IOC container
		Gold g = ap.getBean(Gold.class);
		g.getBooking(2);
		*/
		
		BookingService bs = ap.getBean(BookingService.class);
		bs.getBookingService(3);
	}

}
