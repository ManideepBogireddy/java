package com.arrays;

import java.util.Scanner;

public class ThirdSmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();

		int[] arr = new int[size];
		System.out.println("Enter elements to the array: ");
		for(int i = 0; i<size; i++) {
			arr[i] = sc.nextInt();
		}

		int sec = Integer.MAX_VALUE;
		int lar = Integer.MAX_VALUE;
		int thr = Integer.MAX_VALUE;

		for (int i = 0; i < size; i++) {
			if(arr[i] < lar) {
				thr = sec;
				sec = lar;
				lar = arr[i];
			} else if(arr[i] < sec) {
				thr = sec;
				sec = arr[i];
			} else if(arr[i] < thr) {
				thr = arr[i];
			}
			
		}
		System.out.println(thr);
		
		sc.close();

	}

}
