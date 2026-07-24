package com.corejava;

import java.util.*;

public class AutoAndAutoUnboxing {
	
	Scanner sc = new Scanner(System.in);

	void autoBoxing() {
		
	int a = 10;
		
		Integer a1 = a;
		
		System.out.println("Primitive int: " +a);
		System.out.println("Integer Object: " +a1 );
		
	}
	
	void autoUnBoxing() {
		
		Integer a1 = 100;
		
		int  a = a1;
		
		System.out.println("Primitive int: " +a);
		System.out.println("Integer Object: " +a1 );
		
	}
	
	void convert() {
		System.out.print("Enter a numeric string: ");
		String str = sc.nextLine();
		
		
		int intValue = Integer.parseInt(str);
		
		double doubleValue = Double.parseDouble(str);
		
		float floatValue = Float.parseFloat(str);
		
		System.out.println("Integer Value: " +intValue);
		System.out.println("Double Value: " +doubleValue);
		System.out.println("Float Value: " +floatValue);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AutoAndAutoUnboxing ab = new  AutoAndAutoUnboxing();
		
//		ab.autoBoxing();
//		ab.autoUnBoxing();
		ab.convert();
	

	}

}
