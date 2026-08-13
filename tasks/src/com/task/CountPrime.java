package com.task;

import java.util.Scanner;

public class CountPrime {
	static void countPrime(int n) {
		boolean status = true;
		int count =  0;
		
		
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
				count++;
			}
		}
		
		}
		System.out.println(count);

	}
	
	

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number upto you want prime numbers: ");
		int n = sc.nextInt();
		
		countPrime(n);
		
		sc.close();

	}

}
