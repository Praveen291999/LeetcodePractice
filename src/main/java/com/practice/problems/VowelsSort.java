package com.practice.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VowelsSort {
	public static void main(String[] args) {
		

		Scanner s= new Scanner(System.in);
		System.out.println("Enter the String:");
		String in=s.next();
		
		List<Character> sortedVowels=new ArrayList<>();
		for(int i=0;i<in.length();i++) {
			char c=in.charAt(i);
			sortedVowels.add(c);
			
		}
		
		
		System.out.println(sortedVowels.get(0));
		
		
	
	
//		for(int i=0;i<in.length();i++) {
//			char c=in.charAt(i);
//			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
//					|| c == 'U') {
//				int asscii=(int) c;
//				
//				System.out.println(asscii);
//
//			}
//			
//			
//		}
	}

}
