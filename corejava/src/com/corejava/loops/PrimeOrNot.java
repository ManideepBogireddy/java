package com.corejava.loops;

import java.util.Scanner;

public class PrimeOrNot {

	static void isPrime(int n) {
		boolean prime = true;
		if (n == 0 || n == 1) {
			System.out.println(n + " is not a prime number.");
		} else {
			for (int i = 2; i <= n / 2; i++) {
				if (n % i == 0) {
					prime = false;
					break;
				}

			}
			if (prime) {
				System.out.println(n + " is a prime number.");
			} else {
				System.out.println(n + " is not a prime number.");
			}
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int n = sc.nextInt();

		isPrime(n);

		sc.close();

	}

}
