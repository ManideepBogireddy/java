package com.corejava.constructor;

public class Student {
	
	int id;
	
	String name;
	
	String course;
	
	Student(){
		this(0, "Unknown");
	}
	

	Student(int id, String name){
		this( id,  name,  "Not Assigned");
	}
	
	Student(int id,  String name,  String course){
		this.id = id;
		this.name= name;
		this.course = course;
		
	}
	
	void display() {
		System.out.println("Id = " +id);
		System.out.println("Name = " +name);
		System.out.println("Course = " +course);
		
	}
	
public static void main(String[] args) {
	
	Student s = new Student(5,"Manideep","Java");
	s.display();
	
	
}


}
