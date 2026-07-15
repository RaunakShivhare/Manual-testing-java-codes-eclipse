package com.ifp;

public class E_Commerce_discount {

	public static void main(String[] args) {
		int amount = 111111; 

        if (amount >= 1000)
            System.out.println("20% discount applied");
        else if (amount >= 500)
            System.out.println("10% discount applied");
        else
            System.out.println("5% discount applied");
        }

}
