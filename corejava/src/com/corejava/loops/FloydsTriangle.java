package com.corejava.loops;

import java.util.Scanner;

public class FloydsTriangle {
	
	static void floydsTriangle(int n) {
		
		int row = n;
		int num = 1;
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=i; j++) {
			  System.out.print(num+ " ");
			  num++;
			}
	
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	System.out.println("Enter a number: ");
		
		if(sc.hasNextInt()) {
			int n = sc.nextInt();
			
			floydsTriangle(n);
			
		}else {
			System.out.println("Please! Enter a Integer Number.");
		}
		
		sc.close();

	}

}
