package com.filehandling;
import java.io.File;


public class delete_file {

	public static void main(String[] args)  {
		File myObj = new File("C:\\Users\\rauna\\OneDrive\\Files\\Raunak.txt");
	   
			if(myObj.delete()) {
		
			System.out.println("deleted the file");
			
		} else {
			System.out.println("failed to deleted the file");
		}
		
	
	
		// TODO Auto-generated method stub

	}

}
