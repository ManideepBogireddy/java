package com.arrays;

import java.util.Scanner;

public class AutomorphicNumber {

	public static int automorphic(int n) {

		int squ = n * n;
		int temp = n;
		int count = 0;

		while (temp != 0) {
			count++;
			temp = temp / 10;
		}
		
		int digit = 1;
		
		for(int i = 1; i<= count; i++) {
			digit = digit * 10;
		}
		
		int lastdigits = squ % digit;

		return lastdigits;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		int result  = automorphic(n);
		
		if(result == n) {
			System.out.println("Automorphic Number");
		} else {
			System.out.println("Not Automorphic Number");
		}

		sc.close();

	}

}
