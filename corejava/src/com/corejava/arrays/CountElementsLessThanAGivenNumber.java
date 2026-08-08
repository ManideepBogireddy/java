package com.corejava.arrays;

import java.util.Scanner;

public class CountElementsLessThanAGivenNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter " + size + " Elements: ");

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter the number that compare with the array elements: ");
		int num = sc.nextInt();

		int count = 0;

		for (int j = 0; j < size; j++) {
			if (arr[j] < num) {
				count++;
			}
		}
		System.out.println("Elements less than " + num + " = " + count);

		sc.close();

	}

}
