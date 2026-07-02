package com.corejava;

public class Debug {

	public static void main(String[] args) {
        System.out.println(5+6);
        hello();
	}
	
	static void hello() {
		Debug d = new Debug();
		d.welcome();
		System.out.println("Hello");
	}
	void welcome() {
		System.out.println("Welcome");
	}

}
