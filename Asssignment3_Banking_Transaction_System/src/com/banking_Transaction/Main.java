package com.banking_Transaction;

public class Main {

	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount("Sav123",500.00);
		CheckingAccount ca = new CheckingAccount("Ch123",400.00);
		
		Transaction transaction = new Transaction();
		
		System.out.println("\n--- Performing transactions on Savings Account ---");
        transaction.transactionPerform(sa, 200, true);  // Deposit
        transaction.transactionPerform(sa, 100, false); // Withdraw
        System.out.println("Savings Account Balance: " + sa.getBalance());
        
        System.out.println("\n--- Performing transactions on Checking Account---");
        transaction.transactionPerform(ca, 200, true);  // Deposit
        transaction.transactionPerform(ca, 100, false); // Withdraw
        System.out.println("Savings Account Balance: " + ca.getBalance());
        
        System.out.println("\nTotal Accounts Created: " + Bank.getTotalAccount());
        
	}

}
