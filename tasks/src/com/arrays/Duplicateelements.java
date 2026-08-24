package com.arrays;

import java.util.Scanner;

public class Duplicateelements {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter elements to the array: ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		int count = 0;

		for (int i = 0; i < size; i++) {
			
			boolean duplicate = false;
			
			for(int k = 0; k < i ; k++) {
				if(arr[i] == arr[k]) {
					duplicate = true;
					break;
				}
			}
			if(duplicate) {
				continue;
			}
			
			for(int j = i + 1; j < size; j++) {
				if(arr[i] == arr[j]) {
					count++;
					break;
				}
			}
		}
		System.out.println(count);
		sc.close();

	}

}
