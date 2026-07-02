package com.problemsolving;
import java.util.*;

public class CheckTheNum {
	
	
	void num(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		double n = sc.nextDouble();
		
		if (n == 0) {
			System.out.println("Number is Zero");
		}
		else if(n > 0 ) {
			System.out.println("Number is Positive");
		}
		else {
			System.out.println("Number is Negitive");
		}
		
	}

	public static void main(String[] args) {
		CheckTheNum chs = new CheckTheNum();
		chs.num();

	}

}
