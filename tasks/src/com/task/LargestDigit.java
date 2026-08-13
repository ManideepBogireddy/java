package com.task;

import java.util.Scanner;

public class LargestDigit {
	
	static int largestDigit(int n) {
		int result = 0;
		
		while(n != 0) {
			int r = n % 10;
			n = n /10;
			if(r > result) {
				result = r;
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		int result = largestDigit(n);
		
		System.out.println("The largest digit is: "+result);
		
		
		sc.close();

	}

}
