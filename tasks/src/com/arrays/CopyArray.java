package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];

		System.out.println("Enter the elements in the array: ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		int[] arr2 = new int[size];

		for (int i = 0; i < size; i++) {
			arr2[i] = arr[i];
		}
		
		System.out.println(Arrays.toString(arr2));

		sc.close();

	}

}
