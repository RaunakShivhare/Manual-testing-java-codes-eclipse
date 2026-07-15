package com.exceptionhandling;

public class throws_declaration {
	int x=143;
	public void m1() {
		System.out.println("value of x is:" + x);
	}

	public static void main(String[] args) throws InterruptedException {
		throws_declaration obj=new throws_declaration();
		obj.m1();
		Thread.sleep(0);
		
		// TODO Auto-generated method stub

	}

}
