package com.corejava.loops;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();

		int dn = n;
		int an = n;
		int count = 0;

		for (; dn != 0;) {
			int digit = dn % 10;
			count = count + 1;
			dn = dn / 10;
		}

		int arm = 0;

		int sum = 0;

		for (; an != 0;) {
			int digit = an % 10;
			arm = (int) Math.pow(digit, count);
			sum = sum + arm;
			an = an / 10;
		}
		if (sum == n) {
			System.out.println(n + " is an armstrong number.");
		} else {
			System.out.println(n + " is not an armstrong number.");
		}

		sc.close();

	}

}
