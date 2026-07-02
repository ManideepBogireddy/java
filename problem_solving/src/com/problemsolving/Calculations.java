package com.problemsolving;

import java.util.Scanner;

public class Calculations {
	Scanner sc = new Scanner(System.in);
	
	 void sum() {
			
	    System.out.println("Enter the first value :");
	    int a = sc.nextInt();
	    
	    System.out.println("Enter the second value : ");
	    int b = sc.nextInt();
	    
	    int sum= a + b;
	    
	    System.out.println("Sum = "+ sum);
	
	}
	 void sub() {
		 	
		    System.out.println("Enter the first value :");
		    int a = sc.nextInt();
		    
		    System.out.println("Enter the second value : ");
		    int b = sc.nextInt();
		    
		    int sub = a - b;
		    System.out.println("Sub = "+ sub);
		 
	 }
	 void mul() {

		    System.out.println("Enter the first value :");
		    int a = sc.nextInt();
		    
		    System.out.println("Enter the second value : ");
		    int b = sc.nextInt();
		    
		    int mul = a*b; 
		    
		    System.out.println("mul = "+ mul);
		 
	 }
	 void div() {
			
		    System.out.println("Enter the first value :");
		    int a = sc.nextInt();
		    
		    System.out.println("Enter the second value : ");
		    int b = sc.nextInt();
		    
		    if(b != 0) {
		    	int div = a/b;
		    System.out.println("div = "+ div);
		    } else {
		    	System.out.println("Cannot divide by zero");
		    }
		    
		 
	 }
	 void areaOfRectangle() {
			
		    System.out.println("Enter the length of the rectangle :");
		    int a = sc.nextInt();
		    
		    System.out.println("Enter the width of the rectangle : ");
		    int b = sc.nextInt();
		    
		    int area = a*b;
		    System.out.println("Area of rectangle = "+ area);
		 
	 }
	 public static void main(String[] args) {
			
			Calculations c1 = new Calculations();
			
			c1.sub();
			
		}
}


