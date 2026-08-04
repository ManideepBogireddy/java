package com.corejava.switchcase;

import java.util.*;

public class RailwayReservationSystem {

	Scanner sc = new Scanner(System.in);

	void reservationSystem() {

		String yn = "";
		String coach = "";
		double price = 0;

		do {
			coach = "";
			price = 0;

			System.out.println("============================================");
			System.out.println("          INDIAN RAILWAY RESERVATION        ");
			System.out.println("============================================");
			System.out.println("1. Sleeper      - Rs: 450");
			System.out.println("2. AC 3 Tier    - Rs: 850");
			System.out.println("3. AC 2 Tier    - Rs: 1450");
			System.out.println("4. First AC     - Rs: 2500");
			System.out.println("5. Exit");

			System.out.println("Enter Your Choice: ");
			int choice = sc.nextInt();

			switch (choice) {

			case 1 -> {
				coach = "Sleeper";
				price = 450;
			}
			case 2 -> {
				coach = "AC 3 Tier";
				price = 850;
			}
			case 3 -> {
				coach = "AC 2 Tier";
				price = 1450;
			}
			case 4 -> {
				coach = "First Ac";
				price = 2500;
			}
			case 5 -> {
				System.out.println("Thank You For Visiting!");
				sc.close();
				return;
			}
			default -> {
				System.out.println("Invalid Input.");
			}
			}
			if (price == 0) {
				continue;
			}
			sc.nextLine(); 

			System.out.println("Enter Passenger Name: ");
			String name = sc.nextLine();

			System.out.println("Enter Age: ");
			int age = sc.nextInt();

			System.out.println("Enter Gender: ");
			String gender = sc.next();

			System.out.println("Enter Mobile Number: ");
			long number = sc.nextLong();
			
			sc.nextLine(); 

			System.out.println("From: ");
			String from = sc.nextLine();

			System.out.println("To: ");
			String to = sc.nextLine();


			System.out.println("Journey Date in the format of (DD/MM/YYYY) : ");
			String date = sc.nextLine();
			
			System.out.println("Enter Number of Tickets: ");
			int tickets = sc.nextInt();

			double subTotal = price * tickets;

			double gst = subTotal * 5 / 100;

			double total = subTotal + gst;

			double discount = 0;
			if (age >= 60) {
				discount = subTotal * 10 / 100;
				total = total - discount;
			}

			System.out.println("===================================");
			System.out.println("       INDIAN RAILWAY TICKET       ");
			System.out.println("===================================");

			System.out.println("Passenger Name   : " + name);
			System.out.println("Age              : " + age);
			System.out.println("Gender           : " + gender);
			System.out.println("Mobile Number    : " +number);
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("From             : " + from);
			System.out.println("To               : " + to);
			System.out.println("Date             : " +date);
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("Coach            : " + coach);
			System.out.println("Ticket Price     : Rs:" + price);
			System.out.println("Tickets          : " + tickets);
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("Subtotal         : " + subTotal);
			System.out.println("Discount         : Rs:" + discount);
			System.out.println("GST              : Rs:" + gst);
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("-----------------------------------");
			System.out.println("Total Amount     : Rs:" + total);
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("Thank You!");
			System.out.println("Happy Journey!");
			System.out.println("===================================");

			System.out.println("Do You Want To Continue (y/n) : ");
			yn = sc.next();

		} while (yn.equalsIgnoreCase("y"));
		
		sc.close();
		System.out.println("Thank You!");

	}

	public static void main(String[] args) {
		RailwayReservationSystem rrs = new RailwayReservationSystem();
		rrs.reservationSystem();

	}

}
