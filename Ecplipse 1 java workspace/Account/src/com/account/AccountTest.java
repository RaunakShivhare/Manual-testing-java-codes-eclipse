package com.account;

class AccountTest {
    private int balance;

    public AccountTest() {
        this.balance = 0;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }
}

class CheckingAccount extends AccountTest {
    private String accountNumber;

    public CheckingAccount(String accountNumber) {
        super();
        this.accountNumber = accountNumber;
    }
}

class SavingsAccount extends AccountTest {
    public SavingsAccount(String accountNumber) {
        super();
    }

    @Override
    public void withdraw(int amount) {
        if (getBalance() < amount) {
            throw new IllegalStateException("Insufficient funds in savings account");
        }
        super.withdraw(amount);
    }
}

public class Main {
    public static void main(String[] args) {
        AccountTest account = new AccountTest();
        account.deposit(10);
        System.out.println("Balance: " + account.getBalance());

        CheckingAccount checking = new CheckingAccount("12345");
        checking.deposit(10);
        checking.withdraw(20);
        System.out.println("Checking balance: " + checking.getBalance());

        SavingsAccount savings = new SavingsAccount("67890");
        savings.deposit(10);
        savings.withdraw(5);
        System.out.println("Savings balance: " + savings.getBalance());
    }
}

