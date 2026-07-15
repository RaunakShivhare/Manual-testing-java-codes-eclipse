/*Example : E-Commerce Application
Customers can search products using different options.*/
package com.method_overloading;

public class Search_product {
	public void search(String productName) {
		System.out.println("Searching by product name");
	}
	public void search(String productName, String brand) {
		System.out.println("Searching by product name and Brand");
	}
	public void search(String productName, String brand, int price) {
		System.out.println("Searching by product name and Brand and Price");
	}
	
	public static void main(String[] args) {
		Search_product s= new Search_product();
		s.search("laptop");
		s.search("laptop","Macbook pro");
		s.search("laptop", "asus", 10000);
		// TODO Auto-generated method stub

	}

}
