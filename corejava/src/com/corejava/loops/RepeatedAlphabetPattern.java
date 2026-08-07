package com.corejava.loops;

import java.util.Scanner;

public class RepeatedAlphabetPattern {
	
	static void repeatedAlphabet(char n) {
		for(char i = 'A'; i <=n; i++) {
			for(char j = 'A'; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a character: ");
		char n = sc.next().charAt(0);
		
		repeatedAlphabet(n);
		
		sc.close();
	}

}
