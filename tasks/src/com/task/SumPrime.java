package com.task;
//Sum all prime numbers from 1 to N.
import java.util.Scanner;

public class SumPrime {
	
	static int sum(int n) {
		
		int sum = 0 ;
		
		
		for(int i = 2; i <= n; i++) {
			boolean status = true;
			
			for(int j = 2; j < i; j++) {
				if( i % j == 0) {
					status = false;
					break;
				}
			}
			if(status) {
				sum += i;
			}
			
		}
		return sum;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		int result = sum(n);
		System.out.println(result);
		
		sc.close();

	}

}
