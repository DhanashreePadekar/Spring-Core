package com.example.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.service.BookService;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ap = new ClassPathXmlApplicationContext("spring.xml");
		BookService bs = ap.getBean(BookService.class);
		bs.saveBook();
	}

}
