package com.problemsolving;

import java.util.*;

public class CheckPrime {
	
	Scanner sc = new Scanner(System.in);
	void prime() {
		System.out.println("Enter a integer number: ");
		
		if(sc.hasNextInt()) {
			
	    int n = sc.nextInt();
	    
	    boolean isPrime = true;
	    
	    
	    if(n <= 1) {
	    	isPrime = false;
	    }
		
	    for(int i = 2 ; i <=Math.sqrt(n); i++) {
	    	if(n % i == 0 ) {
	    		isPrime = false;
	    		break;
	    	}
	    }
	    
	    if(isPrime) {
	    System.out.println(n +" is a prime number.");
	    }
	    
	    else{
	    	System.out.println(n + " is not a prime number.");
	    }
	    
		}
		else {
			System.out.println("Please enter a vaild integer number.");
		}	
	}
	
	void rangePrime() {
		System.out.print("Enter starting interger number: ");
		
		if(!sc.hasNextInt()) {
			System.out.println("Please enter a valid integer.");
			return;
		}
		int start = sc.nextInt();
		
		
		System.out.print("Enter ending integer number: ");
		if(!sc.hasNextInt()) {
			System.out.println("Please enter a valid integer.");
			return;
		}
		int end = sc.nextInt();
		
		if(start > end) {
			 System.out.println("Starting number should be less than or equal to ending number.");
		      return;
		}
		
		System.out.println("Prime numbers between "+start+ " and "+end+" are: ");
		
		for(int num = start ; num <=end ; num++) {
			boolean isPrime =  true;
			
			if(num <= 1) {
				isPrime = false;
			}
			else {
			
			for(int i = 2; i<=Math.sqrt(num); i++) {
				if(num % i == 0) {
					isPrime = false;
					break;
				}
			}
			}
			if(isPrime) {
				System.out.println(num);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckPrime cp = new CheckPrime();
//        cp.prime();
		cp.rangePrime();


	}

}
