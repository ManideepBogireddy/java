//1.Write a Java program to store the following employee details in appropriate variables:
//
//Employee ID
//Employee Grade
//Employee Salary
//Permanent Employee Status
//Employee Experience (in years)
//Working Days
//Phone Number
//Bonus Amount
package com.corejava;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int employeeId = 101;
        char employeeGrade = 'A';
        double employeeSalary = 50000.75;
        boolean isPermanentEmployee = true;
        float employeeExperience = 3.5f;
        byte workingDays = 26;
        long phoneNumber = 9876543210L;
        double bonusAmount = 10000.00;

        System.out.println("Employee ID           : " + employeeId);
        System.out.println("Employee Grade        : " + employeeGrade);
        System.out.println("Employee Salary       : " + employeeSalary);
        System.out.println("Permanent Employee    : " + isPermanentEmployee);
        System.out.println("Experience (Years)    : " + employeeExperience);
        System.out.println("Working Days          : " + workingDays);
        System.out.println("Phone Number          : " + phoneNumber);
        System.out.println("Bonus Amount          : " + bonusAmount);
    }

	}

