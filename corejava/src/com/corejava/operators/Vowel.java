package com.corejava.operators;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a character: ");
		char ch = sc.next().charAt(0);
		
		ch = Character.toLowerCase(ch);
		
		String result = (ch == 'a' || ch =='e' || ch =='i' || ch == 'o' || ch == 'u' )
				        ? "Vowel" : 
				        "Consonant";
		
		System.out.println(result);

	}

}
