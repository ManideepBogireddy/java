package com.corejava.loops;

import java.util.Scanner;

public class DivisibleByBothThreeAndFive {
	
	static void checkDivisible(int n) {
		boolean found = false;
		for(int i = 1; i<= n; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.print(i+" ");
				found = true;
			}
		}
		System.out.println();
		if(!found) {
			System.out.println("No numbers are divisible by both 3 and 5.");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the upper limit: ");
		int n = sc.nextInt();
		
		System.out.print("Numbers divisible by 3 and 5 up to  "+ n +" are: ");
		checkDivisible(n);
		
		sc.close();

	}

}
