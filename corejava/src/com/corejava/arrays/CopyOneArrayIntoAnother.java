package com.corejava.arrays;

import java.util.Scanner;

public class CopyOneArrayIntoAnother {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter " + size + " elements: ");

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		int[] copy = new int[size];
		for (int j = 0; j < size; j++) {
			copy[j] = arr[j];
			System.out.print(copy[j] + " ");

		}

		sc.close();

	}

}
