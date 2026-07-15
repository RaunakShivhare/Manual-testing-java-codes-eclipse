package com.exceptionhandling;

import java.util.Scanner;
import java.io.IOException;


public class checked_ioException {
	int x, y;
	 public void accept() throws IOException {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter two values");
	        x = sc.nextInt();
	        y = sc.nextInt();
	    }

	    public void display() {
	        int result = x + y;
	        System.out.println("Addition = " + result);
	    }
	public static void main(String[] args) {
		checked_ioException ce = new checked_ioException();
        try {
            ce.accept();
        } catch (IOException ie) {
            System.out.println(ie);
        }
        ce.display();
		// TODO Auto-generated method stub

	}

}