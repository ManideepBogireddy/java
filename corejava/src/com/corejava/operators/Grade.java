package com.corejava.operators;

import java.util.*;

public class Grade {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your marks : ");
		int marks = sc.nextInt();
		
		String grade =    (marks >= 90 && marks <=100) ? "A" 
				        : (marks >= 75 && marks < 90) ?  "B" 
				        : (marks >= 60 && marks < 75) ?  "C" 
				        : (marks >= 40 && marks < 60) ?  "D" 
				        : "Fail" ;
		// TODO Auto-generated method stub
		System.out.println("Grade = " +grade);

	}

}
