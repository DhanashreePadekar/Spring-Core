package com.example.aw_constructor;

public class Silver implements Booking{

	public Silver() {
		
		System.out.println("Silver constructor");
	}

	@Override
	public boolean getBooking(int amt) {
		System.out.println("Gold seat selected...");
		return true;	
	}

}
