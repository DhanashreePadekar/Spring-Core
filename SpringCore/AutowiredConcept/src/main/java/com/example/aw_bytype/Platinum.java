package com.example.aw_bytype;

public class Platinum implements Booking{

	
	public Platinum() {
		System.out.println("Platinum constructor");
	}

	@Override
	public boolean getBooking(int amt) {
		System.out.println("Platinum seat selected...");
		return true;
	}

}
