package com.corejava.switchcase;

import java.util.*;


public class MovieTickets {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String yn = "";
        do {
		System.out.println("Types of tickets");
		System.out.println("1.Silver - RS: 200");
		System.out.println("2.Gold - Rs: 300");
		System.out.println("3.Platinum - Rs: 500");

		System.out.println("Enter your choice: ");
		int n = sc.nextInt();
		System.out.println("Enter your age: ");
		int age = sc.nextInt();

		switch (n) {
		case 1:

			double Sprice = 200;
			if (age >= 60) {
				Sprice = Sprice - (Sprice * 10 / 100);
				System.out.println("Silver Ticket Price : " + Sprice);
			} else {
				System.out.println("Silver Ticket Price : " + Sprice);
			}
			break;
			
		case 2:

			double Gprice = 300;
			if (age >= 60) {
				Gprice = Gprice - (Gprice * 10 / 100);
				System.out.println("Gold Ticket Price : " + Gprice);
			} else {
				System.out.println("Gold Ticket Price : " + Gprice);
			}
			break;
			
		case 3:

			double Pprice = 500;
			if (age >= 60) {
				Pprice = Pprice - (Pprice * 10 / 100);
				System.out.println("Platinum Ticket Price : " + Pprice);
			} else {
				System.out.println("Platinum Ticket Price : " + Pprice);
			}
			break;

		default:
			System.out.println("Invalid Input");

		}
		
		System.out.println("Do you want me to continue ? (y/n): ");
		
        yn = sc.next();
        
        } while(yn.equalsIgnoreCase("y"));
        
        System.out.println("Thank you! Visit Again.");
		sc.close();

	}

}
