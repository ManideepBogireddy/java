	package com.corejava.loops;
	
	import java.util.Scanner;
	
	public class SumFactorial {
		
		static void factSum(int n) {
			int fact = 1;
			int sum = 0;
			for(int i = 1; i<= n; i++) {
				fact *= i;
				sum += fact;
			}
			System.out.println(sum);
		}
	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter a number: ");
			
			if(sc.hasNextInt()) {
				int n = sc.nextInt();	
				factSum(n);
			} else {
				System.out.println("Please! Enter a Integer Number.");
			}
			
			
			sc.close();
	
		}
	
	}
