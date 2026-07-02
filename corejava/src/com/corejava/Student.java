package com.corejava;

public class Student {
	 
	// declaring instance variable
	
	int age;
	String name;
	
	// declaring static variable
	
	static int sid;
	static String sname;
	

	public static void main(String[] args) {
		
		// object created for non - static variable 
		
        Student s1 = new Student();
        
        // initializing non - static variable 
        
        s1.name = "Manideep";
        s1.age = 21;
        
        // accessing non - static variable       
        
		System.out.println("Name         : " + s1.name);
		System.out.println("Age          : " + s1.age);
		
		System.out.println("----------------------------");
		
		// initializing static variable 
		
		sid = 25;
		sname = "B.Mani";
		
		// accessing static variable  
		
		System.out.println("Student id   : " + Student.sname);
		System.out.println("Student name : " + Student.sid);
   
	}

}
