package com.task;

import java.util.Scanner;

public class FirstNPrimeNumbers {
	
	
    static boolean isPrime(int n) {

        boolean status = true;

        if (n == 0 || n == 1) {
            status = false;
        } else {
            for (int i = n - 1; i >= 2; i--) {

                if (n % i == 0) {
                    status = false;
                    break;
                }
            }
        }

        return status;
    }
    
    static void nPrimeNum(int n) {
    	int count = 0;
    	int num = 2;
    	
    	while (count < n) {
    		if(isPrime(num)) {
    			System.out.print(num+ " ");
    			count++;
    		}
    		num++;
    	}
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		nPrimeNum(n);

	

		sc.close();

	}

}
