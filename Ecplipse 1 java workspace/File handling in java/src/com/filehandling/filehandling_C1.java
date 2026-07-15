package com.filehandling;

import java.io.File;
import java.io.IOException;


public class filehandling_C1 {

	public static void main(String[] args) {
		try {
			File myObj = new File("C:\\Users\\rauna\\OneDrive\\Files\\Raunak.txt");
			
			if(myObj.createNewFile()) {
				System.out.println("file created: "+ myObj.getName());
				System.out.println("Absolute path: "+ myObj.getAbsolutePath());
			} else {
				System.out.println("file already exists");
			}
		}
		
		catch (IOException e) {
			System.out.println("an error occured");
			e.printStackTrace();
		}
		// TODO Auto-generated method stub

	}

}
