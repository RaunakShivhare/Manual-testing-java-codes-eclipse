package com.exceptionhandling;

public class ExceptionsExampleTest {
    public static void main(String[] args) {
        Integer age = null;
        String ageAsString;

        try {
            ageAsString = age.toString(); // throws NullPointerException
        } catch (NullPointerException e) {
            age = 18;
            ageAsString = age.toString();
        }

        System.out.println(age);          // prints 18
        System.out.println(ageAsString);  // prints "18"

        String yourAge = "You are " + age + " years old";
        System.out.println(yourAge);      // prints "You are 18 years old"
    }
}
