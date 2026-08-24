package com.arrays;

import java.util.Scanner;

public class PrintUniqueElements {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		
		
		int[] arr = new int[size];
		
		System.out.println("Enter elements: ");
		
		for(int i = 0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		
		boolean found = false;
		
		
		
		for(int i = 0; i< size; i++) {
			boolean dupilcate = false;
			
			for(int k = 0; k < i; k++) {
				if(arr[i] == arr[k]) {
					dupilcate = true;
					break;
				}
			}
				if(dupilcate) {
					continue;
				}
				for(int j = i + 1; j < size; j++) {
					if(arr[i] == arr[j]) {
						dupilcate = true;
						break;
					}
				}
			if(!dupilcate) {
				System.out.print(arr[i]+" ");
				found = false;
			}
		}
		
		if(!found) {
			System.out.println("No Unique Elements");
		}
		
		sc.close();

	}

}
