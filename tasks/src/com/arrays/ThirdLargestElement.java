package com.arrays;

import java.util.Scanner;

public class ThirdLargestElement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();

		int[] arr = new int[size];
		System.out.println("Enter elements to the array: ");
		for(int i = 0; i<size; i++) {
			arr[i] = sc.nextInt();
		}

		int sec = Integer.MIN_VALUE;
		int lar = Integer.MIN_VALUE;
		int thr = Integer.MIN_VALUE;

		for (int i = 0; i < size; i++) {
			if(arr[i] > lar) {
				thr = sec;
				sec = lar;
				lar = arr[i];
			} else if(arr[i] > sec) {
				thr = sec;
				sec = arr[i];
			} else if(arr[i] > thr) {
				thr = arr[i];
			}
			
		}
		System.out.println(thr);

		sc.close();


	}

}
