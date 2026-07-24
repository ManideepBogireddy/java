package com.corejava.methods;

import java.util.*;

public class LoanInterest {
	double calculateInterest(double principal, double rate, int time) {
		return (principal * rate * time)/100;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the principal amount: ");
		double principal = sc.nextDouble();
		
		System.out.println("Enter the rate of interest: ");
		double rate = sc.nextDouble();
		
		System.out.println("Enter the time period(in years): ");
		int time = sc.nextInt();
		LoanInterest li = new LoanInterest();
		double simpleInterest = li.calculateInterest(principal, rate, time);
		
		System.out.println("Simple Interest = "+simpleInterest);
	}

}
