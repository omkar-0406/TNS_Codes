package com.banking_Transaction;

public class CheckingAccount extends Account{

	public CheckingAccount(String accountNumber, double initailbalance) {
		super(accountNumber, initailbalance);
	}

	@Override
	public void deposit(double amount) {
		initailbalance += amount;
		System.out.println("Deposited "+ amount +" into saving account");
	}
	
	@Override
	public void withdraw(double amount) {
		if(initailbalance >= amount) {
		initailbalance -= amount;
		System.out.println("Withdrawed "+ amount +" from saving account");
		}else {
			System.out.println("Insufficient Balance");
		}
	}
	
	@Override
    public double getBalance() {
        return initailbalance;
    }
}
