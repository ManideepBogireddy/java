package com.corejava.loops;

import java.util.Scanner;

public class InvertedStartPattern {
	
	static void invertedPattern(int n) {
		for(int i = n; i>=1; i--) {
			for(int j = i; j>=1; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		
		if(sc.hasNextInt()) {
			int n = sc.nextInt();
			
			invertedPattern(n);
		}
		
		sc.close();

	}

}
