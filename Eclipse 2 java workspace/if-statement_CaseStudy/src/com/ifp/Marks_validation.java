package com.ifp;

public class Marks_validation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks = 91;

        if (marks < 0 || marks > 100)
            System.out.println("Invalid marks!");
        else if (marks >= 90)
            System.out.println("Grade: A+");
        else if (marks >= 75)
            System.out.println("Grade: A");
        else if (marks >= 50)
            System.out.println("Grade: B");
        else if (marks >= 33)
            System.out.println("Grade: C");
        else
            System.out.println("Fail");
    }
}


