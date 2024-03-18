package com.practice.easy;


class Palindrome {
	public boolean isPalindrome(int x) {
		//negative numbers not a palindrome number and numbers like 
		//10,20 if reversed -01,02 so modulo 10 -if 0 not a palindrome 
		if (x < 0 || (x != 0 && x % 10 == 0)) {
			return false;
		}
			
		int rev = 0;
		while (x > rev) {
			int digit=x%10;
			rev=rev*10+digit;
			x=x/10;
		}
		// This part handles the case when the length of x is odd. In such cases, when we reverse the number, 
		//the middle digit will remain in the middle and doesn't affect whether the number is a palindrome or not
		return (x == rev || x == rev / 10);
	}

	public static void main(String[] args) {
		int a = 2001;
		Palindrome palindrome = new Palindrome();
		if (palindrome.isPalindrome(a)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}

	}
	
	//Solution 2: Without converting to String
//	public boolean isPalindrome(int x) {
//		String s=String.valueOf(x);
//		StringBuilder builder=new StringBuilder();
//		builder.append(s);
//		return builder.reverse().toString().equals(s);
	
	
}