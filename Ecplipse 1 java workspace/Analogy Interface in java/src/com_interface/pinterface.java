package com_interface;
interface FirstInterface{
	public void myMethod();//interface method
}

interface SecondInterface{
	public void myOtherMethod();
}
class DemoClass implements FirstInterface, SecondInterface{
	public void myMethod() {
		System.out.println("Enter Some text..");
	}
	
	public void myOtherMethod() {
		System.out.println("Enter some other text..");
	}
}

public interface pinterface {
	public static void main(String args[]) {
		DemoClass myObj=new DemoClass();
		myObj.myMethod();
		myObj.myOtherMethod();
	}

}
