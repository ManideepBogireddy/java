package com.corejava.loops;

import java.util.Scanner;

public class SmallestDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");

		if (sc.hasNextInt()) {
			int n = sc.nextInt();
			int sma = 10;
			for (; n > 0;) {
				int digit = n % 10;
				if (digit < sma) {
					sma = digit;
				}
				n = n / 10;
			}
			System.out.println("The Smallest number = " + sma);
		} else {
			System.out.println("Please a positive number.");
		}

		sc.close();

	}

}
