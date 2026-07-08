package com.problemsolving;


import java.util.*;

public class FactorsOfNumbers {
	Scanner sc = new Scanner(System.in);
	void factors() {
		System.out.print("Enter a integer number: ");
		if(!sc.hasNextInt()) {
			System.out.println("Please! enter a valid integer.");
			return;
		}
		int n = sc.nextInt();
		if(n <=0 ) {
			System.out.println("Please! enter positive numbers.");
			return;
		}
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				System.out.println(i);
			}
		}	
	}
	void countFactors() {
		System.out.print("Enter a integer number: ");
		if(!sc.hasNextInt()) {
			System.out.println("Please! enter a valid integer.");
			return;
		}
		int n = sc.nextInt();
		int count = 0;
		if(n<=0) {
			System.out.println("Please! enter positive numbers.");
			return;
		}

		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				count ++;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorsOfNumbers fn = new FactorsOfNumbers();
		fn.factors();
		fn.countFactors();

	}

}
