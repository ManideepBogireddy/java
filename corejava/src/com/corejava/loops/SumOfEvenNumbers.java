package com.corejava.loops;

public class SumOfEvenNumbers {
	
	static void sumEven() {
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("The sum of even numbers from 1 to 100 = "+sum);
	}
	
	public static void main(String[] args) {
		sumEven();
	}

}
