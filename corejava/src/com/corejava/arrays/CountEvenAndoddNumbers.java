package com.corejava.arrays;

import java.util.Scanner;

public class CountEvenAndoddNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		int evenCount = 0;
		int oddCount = 0;

		for (int j = 0; j < size; j++) {
			if (arr[j] % 2 == 0) {
				evenCount++;
			} else if (arr[j] % 2 != 0) {
				oddCount++;
			}
		}
		System.out.println("Even = " + evenCount);
		System.out.println("Odd = " + oddCount);

		sc.close();

	}

}
