package com.method_overloading;

public class Banking_Application {
	public void transfer(double amount) {
		System.out.println("Transferred amount: "+ amount);
	}
	
	public void transfer(double amount, String accountNumber) {
		System.out.println("Transferred " + amount + "to Account:" +accountNumber);
	}
	
	public void transfer(double amount, String accountNumber, String remarks) {
		System.out.println("Transferred "+amount);
		System.out.println("Account number: "+accountNumber);
		System.out.println("Remarks " +remarks);
	}


 

	public static void main(String[] args) {
		Banking_Application mt = new Banking_Application();
		mt.transfer(1000);
		mt.transfer(5000, "SBINDNB");
		mt.transfer(10000,"74738646","houserent");
	
		// TODO Auto-generated method stub

	}

}
