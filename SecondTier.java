package com.factorydesignpattern.ticketbooking;

// Step 3 - Create the concrete class Second tier will implement the same interface

public class SecondTier implements Booking {

	@Override
	public String getACClass() {

		return "Second Class AC - Seat Availability : 20";
	}

}
