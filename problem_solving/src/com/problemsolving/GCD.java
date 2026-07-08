package com.problemsolving;

import java.util.*;

public class GCD {

	Scanner sc = new Scanner(System.in);
	
	
	void hcf() {
		System.out.println("Enter first number: ");
		if(!sc.hasNextInt()) {
			System.out.println("Please! enter valid integer.");
			return;
		}
		int f = sc.nextInt();
		
		System.out.println("Enter second number: ");
		if(!sc.hasNextInt()) {
			System.out.println("Please! enter valid integer.");
			return;
		}
		int s = sc.nextInt();
		
		if (f == 0 && s == 0) {
		    System.out.println("GCD is undefined.");
		    return;
		}

		if (f == 0) {
		    System.out.println("Highest Common Factor = " + s);
		    return;
		}

		if (s == 0) {
		    System.out.println("Highest Common Factor = " + f);
		    return;
		}
		
		int hcf = 1;
		for(int i = 1; i <= Math.min(s, f); i++ ) {
				if(f % i == 0 && s % i == 0) {
					hcf = i;
				}
		}
		System.out.println("Highest common factor : " +hcf);
	}
	
	void lcm() {
		System.out.println("Enter first number: ");
		if(!sc.hasNextInt()) {
			System.out.println("Please! enter valid integer.");
			return;
		}
		int f = sc.nextInt();
		
		System.out.println("Enter second number: ");
		if(!sc.hasNextInt()) {
			System.out.println("Please! enter valid integer.");
			return;
		}
		int s = sc.nextInt();
		
		if (f == 0 || s == 0) {
		    System.out.println("Please! enter positive numbers.");
		    return;
		}
		
		int hcf = 1;
		for(int i = 1; i <= Math.min(s, f); i++ ) {
				if(f % i == 0 && s % i == 0) {
					hcf = i;
				}
		}
		
		int lcm = (f*s)/hcf;
		System.out.println("Least common Multiple : " +lcm);
	}
	
	void lcm1() {
		System.out.println("Enter first number: ");
		if(!sc.hasNextInt()) {
			System.out.println("Please! enter valid integer.");
			return;
		}
		int f = sc.nextInt();
		
		System.out.println("Enter second number: ");
		if(!sc.hasNextInt()) {
			System.out.println("Please! enter valid integer.");
			return;
		}
		int s = sc.nextInt();
		
		if (f == 0 || s == 0) {
		    System.out.println("Please! enter positive numbers.");
		    return;
		}
	
		
		int i = Math.max(f, s);
		int lcm = 1;
		while(true) {
			if(i % f == 0 && i  % s == 0 ) {
		        lcm = i;
				break;
			}
			i++;
		}
		System.out.println(lcm);

	}
	
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GCD g = new GCD();
//		g.hcf();
//		g.lcm();
		g.lcm1();

	}

}
