package com.corejava.operators;

import java.util.*;

public class CheckDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a integer number: ");
		
		if(sc.hasNextInt()) {
			int n = sc.nextInt();
			n = Math.abs(n);		
			if(n >= 10 && n<= 99) {
				System.out.println("Two-Digit Number");
			} else if(n >= 100 && n <= 999) {
				System.out.println("Three-Digit Number");
			} else if (n >= 1000) {
				System.out.println("More Than Three Digit Number");
			} else {
				System.out.println("Less Than Two Digit");
			}		
		} else {
			System.out.println("Please ! enter a valid integer.");
		}
		sc.close();
	}

}
