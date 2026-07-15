package com.exceptionhandling;

public class unchecked_exceptiontryCatch {

	public static void main(String[] args) {
		System.out.println("program started");
		try {
			int x=10/0;
			System.out.println("division result is:"+ x);
		}
		catch (ArithmeticException e) {
			System.out.println("something went wrong.please check the exception." + e.getMessage());
		}
		
		System.out.println("Program end");
		// TODO Auto-generated method stub

	}

}
