package com.corejava.methods;

import java.util.*;

public class SalarySlipGenerator {
	

	void salarySlip(String employeeName, double basicSalary) {
	
		
		double hra = basicSalary * 20 /100;
		
		double da = basicSalary * 10 /100;
		
		double grossSalary = basicSalary + hra + da;
		
		System.out.println("HRA (20%) : " +hra);
		System.out.println("DA (10%) : " +da);
		System.out.println("Gross Salary : " +grossSalary);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		SalarySlipGenerator ssg = new SalarySlipGenerator();
		System.out.print("Enter Employee Name: " );
		String name = sc.nextLine();
		
		System.out.print("Enter Basic Salary: " );
		double basic = sc.nextDouble();
		
		ssg.salarySlip(name, basic);
	
		
		

	}

}
