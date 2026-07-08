package com.problemsolving;

import java.util.*;

public class PalindromeNumber {
	Scanner sc = new Scanner(System.in);
	
	void palindrome() {
		
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		int originalNumber = n;
		
		int reverseNumber = 0;
		
		while(n != 0) {
			int digit = n % 10;
			reverseNumber  = reverseNumber * 10 + digit;
			n = n / 10;
		}
		if(originalNumber == reverseNumber) {
			System.out.println("It is a palindrome number");
		}
		else {
			System.out.println("It is not an palindrome number");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromeNumber pn = new PalindromeNumber();
		
		pn.palindrome();

	}

}
