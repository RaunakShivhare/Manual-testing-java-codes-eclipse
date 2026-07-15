package com.exceptionhandling;

public class checked_exception_trycatch {
	int x=10;
	public void m1() {
		System.out.println("value of x is: " +x);
	}

	public static void main(String[] args) {
		checked_exception_trycatch obj=new checked_exception_trycatch();
		obj.m1();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub

	}

}
