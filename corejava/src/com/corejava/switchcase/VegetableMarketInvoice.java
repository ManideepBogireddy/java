package com.corejava.switchcase;


import java.util.*;

public class VegetableMarketInvoice {
	
	Scanner sc = new Scanner(System.in);
	
	String yn = "";
	
	String vegItem = "Vegetable";
	String fruitItem ="Fruit";
	
	double vegPrice = 0;
	double fruitPrice = 0;
	
	double vegQuantity = 0;
	double fruitQuantity = 0;
	
	double vegTotal = 0;
	double fruitTotal = 0;
	
	
	double subTotal = 0;
	void invoice() {
		
		do {
		System.out.println("=========================");
		System.out.println("         Category        ");
		System.out.println("1.Vegetables");
		System.out.println("2.Fruits");
		System.out.println("=========================");
		System.out.println("Choice You Category: ");
		int choice = sc.nextInt();
		
		switch(choice) {
	
		case 1 ->{
			do {
			System.out.println("1.Tomato    1KG: 30rs");
			System.out.println("2.Potato    1KG: 40rs");
			System.out.println("3.Onion     1KG: 35rs");
			System.out.println("4.Carrot    1KG: 50rs");
			System.out.println(" ");
			System.out.println("Choice Vegetable Item: ");
			int item = sc.nextInt();
			
			switch(item) {
			
			case 1 ->{
				vegItem = "Tomato";
				vegPrice = 30;
			}
			case 2 ->{
				vegItem ="Potato";
				vegPrice = 40;
			}
			case 3 -> {
				vegItem = "Onion";
				vegPrice = 35;
			}
			case 4 -> {
				vegItem = "Carrot";
				vegPrice = 50;
				
			}
			default -> {
				System.out.println("Invalid Vegetable Choice.");
				vegPrice = 0;
			}
			}
			
			if(vegPrice != 0) {
				System.out.println("Enter Quantity (KG): ");
				vegQuantity = sc.nextDouble();
				
				double itemTotal = vegPrice * vegQuantity;
				
				vegTotal += itemTotal;
	
			}
			subTotal += vegTotal;
			
			System.out.println("Do You Want To Continue With Vegetable (y/n): ");
			yn = sc.next();
		} while(yn.equalsIgnoreCase("y"));
		}
		case 2 -> {
			do {
			System.out.println("1.Apple    1KG: 120rs");
			System.out.println("2. Banana      1 Dozen : 60 Rs");
			System.out.println("3. Mango       1 KG : 150 Rs");
			System.out.println("4. Orange      1 KG : 100 Rs");
			
			System.out.println(" ");
			System.out.println("Choice Fruit Item");
			int itemFruit = sc.nextInt();
			switch(itemFruit) {
			
			case 1 ->{
				fruitItem = "Apple";
				fruitPrice = 120;
			}
			case 2 -> {
		        fruitItem = "Banana";
		        fruitPrice = 60;
		    }

		    case 3 -> {
		        fruitItem = "Mango";
		        fruitPrice = 150;
		    }

		    case 4 -> {
		        fruitItem = "Orange";
		        fruitPrice = 100;
		    }
			
			default -> {
				System.out.println("Invalid Fruit Choice.");
				fruitPrice = 0;
				}
			}
			
			if(fruitPrice != 0) {
				System.out.println("Enter Quantity (KG): ");
				fruitQuantity = sc.nextDouble();
				
				double itemTotal = fruitPrice * fruitQuantity;
				
				fruitTotal += itemTotal;
	
			}
			subTotal += fruitTotal;
			
			System.out.println("Do You Want To Continue With Fruits (y/n): ");
			yn = sc.next();
		} while(yn.equalsIgnoreCase("y"));
		}
		default -> System.out.println("Invalid Category Choice.");
		}
		
		
		
		System.out.println("Do You Want To Continue (y/n): ");
		yn = sc.next();
		} while(yn.equalsIgnoreCase("y"));
		System.out.println("===================================");
		System.out.println("       VEGETABLE MARKET BILL       ");
		System.out.println("===================================");
		
		System.out.printf("%-12s %-6s %-6s %-8s%n",
		        "Item", "Qty", "Rate", "Amount");
		
		System.out.println("-----------------------------------");

		System.out.printf("%-12s %-6.2f %-6.2f %-8.2f%n",
		        vegItem, vegQuantity, vegPrice, vegTotal);

		System.out.printf("%-12s %-6.2f %-6.2f %-8.2f%n",
		        fruitItem, fruitQuantity, fruitPrice, fruitTotal);
		
		System.out.println("-----------------------------------");
		System.out.println("Vegetables Total            : "+vegTotal);
		System.out.println("Fruits Total                : "+fruitTotal);
		System.out.println("-----------------------------------");
		System.out.println("SubTotal                    : "+subTotal);
		double discount = 0;

		if(subTotal >= 1000)
		    discount = subTotal * 0.10;
		else if(subTotal >= 500)
		    discount = subTotal * 0.05;

		double finalAmount = subTotal - discount;
		System.out.println("Discount                    : "+discount);
		
		double gst = subTotal * 5 /100;
		System.out.println("GST (5%)                    : "+gst);
		System.out.println("-----------------------------------");
		
		double netPrice = 0;
		
		netPrice = finalAmount + gst;
		System.out.println("Net Amount                  : "+netPrice);
		
		
		System.out.println("===================================");
		System.out.println("      Thank You! Visit Again      ");
		System.out.println("===================================");
		sc.close();
	}
	
	

	public static void main(String[] args) {
		
		
		VegetableMarketInvoice in = new VegetableMarketInvoice();
		in.invoice();

	}

}
