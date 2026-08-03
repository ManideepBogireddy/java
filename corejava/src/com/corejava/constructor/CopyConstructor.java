package com.corejava.constructor;

public class CopyConstructor {
	
	int empId;
	String empName;
	double salary;
	
	CopyConstructor(int empId, String empName, double salary){
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	
	public CopyConstructor(CopyConstructor cp) {
		this.empId = cp.empId;
		this.empName =cp. empName;
		this.salary = cp.salary;
	}
	
	
	void display() {
		System.out.println("ID: "+empId);
		System.out.println("Name: "+empName);
		System.out.println("Salary: "+salary);
		System.out.println("----------------------");
	}
    void incrementSalary(double amount) {
        salary = salary + amount;
    }

	public static void main(String[] args) {
		
		CopyConstructor cp = new CopyConstructor(101, "Krishna", 50000.0);
		
		CopyConstructor cp1 = new CopyConstructor(cp);
		
		cp1.incrementSalary(10000);
		cp1.empName= "Ravi";
		
		System.out.println("Employee 1 Details");
		cp.display();
		System.out.println("Employee 2 Details");
		cp1.display();

	}

}
