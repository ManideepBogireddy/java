package com.corejava.arrays;

import java.util.Scanner;

public class CumulativeSumArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		System.out.println("Enter the "+size+" elements: ");
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		
		for (int i = 0; i <size; i++) {
			sum += arr[i];
			System.out.print(sum +" ");
		}

		
		sc.close();

	}

}
