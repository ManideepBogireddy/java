package com.corejava.arrays;

import java.util.Scanner;

public class CountPositiveNegativeAndZero {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the size of the array: ");
		 int size = sc.nextInt();
		 
		 int[] arr = new int[size];
		 
		 for(int i = 0; i < size; i++) {
			 arr[i] = sc.nextInt();
		 }
		 int zeroCount = 0;
		 int positiveCount = 0;
		 int negitiveCount = 0;
		 for(int j = 0; j < size; j++) {
			 if(arr[j] == 0) {
				 zeroCount++;
			 } else if(arr[j] < 0) {
				 negitiveCount++;
			 } else {
				 positiveCount++;
			 }
		 }
		 System.out.println("Positive = "+positiveCount);
		 System.out.println("Negitive = "+negitiveCount);
		 System.out.println("Zero = "+zeroCount);
		 sc.close();

	}

}
