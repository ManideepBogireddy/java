package com.corejava;

import java.util.*;

public class Rectangle {
	
	Scanner sc = new Scanner(System.in);
	
	void calculateArea() {
		System.out.println("Enter length of rectangle: ");
		int l = sc.nextInt();
		
		System.out.println("Enter width of rectangle: ");
		int w = sc.nextInt();
		
		int area =  l*w;
		
		System.out.println("Area of the rectangle: " +area);
	}
	
	void calculatePerimeter() {
		System.out.println("Enter length of rectangle: ");
		int l = sc.nextInt();
		
		System.out.println("Enter width of rectangle: ");
		int w = sc.nextInt();
		
		int perimeter = 2*(l+w);
		
		System.out.println("Area of the rectangle: " +perimeter);
	}
	
	

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		
		r.calculateArea();
		r.calculatePerimeter();
		



	}

}
