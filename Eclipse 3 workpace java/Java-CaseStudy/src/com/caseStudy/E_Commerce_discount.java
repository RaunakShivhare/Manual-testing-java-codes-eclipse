package com.caseStudy;

public class E_Commerce_discount {

	public static void main(String[] args) {
		
		        double purchaseAmount = 6000;
		        double discount = (purchaseAmount >= 5000) ? 500 : 0;
		        System.out.println("Discount = " + discount);
		    }
		}