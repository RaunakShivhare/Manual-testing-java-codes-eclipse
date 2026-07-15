package fileHandling_CASESTUDY;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadDemo {
	   public static void main(String[] args) {
	        try (BufferedReader br = new BufferedReader(new FileReader("customer.txt"))) {
	            String line;
	            while ((line = br.readLine()) != null) {
	                System.out.println("Customer Data: " + line);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
}
