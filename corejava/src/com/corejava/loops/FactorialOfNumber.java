package com.corejava.loops;

import java.util.Scanner;

public class FactorialOfNumber {
	
	static void factorial(int n) {
		int factorial = 1;
		for(int i = 1; i <=n ; i++) {
			factorial *= i;
		}
		System.out.println("Factorial of "+ n +" is: "+factorial);
	}

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number you what to find the factorial: ");
		int n = sc.nextInt();
		
		factorial(n);
		
		sc.close();

	}

}
