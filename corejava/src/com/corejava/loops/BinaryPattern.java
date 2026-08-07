package com.corejava.loops;

import java.util.Scanner;

public class BinaryPattern {
	
	static void binaryPattern(int n) {
		for(int i = 1; i<=n; i++) {
			
			int val = (i % 2 == 1) ? 1 : 0;
			for(int j = 1; j<=i; j++) {
				System.out.print(val+" ");
				val = 1 - val;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
			
			if(sc.hasNextInt()) {
				int n = sc.nextInt();
				
				binaryPattern(n);
				
			}else {
				System.out.println("Please! Enter a Integer Number.");
			}

			sc.close();
			


	}

}
