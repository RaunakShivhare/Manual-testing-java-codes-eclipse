package com.ifp;

public class Login_Validation {

	public static void main(String[] args) {
		 String user = "admin";
	        String pass = "1234";

	        if (user.equals("admin") && pass.equals("1234"))
	            System.out.println("Login successful");
	        else
	            System.out.println("Login failed");

	}

}
