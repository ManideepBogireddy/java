package com.problemsolving;

import java.util.*;


public class NumberReverse {
	
	Scanner sc = new Scanner(System.in);
	
	void reverseANumber() {
		
		System.out.println("Enter a number: ");
		int n = sc.nextInt();

		int rev = 0;
		int digit;

			while(n != 0) {
			digit = n % 10;
			rev = rev * 10 + digit;
			n = n / 10;
		}
		System.out.println("Reverse of the number = " +rev);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 NumberReverse nr = new  NumberReverse();
		 nr.reverseANumber();

	}

}
