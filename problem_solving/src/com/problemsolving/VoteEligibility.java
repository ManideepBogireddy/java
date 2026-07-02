package com.problemsolving;

import java.util.*;

public class VoteEligibility {
	
	
	void age() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		
		
		if(sc.hasNextInt()) {
		int a = sc.nextInt();
		if (a >= 18) {
			System.out.println("You are Eligible to vote.");
		}
		else if (a >=0) {
			System.out.println("You are not Eligible to vote. ");
		}
		else {
			System.out.println("Please enter the valid age.");
		}
		}	
		else {
			System.out.println("Please enter the valid age.");
		}
	}

	public static void main(String[] args) {
		
		VoteEligibility ve = new VoteEligibility();
		
		ve.age();

	}

}
