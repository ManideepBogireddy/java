package com.corejava.operators;

import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a first number : ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter a Second number : ");
		int num2 = sc.nextInt();
		
		System.out.println("Enter operator to perform : ");
		char a = sc.next().charAt(0);
		
		int n =  (a == '+') ? num1 + num2 : num1 - num2;
		System.out.println("Result = " +n);
		
		sc.close();

	}

}
