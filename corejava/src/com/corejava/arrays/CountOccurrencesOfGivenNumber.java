package com.corejava.arrays;

import java.util.Scanner;

public class CountOccurrencesOfGivenNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();

		int[] arr = new int[size];
		System.out.println("Enter " + size + " elements: ");

		for (int n : arr) {
			arr[n] = sc.nextInt();
		}
		System.out.println("Enter the element you need to find: ");
		int search = sc.nextInt();

		boolean found = false;
		int count = 0;

		for (int j = 0; j < size; j++) {
			if (arr[j] == search) {
				found = true;
			}
			count++;
		}
		if (found) {
			System.out.println(search + " occurs " + count + " times");
		} else {
			System.out.println("Elemnent Not Found");
		}

		sc.close();
	}

}
