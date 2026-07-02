package com.corejava;

public class Task1 {
	
	int studentId;
	String name;
	String address;
	int age;
	
	public static void main(String[] args) {
		
		System.out.println("Object 1 Details: ");
		
		Task1 d = new Task1();
		
		d.studentId = 24;
		d.name = "Pradeep";
		d.address = "IDPL";
		d.age = 21;
		
		System.out.println("Student ID: " + d.studentId);
		System.out.println("Name : " +d.name);
		System.out.println("Address : " +d.address);
		System.out.println("Age : " +d.age);
		
		System.out.println("Object 2 Details: ");
		
		Task1 d2 = new Task1();
		
		d2.studentId = 25;
		d2.name = "Manideep";
		d2.address = "Subhash Nagar";
		d2.age = 21;
		
		System.out.println("Student ID: " + d2.studentId);
		System.out.println("Name : " +d2.name);
		System.out.println("Address : " +d2.address);
		System.out.println("Age : " +d2.age);

	}

}
