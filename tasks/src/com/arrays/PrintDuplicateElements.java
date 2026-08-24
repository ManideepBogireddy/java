package com.arrays;

import java.util.Scanner;

public class PrintDuplicateElements {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();

		int[] arr = new int[size];
		
		boolean found = false;

		System.out.println("Enter elements: ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < size; i++) {
			

			boolean duplicate = false;

			for (int k = 0; k < i; k++) {
				if (arr[i] == arr[k]) {
					duplicate = true;
					break;
				}
			}

				if (duplicate) {
					continue;
				}

				for (int j = i + 1; j < size; j++) {
					if(arr[i] == arr[j]) {
						duplicate = true;
						break;
					}
				}
				if(duplicate) {
					System.out.print(arr[i]+ " ");
					found = true;
				}
			}
		if(!found) {
			System.out.println("No Duplicate Elements.");
		}

		sc.close();

	}

}
