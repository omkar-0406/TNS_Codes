package com.assignment1;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int a = sc.nextInt();
		boolean isprime = true;
		
		for(int i=2; i<a; i++) {
			if(a%i==0) {
				isprime = false;
			}
		}
		
		if(isprime) {
			System.out.println("Prime number");
		}else {
			System.out.println("not a prime number");
		}
		
		sc.close();
	}

}
