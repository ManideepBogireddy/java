package com.corejava.switchcase;

import java.util.*;

public class ShoppingMallBilling {
	Scanner sc = new Scanner(System.in);

	void billing() {

		String yn = "";
		String item = "";
		double price = 0;

		do {
			System.out.println("======================================");
			System.out.println("ABC SHOPPING MALL");
			System.out.println("======================================");
			System.out.println("1. Clothes");
			System.out.println("2. Shoes");
			System.out.println("3. Electronics");
			System.out.println("4. Grocery");
			System.out.println("5. Exit");

			System.out.println("Enter your choice: ");
			int n = sc.nextInt();

			switch (n) {

			case 1 -> {
				System.out.println("1. T-Shirt           - ₹599\r\n" + "2. Jeans             - ₹1299\r\n"
						+ "3. Shirt             - ₹899\r\n" + "4. Jacket            - ₹2499\r\n"
						+ "5. Saree             - ₹1999");
				System.out.println("Select Item: ");
				int s = sc.nextInt();
				switch (s) {
				case 1 -> {
					item = "T-Shirt";
					price = 599;
				}
				case 2 -> {
					item = "Jeans";
					price = 1299;
				}
				case 3 -> {
					item = "Shirt";
					price = 899;
				}
				case 4 -> {
					item = "Jacket";
					price = 2499;
				}
				case 5 -> {
					item = "Saree";
					price = 1999;
				}
				default -> {
					System.out.println("Invalid Input");
					break;
				}
				}

			}
			case 2 -> {
				System.out.println("1. Sports Shoes      - ₹2499\r\n"
						+ "2. Formal Shoes      - ₹1999\r\n"
						+ "3. Casual Shoes      - ₹1499\r\n"
						+ "4. Sandals           - ₹999\r\n"
						+ "5. Slippers          - ₹499");
				System.out.println("Select Iteam: ");
				int s = sc.nextInt();
				switch(s) {
				
				case 1 -> {
					item = "Sports Shoes";
					price = 2499;
				}
				case 2 -> {
					item = "Formal Shoes";
					price = 1999;
				}
				case 3 -> {
					item = "Casual Shoes";
					price = 1499;
				}
				case 4 -> {
					item = "Sandals";
					price = 999;
				}
				case 5 -> {
					item = "Slippers";
					price = 499;
				}
				default -> {
					System.out.println("Invalid Input");
					break;
				}
				}

			}
			
			case 3 -> {
				System.out.println("1. Headphones        - ₹1999\r\n"
						+ "2. Smart Watch       - ₹3499\r\n"
						+ "3. Bluetooth Speaker - ₹2499\r\n"
						+ "4. Power Bank        - ₹1299\r\n"
						+ "5. USB Pendrive      - ₹799");
				System.out.println("Select Iteam: ");
				int s = sc.nextInt();
				switch(s) {
				
				case 1 -> {
					item = "Headphones";
					price = 1999;
				}
				case 2 -> {
					item = "Smart Watch";
					price = 3499;
				}
				case 3 -> {
					item = "Bluetooth Speaker";
					price = 2499;
				}
				case 4 -> {
					item = "Power Bank";
					price = 1299;
				}
				case 5 -> {
					item = "USB Pendrive";
					price = 799;
				}
				default -> {
					System.out.println("Invalid Input");
					break;
				}
				}

			}
				
			case 4 ->{
				System.out.println("1. Rice (5kg)        - ₹450\r\n"
						+ "2. Wheat Flour(5kg)  - ₹320\r\n"
						+ "3. Cooking Oil (1L)  - ₹180\r\n"
						+ "4. Sugar (1kg)       - ₹55\r\n"
						+ "5. Milk (1L)         - ₹65");
				System.out.println("Select Iteam: ");
				int s = sc.nextInt();
				switch(s) {
				
				case 1 -> {
					item = "Rice";
					price = 450;
				}
				case 2 -> {
					item = "Wheat Flour";
					price = 320;
				}
				case 3 -> {
					item = "Cooking Oil";
					price = 180;
				}
				case 4 -> {
					item = "Sugar";
					price = 55;
				}
				case 5 -> {
					item = "Milk";
					price = 65;
				}
				default -> {
					System.out.println("Invalid Input");
					break;
				}
				}

			}
			
			case 5 -> {
				System.out.println("Thank You For Visiting");
				return;
			}

			default -> {
				System.out.println("Invalid Input");
			}
			}
            if (price == 0) {
                continue;
            }
			
			System.out.println("Enter Quantity : ");
			int quantity = sc.nextInt();
			double amount = quantity * price;
			double gst = amount * 18 / 100;
			double total = amount + gst;
			double discount = 0;
			if(total > 10000){
			    discount = total * 15 / 100;
			}
			else if(total > 5000){
			    discount = total * 10 / 100;
			}
			else if(total > 2000){
			    discount = total * 5 / 100;
			}

           total = total - discount;
			System.out.println("\n========== BILL ==========");
			System.out.println("Item        : " + item);
			System.out.println("Price       : ₹" + price);
			System.out.println("Quantity    : " + quantity);
			
			System.out.println("----------------------------");
			System.out.println("Subtotal    : ₹" + amount);
			System.out.println("GST (18%)   : ₹" + gst);

			if (discount > 0) {
				System.out.println("Discount: ₹" + discount);
			}

			System.out.println("----------------------------");
			System.out.println("Total Bill  : ₹" + total);
			System.out.println("============================");
			

			System.out.println("Do You Want To Continue (y/n): ");
			yn = sc.next();
			
		} while (yn.equalsIgnoreCase("y"));
		
		System.out.println("Thank You! Visit Again ");
		sc.close();

	}

	public static void main(String[] args) {
		ShoppingMallBilling smb = new ShoppingMallBilling();
		smb.billing();

	}

}
