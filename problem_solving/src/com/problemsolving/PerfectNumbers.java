package com.problemsolving;

import java.util.*;

public class PerfectNumbers {

	Scanner sc = new Scanner(System.in);
	
	void perfectnum() {
		System.out.print("Enter a integer number: ");
		if(!sc.hasNextInt()) {
			System.out.println("Please! enter valid integer number.");
			return;
		}
		int n = sc.nextInt();
		
		if(n <= 0) {
			System.out.println("Please! enter positive numbers.");
			return;
		}
		int sum = 0;
		for(int i = 1; i< n; i++) {
			if(n % i == 0) {
				sum += i;
			}
		}
		if(n == sum) {
			System.out.println("Sum of proper factors = " + sum);
			System.out.println(n + " is a perfect number.");
		}
		else {
			System.out.println(n+ " is not a perfect number.");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PerfectNumbers pn = new PerfectNumbers();
		
		pn.perfectnum();
		

	}

}
