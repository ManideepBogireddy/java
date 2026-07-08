package com.problemsolving;

import java.util.*;

public class DigitSum {
	
	Scanner sc = new Scanner(System.in);
	
	void sumOfDigits() {
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		
//		boolean isNegative = false;
		
//		if(n < 0) {
//			isNegative = true;
//		}
		n = Math.abs(n);
		
		int sum  = 0;
		
		int digit;
		
		while(n !=0) {
			digit = n % 10;
			sum += digit;
			n = n/10;		
		}
		
//		if(isNegative) {
//			sum = -sum;
//		}
//		
		System.out.println("Sum of digits : " +sum);
		
	}

	public static void main(String[] args) {
		
		DigitSum ds = new DigitSum();
		
		ds.sumOfDigits();
	}

}
