package com.corejava.methods;

import java.util.*;

public class StudentResults {
	
	
	
	void displayStudent(String name) {
		System.out.println("Name of the student = " +name);
	}
	
	void calculateTotal(int m1,int m2, int m3) {
		int total = m1+m2+m3;
		System.out.println("Total = " +total);
	}
	
	void calculateAverage(int m1, int m2 , int m3) {
		double average = (m1+m2+m3)/3;
		System.out.println("Average = " +average);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of the student: ");
		String name = sc.nextLine();
		
		
		
		System.out.println("Enter marks in subject 1: ");
		int m1 = sc.nextInt();
		
		System.out.println("Enter marks in subject 2: ");
		int m2 = sc.nextInt();
		
		System.out.println("Enter marks in subject 3: ");
		int m3 = sc.nextInt();
		
		StudentResults sr = new StudentResults();
		sr.displayStudent(name);
		sr.calculateTotal(m1, m2, m3);
		sr.calculateAverage(m1, m2, m3);

	}

}
