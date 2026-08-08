package com.corejava.arrays;

import java.util.Scanner;

public class AverageOfArrayElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter " + size + " elements: ");

		for (int i = 0; i < size; i++) {

			arr[i] = sc.nextInt();
		}
		int sum = 0;

		for (int j = 0; j < size; j++) {
			sum = sum + arr[j];

		}
		double avg = (double) sum / size;
		System.out.println("Average = " + avg);

		sc.close();

	}

}
