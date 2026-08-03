//Java
//1.Product Billing
//Create a class Product with overloaded 2.constructors:
//Product()
//Product( productName)
//Product( productName,  price)
//Product( productName,  price,  quantity)
//Requirement:
//3.Use constructor chaining.
//In the final constructor, calculate and display the Total Cost.
//
//Sample Input
//Enter Product Name: Laptop
//Enter Price: 55000
//Enter Quantity: 2
//
//Expected Output
//Product Name : Laptop
//Price        : 55000.0
//Quantity     : 2
//Total Cost   : 110000.0

package com.corejava.constructor;

import java.util.Scanner;

public class ProductBilling {
	
	String productName;
	double price;
	int quantity;
	
	public ProductBilling() {
		this("Unknown");
	}

	public ProductBilling(String productName) {
	    this("Unknowm" , 0.0);
	}
	
	ProductBilling(String productName, double price){
		this("Unknown" , 0.0, 0 );
	}
	
	ProductBilling(String productName, double price, int quantity){
		this.productName = productName;
		this.price = price;
		this.quantity  = quantity;

	}
	
	void display() {
		System.out.println("Product Name : " +productName);
		System.out.println("Price : " +price);
		System.out.println("Quantity : " +quantity);
		
		double cost = price*quantity;
		
		System.out.println("Cost :" +cost);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter product name :" );
		String productName  = sc.nextLine();
		
		System.out.print("Enter price : ");
		double price = sc.nextDouble();
		
		System.out.print("Enter quantity : ");
		int quantity = sc.nextInt();
		
		ProductBilling pb = new ProductBilling(productName,price,quantity);
		pb.display();

	}

}
