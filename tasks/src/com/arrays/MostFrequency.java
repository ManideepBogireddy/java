package com.arrays;

import java.util.Scanner;

public class MostFrequency {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter elements: ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		int maxCount = 0;
		int maxElement = 0;

		for (int i = 0; i < size; i++) {
			boolean freq = false;
			
			int count = 1;

			for (int k = 0; k < i; k++) {
				if (arr[i] == arr[k]) {
					freq = true;
					break;
				}
			}
			if (freq) {
				continue;
			}
			for (int j = i + 1; j < size; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			
			if(count > maxCount) {
				maxCount = count;
				maxElement = arr[i];
			}
		}
		
		System.out.println(maxElement);

		sc.close();
	}

}
