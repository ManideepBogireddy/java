package com.corejava.switchcase;

import java.util.*;


public class RestaurantBillingSystem {
	
	Scanner sc = new Scanner(System.in);
	
	void billingSystem() {
		
		String yn = "";
		String item = "";
		double price = 0;
		do {
			System.out.println("=================RESTAURANT MENU==================");
			System.out.println("1. Pizza      - ₹250");
			System.out.println("2. Burger     - ₹150");
			System.out.println("3. Sandwich   - ₹120");
			System.out.println("4. Coke       - ₹50");
			System.out.println("5. Exit");
			System.out.println("==================================================");
			
			System.out.println("Enter your Choice: ");
			int n = sc.nextInt();
			
			switch(n) {
			case 1 -> {
				item = "Pizaa";
				price = 250;
		
			}
			case 2 -> {
				item = "Burger";
				price = 150;
				}
			case 3 -> {
				item = "Sandwich";
				price = 120;
				}
			case 4 -> {
				item = "Coke";
				price = 50;
				}
			case 5 -> {
				System.out.println("Thank You For Visiting! ");
				}
			
			default -> {
				System.out.println("Entered Invalid Input ");
			}
			
			}
			
			System.out.println("Enter Quantity : ");
			int quantity = sc.nextInt();
			
			double amount = quantity * price;
			
			double gst = amount * 18/100;
			
			double total = amount + gst;
			
			double discount = 0;
			
			if(total > 1000) {
				discount = total * 5 /100;
				total = total - discount;
			}

            System.out.println("\n========== BILL ==========");
            System.out.println("Item        : " + item);
            System.out.println("Price       : ₹" + price);
            System.out.println("Quantity    : " + quantity);
            System.out.println("Subtotal    : ₹" + amount);
            System.out.println("GST (18%)   : ₹" + gst);

            if (discount > 0) {
                System.out.println("Discount(5%): ₹" + discount);
            }

            System.out.println("----------------------------");
            System.out.println("Total Bill  : ₹" + total);
            System.out.println("============================");
			
			
			
			System.out.println("Do You Want To Continue (y/n): ");
			yn = sc.next();
		} while(yn.equalsIgnoreCase("y"));
		
		System.out.println("Thank You! Visit Again ");
		sc.close();
	}

	public static void main(String[] args) {
		RestaurantBillingSystem rbs = new RestaurantBillingSystem();
		rbs.billingSystem();
		
	}

}
