package com.problemsolving;

import java.util.*;

public class LargestNum {
	
	void twoNum() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		double f = sc.nextDouble();
		
		System.out.println("Enter the second number: ");
		double s = sc.nextDouble();
		
		if(f == s) {
			System.out.println("Numbers are equal.");
		}
		else if(f > s){
			System.out.println(""+f+" is largest number.");
		}
		else {
			System.out.println(""+s+" is largest number.");
		}
		
	}
	
	void threeNum() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		double f = sc.nextDouble();
		
		System.out.println("Enter the second number: ");
		double s = sc.nextDouble();
		
		System.out.println("Enter the three number: ");
		double t = sc.nextDouble();
		
		if(f == s & s == t) {
			System.out.println("Numbers are equal.");
		}
		else if(f >= s & s >= t){
			System.out.println(""+f+" is largest number.");
		}
		
		else if(s >= f & f >= t){
			System.out.println(""+s+" is largest number.");
		}
		
		else {
			System.out.println(""+t+" is largest number .");
		}
		
	}

	public static void main(String[] args) {
		
		LargestNum ln = new LargestNum();
//		
//		ln.twoNum();
		
		ln.threeNum();
		

	}

}
