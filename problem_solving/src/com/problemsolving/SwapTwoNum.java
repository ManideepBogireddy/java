package com.problemsolving;

import java.util.Scanner;

public class SwapTwoNum {
         void swap() {
        	 Scanner sc = new Scanner(System.in);
        	 
        	 System.out.println("Enter the value of first number :");
        	 int a = sc.nextInt();
        	 
        	 System.out.println("Enter the value of second number : ");
        	 int b = sc.nextInt();
        	 
        	 a = a + b;
        	 b = a - b;
        	 a = a - b;
        	 
        	 System.out.println("After swap first number becomes : " + a);
        	 System.out.println("After swap second number becomes : " + b);
        	 
        	 
         }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SwapTwoNum stn = new SwapTwoNum();
		
		stn.swap();

	}

}
