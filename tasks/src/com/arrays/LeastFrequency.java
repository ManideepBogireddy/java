package com.arrays;

import java.util.Scanner;

public class LeastFrequency {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter elements: ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		
		int minCount = Integer.MAX_VALUE;
		int minElement = 0;

		for (int i = 0; i < size; i++) {
			int count = 1;
			boolean freq = false;
			for (int k = 0; k < i; k++) {
				if (arr[i] == arr[k]) {
					freq = true;
				}
			}
			if (freq) {
				continue;
			}
			for (int j = i + 1; j < size; j++) {
				if(arr[i] == arr[j]) {
				count++;
				}
			}
			if(count < minCount) {
				minCount = count;
				minElement = arr[i];
			}
			
		}
		System.out.println(minElement);

		sc.close();

	}

}
