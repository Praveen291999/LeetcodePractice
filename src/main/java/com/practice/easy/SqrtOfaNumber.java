package com.practice.easy;

//Square root of a number
//Example 1:
//
//Input: x = 4
//Output: 2
//Explanation: The square root of 4 is 2, so we return 2.
//Example 2:
//
//Input: x = 8
//Output: 2
//Explanation: The square root of 8 is 2.82842...,
//and since we round it down to the nearest integer, 2 is returned.
public class SqrtOfaNumber {

	public static int mySqrt(int x) {
		double a = Math.sqrt(x);
		int result = (int) Math.floor(a);
		return result;
	}

	public static void main(String[] args) {
		int a = 64;
		System.out.println(mySqrt(a));

	}

}
