package SCANNER.JAVA;

import java.util.Scanner;

public class SCANNER_EXAMPLE {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("enter your name");
		
		String value= input.next();
		System.out.println("Text Entered:" + value);
		
		input.close();
		// TODO Auto-generated method stub

	}

}
