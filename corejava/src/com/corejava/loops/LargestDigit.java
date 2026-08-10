package com.corejava.loops;

import java.util.Scanner;

public class LargestDigit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");

		if (sc.hasNextInt()) {
			int n = sc.nextInt();
			int lar = 0;
			for (; n > 0;) {
				int digit = n % 10;
				if (digit >= lar) {
					lar = digit;
				}
				n = n / 10;
			}
			System.out.println("The largest number = " + lar);
		} else {
			System.out.println("Please a positive number.");
		}

		sc.close();
	}

}
