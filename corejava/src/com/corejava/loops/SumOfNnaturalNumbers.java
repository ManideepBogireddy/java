package com.corejava.loops;

import java.util.Scanner;

public class SumOfNnaturalNumbers {

	static void sumNatural(int n) {

		int sum = 0;

		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println("The sum of " + n + " = " + sum);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		sumNatural(n);

	}

}
