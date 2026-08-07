package com.corejava.loops;

import java.util.Scanner;

public class Pattern {
	
	static void pattern(int n) {
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		
		if(sc.hasNextInt()) {
			int n = sc.nextInt();
			pattern(n);
		} else {
			System.out.println("Please! Enter a Integer Number.");
		}
		
		sc.close();

	}

}
