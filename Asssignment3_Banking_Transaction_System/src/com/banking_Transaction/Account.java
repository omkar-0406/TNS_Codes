package com.banking_Transaction;

abstract class Account {
	
	String accountNumber;
	double initailbalance;
	
	
	
	public Account(String accountNumber, double initailbalance) {
		super();
		this.accountNumber = accountNumber;
		this.initailbalance = initailbalance;
		Bank.incrementaccount();
	}
	
	

	abstract void deposit(double amount);
	
	abstract void withdraw(double amount);
	
	abstract double getBalance();
	
	public String getAccountNumber() {
		return accountNumber;
	}
}
