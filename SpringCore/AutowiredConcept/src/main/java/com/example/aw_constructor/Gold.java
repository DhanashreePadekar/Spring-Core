package com.example.aw_constructor;

public class Gold implements Booking{

	public Gold() {
		
		System.out.println("Gold constructor");

	}
	
	@Override
	public boolean getBooking(int amt) {
		System.out.println("Gold seat selected...");
		return true;
	}

}
