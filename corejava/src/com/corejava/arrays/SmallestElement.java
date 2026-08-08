package com.corejava.arrays;

import java.util.Scanner;

public class SmallestElement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the element: ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		
		for(int i = 0; i< size; i++) {
			arr[i] = sc.nextInt();
		}
		int min = arr[0];
		
		for(int j = 0;j < size; j++) {
			if(arr[j] < min) {
				min = arr[j];
			}
		}
		
		System.out.println("The smallest number in a array: "+min);
		
		sc.close();

	}

}
