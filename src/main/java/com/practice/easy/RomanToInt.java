package com.practice.easy;

import java.util.HashMap;

/*Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

Input: s = "III"
Output: 3
Explanation: III = 3.
Example 2:

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.*/

public class RomanToInt {
	public int roman(String s) {
		
		HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);
        
        int result=0;
        int previousValue=0;
        
		for (int i = s.length() - 1; i >= 0; i--) {
			char charseq = s.charAt(i);
			int currentValue = romanValues.get(charseq);

			if (currentValue < previousValue) {
				result = result - currentValue;
			} else {
				result = result + currentValue;
			}
			previousValue = currentValue;
		}
		return result;
	}

	public static void main(String args[]) {
		String s="MCMXCIV";
		RomanToInt romanToInt=new RomanToInt();
		int a=romanToInt.roman(s);
		System.out.println(a);
		
	}
}
