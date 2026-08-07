package com.corejava.loops;

import java.util.Scanner;

public class SumOfDigit {
	
	static void digitSum(int n) {
		int sum = 0;
		for(;n!=0;) {
			int digit = n % 10;
			sum += digit;
			n = n /10;
		}
		System.out.println("The sum of given digit is: " +sum);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		digitSum(n);
		
		sc.close();

	}

}
