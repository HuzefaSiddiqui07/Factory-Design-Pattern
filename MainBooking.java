package com.factorydesignpattern.ticketbooking;

// Step 6 - Create the factory class to get the object of concrete class by passing the data.

import java.util.Scanner;

public class MainBooking {

	public static void main(String[] args) {

		try {

			String booking;
			System.out.println("Enter the AC Class Type");
			Scanner scanner = new Scanner(System.in);
			booking = scanner.next();

			Booking b = BookingFactory.createBooking(booking);
			System.out.println(b.getACClass());

			scanner.close();

		} catch (Exception e) {

			System.out.println(e);

		}

	}

}
