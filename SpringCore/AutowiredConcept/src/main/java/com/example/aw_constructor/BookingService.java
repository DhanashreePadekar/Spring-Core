package com.example.aw_constructor;

public class BookingService {
	
	public Booking booking; //Field base DI
	
	public BookingService() {
	}

	public BookingService(Booking booking) { //Constructor Based Injection
		this.booking = booking;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) { //setter Based Injection
		this.booking = booking;
	}
	
	public void getBookingService(int amt) {
		
		boolean status = booking.getBooking(amt);
		
		if(status) {
			System.out.println("Booking Confirmed");
		}
		else {
			System.out.println("Booking not Confirmed");

		}
	}
}
