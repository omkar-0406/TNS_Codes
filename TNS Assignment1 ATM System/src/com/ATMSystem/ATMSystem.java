package com.ATMSystem;

import java.util.*;

public class ATMSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int balance = 50000;
		
		do {
			System.out.println("1. Check a balance");
			System.out.println("2. Deposit a money");
			System.out.println("3. Withdraw a money");
			System.out.println("4. Exit");
			System.out.println("Choose an option");
			int x = sc.nextInt();
			
			switch(x) {
			case 1:
				System.out.println("Your current balance: "+ balance);
				break;
				
			case 2:
				System.out.println("Enter a amount you want to deposit");
				int deposit = sc.nextInt();
				 balance = balance + deposit;
				System.out.println("Your current balance: "+ balance);
				break;
				
			case 3:
				System.out.println("Enter a amount to withdraw");
				int withdraw = sc.nextInt();
				
				if(balance>withdraw) {
					balance = balance - withdraw;
					System.out.println("Amount after withdrawal: "+ balance);
				}else {
					System.out.println("Insufficient balance");
				}
				break;
				
			case 4:
				System.out.println("Thank you for using ATM");
				System.exit(0);
				sc.close();
				break;
				
			default:
				System.out.println("Invalid choice");
				
			}
		}
		while(true);
	}

}
