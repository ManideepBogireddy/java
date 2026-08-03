package com.corejava;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		int a = 10 , b = 20;
		
		System.out.println("Before Swapping: ");
		System.out.println("A = " +a);
		System.out.println("B = " +b);
		
		
		a = a + b;
		
		b = a - b;
		
		a = a - b;
		
		System.out.println("--------------------");
		System.out.println("After Swapping: ");
		System.out.println("A = " +a);
		System.out.println("B = " +b);



	}

}
