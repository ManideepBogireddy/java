package com.corejava.arrays;

import java.util.Scanner;

public class SearchForAnElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();

		int[] arr = new int[size];
		System.out.println("Enter " + size + " elements: ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the element you need to found: ");
		int search = sc.nextInt();

		boolean found = false;

		for (int j = 0; j < size; j++) {
			if (arr[j] == search) {
				found = true;
				break;
			} else {
				found = false;
			}
		}
		if (found) {
			System.out.println("Element Found!");
		} else {
			System.out.println("Elemnent Not Found");
		}

		sc.close();
	}

}
