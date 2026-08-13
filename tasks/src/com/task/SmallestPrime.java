package com.task;

import java.util.Scanner;

//Find the smallest prime number greater than N.
public class SmallestPrime {

	static int smallest(int n) {

		for (int i = n + 1;; i++) {
			boolean status = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					status = false;
					break;
				}
			}

			if (status) {
				return i;
			}

		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int n = sc.nextInt();

		int result = smallest(n);
		System.out.println(result);

		sc.close();
	}

}
