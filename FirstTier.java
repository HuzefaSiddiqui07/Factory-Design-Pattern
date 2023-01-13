package com.factorydesignpattern.ticketbooking;

// Step 2- Create the concrete class First tier will implement the same interface

public class FirstTier implements Booking {

	@Override
	public String getACClass() {

		return "First Class AC - Seat Availability : 10";
	}

}
