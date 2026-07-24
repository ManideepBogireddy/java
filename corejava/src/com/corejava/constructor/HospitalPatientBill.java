package com.corejava.constructor;

import java.util.*;

public class HospitalPatientBill {
	
	String patientName;
	
	int age;
	
	double roomChargePerDay;
	
	int numberOfDaysAdmitted;
	
	public HospitalPatientBill(String patientName, int age, double roomChargePerDay, int numberOfDaysAdmitted) {
		super();
		this.patientName = patientName;
		this.age = age;
		this.roomChargePerDay = roomChargePerDay;
		this.numberOfDaysAdmitted = numberOfDaysAdmitted;
	}
	
	void calculate() {
		System.out.println("-----------------------------------");
		
		System.out.println("Patient name = " +patientName);
		System.out.println("Age = " +age);
		System.out.println("Room Charge Per Day = " +roomChargePerDay);
		System.out.println("Number of Days Admitted = " +numberOfDaysAdmitted);
		
		double total;
		total = roomChargePerDay * numberOfDaysAdmitted;
		
		System.out.println("Total Hospital Bill = " +total);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Patient Name : ");
		
		String patientName = sc.nextLine();
		
		System.out.print("Enter Age : ");
		int age = sc.nextInt();
		
		System.out.print("Enter Room Charge Per Day : ");
		double roomChargePerDay = sc.nextDouble();
		
		System.out.print("Enter Number Of Days Admitted : ");
		int numberOfDaysAdmitted = sc.nextInt();
		
		HospitalPatientBill  hpb = new HospitalPatientBill(patientName, age, roomChargePerDay, numberOfDaysAdmitted);
		
		hpb.calculate(); 
		sc.close();
		
		
		

	}

}
