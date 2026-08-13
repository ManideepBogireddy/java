package com.task;

import java.util.Scanner;

//Find the largest prime number less than N.
public class LargestPrime {

	static int largest(int n) {

		if (n <= 2) {
			return -1;
		}
		int num = 0;

		for (int i = 2; i <= n; i++) {
			boolean status = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					status = false;
					break;
				}
			}
			if (status) {
				num = i;
			}

		}

		return num;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int n = sc.nextInt();

		int result = largest(n);
		System.out.println(result);

		sc.close();

	}

}
