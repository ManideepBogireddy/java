package com.corejava.loops;

import java.util.Scanner;

public class DuckNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		String n = sc.next();
		
		boolean hasZero = false;
		
		if(n.charAt(0) == '0') {
			System.out.println(n+ " is not duck number.");
		} else {
			for(int i = 1; i<n.length(); i++) {
				if(n.charAt(i) == '0') {
					hasZero = true;
					break;
				}
			}
			if(hasZero) {
				System.out.println(n+ " is a duck number.");
			} else {
				System.out.println(n+ " is not a duck number.");
			}
		}
		
		

		
		sc.close();

	}

}
