package com.problemsolving;


import java.util.*;

public class ArmstrongNumber {
	Scanner sc = new Scanner(System.in);
	
	void Armstrong() {
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		int originalNumber = n;
		
		int rev = 0;
		
		while(n != 0) {
			int digit = n % 10;
			rev += digit*digit*digit;
			n = n/10;
		}
		if(originalNumber == rev) {
		System.out.println(originalNumber+ " is an armstrong number");
		}
		else {
			System.out.println(originalNumber+ " is not an armstrong number");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArmstrongNumber an = new ArmstrongNumber();
		an.Armstrong();
	}
}
