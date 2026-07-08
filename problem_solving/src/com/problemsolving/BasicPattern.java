package com.problemsolving;


import java.util.*;

public class BasicPattern {
	
Scanner sc = new Scanner(System.in);

void pattern() {
	System.out.print("Enter the value of n: ");
	if(!sc.hasNextInt()) {
		System.out.println("Please! enter valid number.");
		return;
	}
	int n = sc.nextInt();
	if (n <= 0) {
		System.out.println("Please enter a positive integer.");
		return;
	}
	for(int i = 1; i<=n; i++) {
		for(int j = 1; j<=i;j++) {
			System.out.print("*");
		}
       System.out.println();
	}

	
}
void invertedStarPattern() {
	System.out.print("Enter the value of n: ");
	if(!sc.hasNextInt()) {
		System.out.println("Please! enter valid number.");
		return;
	}
	int n = sc.nextInt();
	if (n <= 0) {
		System.out.println("Please enter a positive integer.");
		return;
	}
	for(int i = 1; i<=n; i++) {
		for(int j = 1; j<=n-i+1;j++) {
			System.out.print("*");
		}
       System.out.println();
	}
}

void rightAlignedTriangle(){
	System.out.print("Enter the value of n: ");
	if(!sc.hasNextInt()) {
		System.out.println("Please! enter valid number.");
		return;
	}
	int n = sc.nextInt();
	if (n <= 0) {
		System.out.println("Please enter a positive integer.");
		return;
	}
	for(int i = 1; i<=n; i++) {
		
		for(int j = 1; j<=n-i;j++) {
			System.out.print(" ");	
		}
		for(int j = 1; j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
		
	}
}


void fullPyramidPattern() {
	System.out.print("Enter the value of n: ");
	if(!sc.hasNextInt()) {
		System.out.println("Please! enter valid number.");
		return;
	}
	int n = sc.nextInt();
	if (n <= 0) {
		System.out.println("Please enter a positive integer.");
		return;
	}
	for(int i = 1; i<=n; i++) {
		
		for(int j = 1; j<=n-i;j++) {
			System.out.print(" ");	
		}
		for(int j = 1; j<=2*i-1;j++) {
			System.out.print("*");
		}
		System.out.println();
		
	}
}

void invertedFullPyramid() {
	System.out.print("Enter the value of n: ");
	if(!sc.hasNextInt()) {
		System.out.println("Please! enter valid number.");
		return;
	}
	int n = sc.nextInt();
	if (n <= 0) {
		System.out.println("Please enter a positive integer.");
		return;
	}
	for(int i = 1; i<=n; i++) {
		
		for(int j = 1; j<=i-1;j++) {
			System.out.print(" ");	
		}
		for(int j = 2*i-1; j<=2*n-1;j++) {
			System.out.print("*");
		}
		System.out.println();
		
	}
	
}

void hollowRectangle() {
	System.out.print("Enter the value of rows: ");
	if(!sc.hasNextInt()) {
		System.out.println("Please! enter valid number.");
		return;
	}
	int r = sc.nextInt();
	if (r <= 0) {
		System.out.println("Please enter a positive integer.");
		return;
	}
	System.out.print("Enter the value of columns: ");
	if(!sc.hasNextInt()) {
		System.out.println("Please! enter valid number.");
		return;
	}
	int c = sc.nextInt();
	if (c <= 0) {
		System.out.println("Please enter a positive integer.");
		return;
	}
	
	for(int i = 1; i<=r; i++) {
		for(int j = 1; j<=c; j++) {
			if(i == 1 || i == r || j == 1 || j == c) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();		
	}
	
	
}

void numberTriangle() {
	System.out.print("Enter the value of n: ");
	if(!sc.hasNextInt()) {
		System.out.println("Please! enter valid number.");
		return;
	}
	int n = sc.nextInt();
	if (n <= 0) {
		System.out.println("Please enter a positive integer.");
		return;
	}
	for(int i = 1; i<=n; i++) {
		
	}

}

	public static void main(String[] args) {
		
		BasicPattern bp = new BasicPattern();
//		bp.pattern();
//		bp.invertedStarPattern();
//		bp.rightAlignedTriangle();
//		bp.fullPyramidPattern();
//		bp.invertedFullPyramid();
//		bp.hollowRectangle();
		bp.numberTriangle();

	}

}
