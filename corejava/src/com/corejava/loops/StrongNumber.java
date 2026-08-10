package com.corejava.loops;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		int dn = n;
		
		int sum = 0;
		for(;dn != 0 ;) {
			int digit = dn % 10;
			
			int fact = 1;
			
			for(int i = 1; i<=digit; i++) {
				fact = fact * i;
			}
			sum = sum + fact;
			dn = dn /10;
		}
		if(n == sum) {
			System.out.println(n+ " is a strong number.");
		}
		else {
			System.out.println(n+ " is not a strong number.");
		}
		
		sc.close();
	}

}
