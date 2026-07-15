package com.ifp;

public class Bank_balance {

	public static void main(String[] args) {
		 int balance = 25; // Example balance

	        if (balance > 0) {
	            System.out.println("Your account is active. Balance: " + balance);
	        } else if (balance == 0) {
	            System.out.println("Your account balance is zero.");
	        } else {
	            System.out.println("Your account is overdrawn");
	        }
	    }
	}
	