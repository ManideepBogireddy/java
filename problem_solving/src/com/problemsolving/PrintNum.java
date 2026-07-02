package com.problemsolving;

import java.util.*;

public class PrintNum {
	Scanner sc = new Scanner(System.in);

	void print() {
		for(int i = 1 ; i<= 10; i++ ) {
			System.out.println(i);
		}
	}
	
	void printRev() {
		for(int i = 10; i>= 1; i--) {
			System.out.println(i);
		}
	}
	
	void even() {
		for(int i = 2; i <= 100; i+= 2) {
				System.out.println(i);
		}
	}
	
	
	void odd() {
		for(int i = 1; i <= 100; i+= 2) {
				System.out.println(i);
		}
	}
	
    void multiplicationTable() {
		System.out.println("Enter a number: ");
		
		if(sc.hasNextInt()) {
			int n = sc.nextInt();
			for(int i = 1; i<= 10;i++) {
				System.out.println(""+n+" x "+i+" = " +n*i);
			}
		}
		else {
			System.out.println("Please! enter a Integer number.");
		}
		
	}
    void sumOfNaturalNumbers() {
    	System.out.println("Enter a number: ");
    	int sum =0;
    	
    	if(sc.hasNextInt()) {
    		int n = sc.nextInt();
    		for(int i = 1; i<=n; i++) {
    			sum += i;
    		}
    		System.out.println("sum = " +sum);
    	}
    	else {
    		System.out.println("Please! enter a valid integer number>");
    	}
    }
    void countDigits() {
    	
    	System.out.println("Enter a number: ");
    	int n = sc.nextInt();
    	
    	int count = 0;
    	n = Math.abs(n);
    	if(n == 0 ) {
    		count = 1;
    	}
    	
    	else {
    	while(n != 0) {
    		n = n / 10;
    		count++;
    	}
    	}
    	System.out.println("Digit count = " +count);
    }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrintNum pn = new  PrintNum();
//		pn.print();
//		pn.printRev();
//		pn.even();
//		pn.odd();
//		pn.multiplicationTable();
//		pn.sumOfNaturalNumbers();
		pn.countDigits();

	}

}
