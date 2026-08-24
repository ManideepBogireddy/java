package com.arrays;

import java.util.Scanner;

public class FrequencyElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter elements: ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < size; i++) {
			boolean freq = false;
			int count = 1;
			for (int k = 0; k < i; k++) {
				if (arr[i] == arr[k]) {
					freq = true;
					break;
				}
			}
			if (freq) {
				continue;
			}
			for (int j = i + 1; j < size; j++) {
				if (arr[i] == arr[j]) {
					freq = true;
					count++;
				}
			}
			if (freq) {
				System.out.println(arr[i] + " -> " + count);
			} else {
				System.out.println(arr[i] + " -> " + count);
			}

		}

		sc.close();
	}

}
