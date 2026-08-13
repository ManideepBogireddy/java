package com.leetcode;

import java.util.Scanner;

public class RomanToInteger {

	static int romanToInt(String n) {
		int num = 0;

		int I = 1;
		int V = 5;
		int X = 10;
		int L = 50;
		int C = 100;
		int D = 500;
		int M = 1000;

		for (int i = 0; i < n.length(); i++) {
			int current = 0;
			int next = 0;
			if (n.charAt(i) == 'I') {
				current = I;
			} else if (n.charAt(i) == 'V') {
				current = V;

			} else if (n.charAt(i) == 'X') {
				current = X;

			} else if (n.charAt(i) == 'L') {
				current = L;

			} else if (n.charAt(i) == 'C') {
				current = C;

			} else if (n.charAt(i) == 'D') {
				current = D;

			} else if (n.charAt(i) == 'M') {
				current = M;

			}

			if (i == n.length() - 1) {
				num += current;
				break;
			}

			if (n.charAt(i + 1) == 'I') {
				next = I;
			} else if (n.charAt(i + 1) == 'V') {
				next = V;

			} else if (n.charAt(i + 1) == 'X') {
				next = X;

			} else if (n.charAt(i + 1) == 'L') {
				next = L;

			} else if (n.charAt(i + 1) == 'C') {
				next = C;

			} else if (n.charAt(i + 1) == 'D') {
				next = D;

			} else if (n.charAt(i + 1) == 'M') {
				next = M;

			}

			if (current < next) {
				num -= current;
			} else {
				num += current;
			}

		}

		return num;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a String: ");
		String n = sc.next();

		int result = romanToInt(n);
		System.out.println(result);

		sc.close();

	}

}
