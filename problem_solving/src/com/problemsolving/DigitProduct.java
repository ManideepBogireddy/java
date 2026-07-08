package com.problemsolving;

import java.util.*;

public class DigitProduct {

	Scanner sc = new Scanner(System.in);
	
	void productOfDigits() {
		System.out.println("Enter a number: ");
		
		int n = sc.nextInt();
		 n = Math.abs(n); 
		
		int digit;
		int product = 1;
		
		if(n == 0) {
			product = 0;
		}
		
		else {
		while(n != 0) {
			digit = n % 10;
			product *= digit;
			n = n/10;
			
		}
		}
		System.out.println("Product of the digits = " +product);
	}
	public static void main(String[] args) {
		DigitProduct  dp = new DigitProduct();
		
		dp.productOfDigits();
	}
}
