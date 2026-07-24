package com.corejava.methods;

import java.util.*;

public class BasicCalculator {
	
	int add(int a , int b) {
		int sum = a + b;
		return sum;
	}
	
	int subtract(int a , int b) {
		int sub = a - b;
		return sub;
	}
	
	int multiply(int a, int b) {
		int mult = a * b;
		return mult;
	}
	
	double division(double x , double y) {
		double div = x / y;
		return div;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first interger :");
		int a = sc.nextInt();
		System.out.println("Enter the second interger :");
		int b = sc.nextInt();
		
		
		BasicCalculator bc = new BasicCalculator();
		
		System.out.println("Sum = "+ bc.add(a, b));

//		System.out.println("Subtract =" +bc.subtract(a, b));
//		System.out.println("multiply =" +bc.multiply(a, b));
//		System.out.println("Enter the first number :");
//		double x = sc.nextDouble();
//		System.out.println("Enter the second number :");
//		double y = sc.nextDouble();
//		System.out.println("Division = " +bc.division(x, y));

	}

}
