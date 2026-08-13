//Given an integer x, return true if x is a palindrome, and false otherwise.
//
// 
//
//Example 1:
//
//Input: x = 121
//Output: true
//Explanation: 121 reads as 121 from left to right and from right to left.
//Example 2:
//
//Input: x = -121
//Output: false
//Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
//Example 3:
//
//Input: x = 10
//Output: false
//Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
// 
//
//Constraints:
//
//-231 <= x <= 231 - 1
// 
//
//Follow up: Could you solve it without converting the integer to a string?

package com.leetcode;

import java.util.Scanner;

public class PalindromeNumber {

	static boolean isPalindrome(int n) {
		boolean result = false;

		if (n < 0) {
			return false;
		}

		int temp = n;

		int rev = 0;

		while (n != 0) {
			int r = n % 10;
			n = n / 10;
			rev = rev * 10 + r;
		}
		if (temp == rev) {
			result = true;
		}
		return result;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		boolean result = isPalindrome(n);

		System.out.println(result);

		sc.close();

	}

}
