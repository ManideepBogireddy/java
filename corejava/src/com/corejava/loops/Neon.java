package com.corejava.loops;

import java.util.Scanner;

public class Neon {
	
	static void neonNumber(int n) {
		int squr = n * n;
		int sum = 0;
		
		for(;squr !=0;) {
			int digit = squr % 10;
			sum += digit;
			squr = squr / 10;
		}
//		while(squr != 0) {
//			int digit = squr % 10;
//			sum += digit;
//			squr = squr / 10;
//		}
		if(sum == n) {
			System.out.println(n+ " is a Neon number.");
		}else {
			System.out.println(n+ " is not Neon number.");
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		neonNumber(n);
		
		sc.close();

	}

}
