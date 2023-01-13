package com.factorydesignpattern.ticketbooking;

// Step 5 - Create class BookingFactory to generate the object of concrete class.

public class BookingFactory {

	// Design a factory method here
	// input should be first , second & third...

	public static Booking createBooking(String input) {

		if (input.equalsIgnoreCase("first")) {

			return new FirstTier();

		} else if (input.equalsIgnoreCase("second")) {

			return new SecondTier();

		} else if (input.equalsIgnoreCase("third")) {

			return new ThirdTier();

		}

		throw new IllegalArgumentException("Invalid input from user...");
	}

}
