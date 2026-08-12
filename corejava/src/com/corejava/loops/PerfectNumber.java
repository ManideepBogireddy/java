package com.corejava.loops;

import java.util.Scanner;

public class PerfectNumber {
	
	static boolean perfect(int n) {
		int sum = 0;
		for(int i = 1; i <= n/2; i++) {
			if(n % i == 0) {
				sum += i;
			}
		}
		return sum == n;
	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		
		boolean result = perfect(n);
		
		if(result) {
			System.out.println(n+" is Perfect number.");
		} else {
			System.out.println(n+" is not a perfect number");
		}
		
		sc.close();

	}

}
