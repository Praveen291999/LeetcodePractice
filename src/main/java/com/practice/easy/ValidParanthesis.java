package com.practice.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

//Input: s = "()[]{}"
//Output: true
//Example 3:
//
//Input: s = "(]"
//Output: false

//logic1: by checking count after matching
//int count = 0;
//for (int i = 0; i < s.length() - 1; i++) {
//	char c = s.charAt(i);
//	char c1 = s.charAt(i + 1);
//	if (mapString.containsKey(c) && mapString.get(c).equals(c1)) {
//		count++;
//	}
//}
//if ((s.length() / 2) == count) {
//	return true;
//}
//return false;
public class ValidParanthesis {
	public static boolean isValid(String s) {
		Map<Character, Character> mapString = new HashMap<>();
		mapString.put('(', ')');
		mapString.put('{', '}');
		mapString.put('[', ']');

		// using Stack
		Stack<Character> stack = new Stack<>();
		for (char c : s.toCharArray()) {
			if (mapString.containsKey(c)) {
				stack.push(c);
			} else {
				if (stack.isEmpty() || mapString.get(stack.pop()) != c) {
					return false;
				}
			}

		}
		return stack.isEmpty();

	}

	public static void main(String[] args) {
		String s = "{[]}";
		//below line is used to remove the blank space between the characters.
		String a1 = s.replaceAll("\\s", "");
		System.out.println(isValid(a1));

	}

}
