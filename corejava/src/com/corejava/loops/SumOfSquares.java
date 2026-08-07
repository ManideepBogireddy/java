package com.corejava.loops;

import java.util.Scanner;

public class SumOfSquares {
	
	static void squares(int n) {
		int sum = 0;
		for(int i = 1; i<=n; i++) {
			int squa = i*i;
			sum += squa;
		}
		System.out.println("The sum of squares till "+ n +" is: "+sum);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		squares(n);
		
		sc.close();
	}

}
