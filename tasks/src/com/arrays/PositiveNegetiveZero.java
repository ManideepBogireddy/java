package com.arrays;

import java.util.Arrays;


public class PositiveNegetiveZero {

	public static void main(String[] args) {

		int[] arr = { 1, 23, 34, 56, -56, -89, 0, 0 };
		int posLen = 0;
		int negLen = 0;
		int zeroLen = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				posLen++;
			} else if (arr[i] < 0) {
				negLen++;
			} else {
				zeroLen++;
			}
		}
		int[] pos = new int[posLen];

		int p = 0;
		int[] neg = new int[negLen];
		int n = 0;
		int[] zero = new int[zeroLen];
		int z = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				pos[p] = arr[i];
				p++;
			} else if (arr[i] < 0) {
				neg[n] = arr[i];
				n++;
			} else {
				zero[z] = arr[i];
				z++;
			}
		}

		System.out.println("Positive array: " + Arrays.toString(pos));
		System.out.println("Negative array: " + Arrays.toString(neg));
		System.out.println("Zero array: " + Arrays.toString(zero));


	}

}
