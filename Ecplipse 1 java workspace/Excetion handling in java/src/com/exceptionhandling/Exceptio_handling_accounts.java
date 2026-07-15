package com.exceptionhandling;

public class Exceptio_handling_accounts {

	
		// TODO Auto-generated method stub
		   double balance = 5000;

		    void withdraw(double amount) {
		        try {
		            if (amount > balance) {
		                System.out.println("Insufficient balance");
		            } else {
		                balance = balance - amount;
		                System.out.println("Withdrawn amount: " + amount);
		                System.out.println("Remaining balance: " + balance);
		            }
		        } catch (Exception e) {
		            System.out.println("Got an error: " + e.getMessage());
		        } finally {
		            System.out.println("Transaction complete");
		        }
		    }
		    public static void main(String[] args) {
		    	Exceptio_handling_accounts   obj = new Exceptio_handling_accounts();
		        obj.withdraw(6000);
		        obj.withdraw(2000);

	}

}
