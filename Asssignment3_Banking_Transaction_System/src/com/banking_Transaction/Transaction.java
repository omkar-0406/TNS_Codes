package com.banking_Transaction;

public class Transaction {

	private final int transactionFee = 5;
	
	public final void transactionPerform(Account account, double amount, boolean isDeposite) {
		if(isDeposite) {
			account.deposit(amount);
			applyTransactionFee(account);
		}else {
			account.withdraw(amount);
            applyTransactionFee(account);
		}
	}
	
	private void applyTransactionFee(Account account) {
        account.withdraw(transactionFee);
        System.out.println("Transaction fee of " + transactionFee + " applied.");
    }
}
