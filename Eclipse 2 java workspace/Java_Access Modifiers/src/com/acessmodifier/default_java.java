package com.acessmodifier;
class B{
	int x=10;
	public void b1() {
		System.out.println("This is just a default method");
	}
	protected int z=200;
	protected void ProtectedMethod() {
		System.out.println("This is the protected method");
	}
}
public class default_java {

	public static void main(String[] args) {
		B obj = new B();
		int output = obj.z;
		System.out.println("Value of z is: " + output);
		obj.b1();
		obj.ProtectedMethod();
		// TODO Auto-generated method stub

	}

}
