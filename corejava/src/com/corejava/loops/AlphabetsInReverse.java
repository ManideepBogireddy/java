package com.corejava.loops;

public class AlphabetsInReverse {
	
	static void alphabets() {
		for(char ch = 'Z'; ch >= 'A'; ch--) {
			System.out.print(ch +" ");
		}
	}

	public static void main(String[] args) {
		
		alphabets();
	}

}
