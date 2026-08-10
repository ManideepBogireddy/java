package com.corejava.loops;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();

		int dn = n;
		int rev = 0;
		for (; dn != 0;) {
			int digit = dn % 10;
			rev = rev * 10 + digit;
			dn = dn / 10;
		}
		if (rev == n) {
			System.out.println(n + " is a palindrome number.");
		} else {
			System.out.println(n + " is not a palindrome number.");
		}

		sc.close();
	}

}
