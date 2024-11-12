package com.practice.easy;

import java.math.BigInteger;
import java.util.Arrays;

//add plus one on the array return the resulting array
//Example 1:
//
//Input: digits = [1,2,3]
//Output: [1,2,4]
//Explanation: The array represents the integer 123.
//Incrementing by one gives 123 + 1 = 124.
//Thus, the result should be [1,2,4].
//Example 2:
//
//Input: digits = [4,3,2,1]
//Output: [4,3,2,2]
//Explanation: The array represents the integer 4321.
//Incrementing by one gives 4321 + 1 = 4322.
//Thus, the result should be [4,3,2,2].

//program: while trying to store the String value in integer array it will be converted into
//asscii value so subtract with '0'

public class PlusOne {

	public static int[] plusOne(int[] digits) {
		StringBuilder sb = new StringBuilder();
		for (int a : digits) {
			sb.append(a);
		}
		BigInteger bigIntegerValue = new BigInteger(sb.toString());
		BigInteger result = bigIntegerValue.add(BigInteger.valueOf(1));

		String s = String.valueOf(result);
		int[] array = new int[s.length()];
		for (int i = 0; i < s.length(); i++) {
			array[i] = s.charAt(i) - '0';
		}

		return array;
	}

	public static void main(String[] args) {

		int[] a = new int[] { 1, 2, 3 };
		System.out.println(Arrays.toString(plusOne(a)));

	}
}
