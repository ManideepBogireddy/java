package com.corejava.loops;

import java.util.Scanner;

public class ReverseNumber {
	
	static void revNum(int n) {
		int rev = 0;
		for(;n != 0;) {
			int digit = n % 10;
			rev = rev * 10 + digit;
			n = n / 10;
		}
		System.out.println("The Reverse number of given number is: "+rev);
	}

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a number: ");
	int n = sc.nextInt();
	
	revNum(n);
	sc.close();
	System.out.println(1263*56);
	}

}
