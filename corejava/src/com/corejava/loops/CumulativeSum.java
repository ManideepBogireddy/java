package com.corejava.loops;

import java.util.Scanner;

public class CumulativeSum {

	static void sumCum(int n) {
		int sum = 0;
		System.out.print("The Cumulative sum from 1 to " + n + " is: ");
		for (int i = 1; i <= n; i++) {
			sum += i;
			System.out.print(sum + " ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");

		if (sc.hasNextInt()) {
			int n = sc.nextInt();
			sumCum(n);
		} else {
			System.out.println("Please! Enter a Integer Number.");
		}
		sc.close();

	}

}
