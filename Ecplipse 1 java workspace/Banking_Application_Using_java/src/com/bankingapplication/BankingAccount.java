package com.bankingapplication;

class Account{
	String accountholder= "Raunak Shivhare";
	double balance=100000;
	
	public void deposit(double amount) {
		balance = balance+ amount;
		System.out.println("Amount deposited: "+ amount);
	}
	public void withdraw(double amount) {
		balance=balance-amount;
		System.out.println("Amount withdrawn:"+ amount);
	}
	
	public void displayBalance() {
		System.out.println("Current Balance:" + balance);
	}
}

class SavingsAccount extends Account {
	public void calculateInterest() {
		double interest= balance*5 / 100;
		System.out.println("Interest earned:"+ interest);
	}
}

public class BankingAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount sa= new SavingsAccount();
		System.out.println("Account holder:"+ sa.accountholder);

	}

}
