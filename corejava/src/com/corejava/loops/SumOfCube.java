package com.corejava.loops;

import java.util.Scanner;

public class SumOfCube {
	static void cube(int n) {
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum += i * i * i;
		}
		System.out.println("The sum of cubes till "+ n +" is: " +sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");
		if (sc.hasNext()) {
			int n = sc.nextInt();
			cube(n);
		} else {
			System.out.println("Please! Enter a Integer Number.");
		}

		sc.close();

	}

}
