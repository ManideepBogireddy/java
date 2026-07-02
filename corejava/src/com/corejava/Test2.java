package com.corejava;

public class Test2 {
	
	
	static Test2 t = new Test2();
	
	static {
		System.out.println("Static Block");
	}
	{
		System.out.println("Instance Block2");
	}
	{
		System.out.println("Instance Block");	
	}
	
	void hello() {
		System.out.println("Instance method");
	}
	
	static void welcome() {
		System.out.println("Static method");
	}
	
	public static void main(String[] args) {
       System.out.println("Main method");
       Test2 t = new Test2();
       Test2.welcome();
       t.hello();  
	}


	
	
}
