package com.corejava.loops;

import java.util.*;

public class MultiplicationTable {
	
	static void table(int n) {
		
		for(int i = 1; i <= 10; i++) {
			int mul = n * i;
			System.out.println(""+n+" X " +i+" = " + mul);
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		table(n);
		sc.close();
		
		

	}

}
