package com.corejava;



public class Employe extends Object{

	
	@Override
	protected void finalize() {
		System.out.println("Garbage Collector called");
		
	}
	
	public static void main(String[] args) {
		
		Employe id = new Employe();
		
		Employe id2 = new Employe();
		
		System.out.println(id);
		System.out.println(id2);
		
	    int a = 0x2b2fa4f7;
	    System.out.println(a);
	    
	    
		System.out.println(id.hashCode());
		
		id = null;
		id2 = null;
		System.out.println("------------------------------------");
		
		
		
	
		System.out.println("Object is eligible for Garbage Collection " +id);
		System.out.println(id2);
		System.gc();
		
	
		

	}

}
