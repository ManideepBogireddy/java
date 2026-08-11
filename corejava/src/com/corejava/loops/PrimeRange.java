package com.corejava.loops;

import java.util.Scanner;

public class PrimeRange {

	static void range(int s, int e) {
		if (s > e) {
			System.out.println("Strating number must be less than the ending number");
		} else {
			System.out.print("Prime Numbers From "+s+" To "+e+" are: ");
			for (int n = s; n <= e ; n++) {
				boolean prime = true;
				
				if (n < 2) {
					continue;
				}

				for (int i = 2; i <= n / 2; i++) {
					if (n % i == 0) {
						prime = false;
						break;
					}
				}
				
				
				if(prime) {
				System.out.print(n + " ");
				}

			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting number: ");
		int s = sc.nextInt();

		System.out.println("Enter the ending number: ");
		int e = sc.nextInt();

		range(s, e);

		sc.close();

	}

}
