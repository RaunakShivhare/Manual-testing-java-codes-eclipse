package com.filehandling;
import java.io.FileWriter;
import java.io.IOException;
public class writetofile {
	
	public static void main(String args[]) {
		
		try {
			FileWriter myWriter=new FileWriter("C:\\Users\\rauna\\OneDrive\\Files\\Raunak.txt");
			myWriter.write("today is tuesday");
			myWriter.close();
			System.out.println("successfully wrote to the file");
		} catch (IOException e) {
			System.out.println("an error occurred");
			e.printStackTrace();
		
		}
	}

}
