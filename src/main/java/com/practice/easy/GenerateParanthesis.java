package com.practice.easy;

import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesis {

	public static List<String> generateParenthesis(int n) {
		List<String> op=new ArrayList<>();
		for(int i=1;i<=n;i++) {
			op.add("()");
		}
		return op;
	}

	public static void main(String[] args) {
		int a=3;
		List<String> result=generateParenthesis(a);
		System.out.println(result);
	}
//Stashing--revert
}
