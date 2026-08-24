package com.task;

import java.util.Scanner;

public class MissingElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter elements: ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < size; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		for (int i = 1; i <= max; i++) {
			boolean found = false;
			for (int j = 0; j < size; j++) {
				if (arr[j] == i) {
					found = true;
					break;
				}
			}
			if (!found) {
				System.out.println(i);
			}
		}

		sc.close();

	}

}
