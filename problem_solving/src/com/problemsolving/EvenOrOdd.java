package com.problemsolving;
import java.util.*;

public class EvenOrOdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an integer number: ");
		
		if(sc.hasNextInt()) {
			
		int n = sc.nextInt();
		
		if(n%2 == 0 ) {
			System.out.println("It is an even number.");
		}
		else {
			System.out.println("It is an odd number.");
		}
}
		
		else {
			System.out.println("Please enter a valid integer.");
		}

	}

}
