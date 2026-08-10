package com.corejava.arrays;

import java.util.Scanner;

public class SecondLargestElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter " + size + " Elements: ");

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		int max = arr[0];
		int max2 = arr[0];

		for (int j = 1; j < size; j++) {
			if (arr[j] > max) {
				max2 = max;
				max = arr[j];
			} else if (arr[j] > max2) {
				max2 = arr[j];
			}
		}

		System.out.println("Second largest = "+max2);

		sc.close();

	}

}
