package com.task;

import java.util.Scanner;

public class NPrimeNumbers {
	
	static void isPrime(int n) {
		boolean status = true;
		
		
		if(n == 0 || n == 1) {
			status = false;
		} else {
		for(int i = 2 ; i <= n; i++) {
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					status = false;
					break;
				}
			}
			if(status) {
				 System.out.print(i+ " ");
			}
		}
		
		}
		

	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number upto you want prime numbers: ");
		int n = sc.nextInt();
		int num = 0;
		
		isPrime(n);

		
//		nPrimeNumber(n);
		
		sc.close();

	}

}
