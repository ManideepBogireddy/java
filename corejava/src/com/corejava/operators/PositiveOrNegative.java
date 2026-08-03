package com.corejava.operators;

import java.util.*;

public class PositiveOrNegative {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int n = sc.nextInt();
		
//		int n = 0;
		
		String num = ( n == 0) ? "Zero" :( n > 0 ) ? "Positive": "Negative";
		
		System.out.println("The Given number is : " +num);

	}

}
