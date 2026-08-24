package com.arrays;

import java.util.Scanner;

public class FirstOccurrence {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter elements to the array: ");
		for(int i = 0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the element to find: ");
		int find = sc.nextInt();
		
		int index = -1;
		
		for(int i = 0; i<size; i++) {
			if(arr[i] == find) {
				index = i;
				break;
			}
		}
		
		System.out.println(index);
		
		
		sc.close();


	}

}
