package com.overloading;

public class Operation {
	
	//method overloading
	//check whether number is palindrome or not
	
	public static boolean isPalindrome(int number) {
		int rev = 0;
		int dummy = number;
		while(number != 0) { //number is not equal to 0
			rev = rev*10 + number%10; //reverse 
			number /= 10; 
		}
		return dummy == rev;
	}
	
	//check whether String is Palindrome or not
	public static boolean isPalindrome(String str) {
		String rev;
		rev = new StringBuffer(str).reverse().toString();
		return str.equals(rev);
	}
	
}
