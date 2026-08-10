package com.corejava.arrays;

import java.util.Scanner;

public class SecondSmallestElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter " + size + " Elements: ");

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		int min = arr[0];
		int min2 = arr[0];

		for (int j = 2; j < size; j++) {
			if (arr[j] < min) {
				min2 = min;
				min = arr[j];
			} else if (arr[j] < min2) {
				min2 = arr[j];
			}
		}

		System.out.println("Second smallest = " + min2);

		sc.close();

	}

}
