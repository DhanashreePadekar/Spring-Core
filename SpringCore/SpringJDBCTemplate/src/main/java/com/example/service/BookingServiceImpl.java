package com.example.service;

import com.example.dao.BookDao;

public class BookingServiceImpl implements BookService{

	//DI
	private BookDao bookDao;
	
	
	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	@Override
	public boolean saveBook() {
		
		boolean status = bookDao.save();
		
		if(status) {
			System.out.println("Record inserted");
		}
		else {
			System.out.println("Record not inserted");
		}
		return true;
	}

}
