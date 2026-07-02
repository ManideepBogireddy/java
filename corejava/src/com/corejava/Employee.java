package com.corejava;

public class Employee {
	
	static String companyName;
	static String location;
	
	int age;
	String name;
	
	static {
		Employee.companyName = "TCS";
		Employee.location = "HYD";
		System.out.println("Company name: " +Employee.companyName);
		System.out.println("Company Location: " +Employee.location);
		
	}
	
	void display() {
		System.out.println("Employee Name: " +name);
		System.out.println("Employee age: " +age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		
		e1.name = "Manideep";
		e1.age = 21;
		
		e1.display();
		
	}

}
