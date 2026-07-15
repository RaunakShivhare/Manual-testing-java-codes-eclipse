package com.acessmodifier;

class A {
	int X=100;
}

public class private_java {

	public static void main(String[] args) {
		A obj =new A();
		int output = obj.X;
		System.out.println("Output is: " + output);
		// TODO Auto-generated method stub

	}

}
