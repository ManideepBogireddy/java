package com.arrays;

import java.util.Scanner;

public class LargestEvenNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter elements to the array: ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		int max = Integer.MIN_VALUE;
		
		boolean found = false;

		for (int i = 0; i < size; i++) {
			if (arr[i] % 2 == 0) {
				found = true;
				if (arr[i] > max) {
					max = arr[i];
				}
			}
		}
		if(found) {
			System.out.println(max);
		} else {
		    System.out.println("No even number found");
		}
		sc.close();

	}

}
