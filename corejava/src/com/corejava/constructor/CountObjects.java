package com.corejava.constructor;

public class CountObjects {
	
	static int count = 0;
	
	{
		count++;
	}

	public static void main(String[] args) {
		
		CountObjects cb = new CountObjects();
		
		CountObjects cb1 = new CountObjects();
		
		CountObjects cb2 = new CountObjects();
		
		System.out.println("Total Objects = " + CountObjects.count);

	}

}
