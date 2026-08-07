package com.corejava.loops;

import java.util.*;

public class NumbersDivisibleBy3 {
	
	static void checkByThree(int n) {
		boolean found = false;
		for (int i = 1; i <= n; i++) {
			if(i % 3 == 0) {
				System.out.print(i+" ");
				found = true;
			}
		}
		 if (!found) {
		        System.out.print("No numbers are divisible by 3.");
		    }
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the upper limit: ");
		int n = sc.nextInt();
		
		System.out.print("Numbers divisible by 3 up to " + n + " are: ");
		checkByThree(n);
		sc.close();

	}

}
