package com.corejava.loops;

import java.util.Scanner;

public class Factors {
	
	static void factorsOfaNum(int n) {
		System.out.print("The Factor of "+n+" are : ");
		for(int i = 1; i <= n/2; i++) {
			if(n % i == 0) {
				System.out.print(i+" ");
			}
		}
		System.out.println(n);
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		
		factorsOfaNum(n);
		sc.close();

	}

}
