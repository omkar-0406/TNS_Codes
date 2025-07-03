package com.assignment1;

public class EligibilityforBloodDonation {

	public static void main(String[] args) {
		int age = 45;
		
		if(age>18) {
			if(age<60) {
				System.out.println("You are eligible for blood donation");
			}else {
				System.out.println("Your age is greater than 60");
			}
		}else {
			System.out.println("Your age is less than 18");
		}
	}

}
