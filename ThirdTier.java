package com.factorydesignpattern.ticketbooking;

// Step 4 - Create the concrete class Third tier will implement the same interface

public class ThirdTier implements Booking {

	@Override
	public String getACClass() {

		return "Third Class AC - Seat Availability : 30";
	}

}
