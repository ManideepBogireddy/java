package com.corejava.arrays;

import java.util.Scanner;

public class LargestElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the size of array: ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		int max = arr[0];

		for (int j = 0; j < size; j++) {
			if (arr[j] > max) {
				max = arr[j];
			}
		}
		System.out.println("The largest number of the array is: " + max);

		sc.close();

	}

}
