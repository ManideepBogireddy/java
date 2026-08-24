package com.arrays;

import java.util.Scanner;

public class FirstNonRepeatedElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter elements: ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < size; i++) {
			boolean found = false;

			for (int k = 0; k < i; k++) {
				if (arr[i] == arr[k]) {
					found = true;
					break;
				}
			}
			if (found) {
				continue;
			}
			for (int j = i + 1; j < size; j++) {
				if (arr[i] == arr[j]) {
					found = true;
					break;
				}
			}
			if (!found) {
				System.out.println(arr[i]);
				break;
			}
		}

		sc.close();

	}

}
