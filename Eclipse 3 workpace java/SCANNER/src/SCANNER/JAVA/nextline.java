package SCANNER.JAVA;
import java.util.Scanner;

public class nextline {

	public static void main(String[] args) {
		Scanner keyboard =new Scanner(System.in);
		System.out.print("please enter your first name initial");
		String firstInitial=keyboard.nextLine();
		System.out.print("please enter your last name");
		String lastName=keyboard.nextLine();
		System.out.print("please enter your house number");
		int houseNumber = keyboard.nextInt();
		System.out.print("please enter your street name");
		String streetName=keyboard.nextLine();
		System.out.print("please enter your street type");
		String streetType=keyboard.nextLine();
		System.out.print("please enter your city");
		String city=keyboard.nextLine();
		System.out.print(firstInitial +" "+lastName+" "+ houseNumber+ " ");
		System.out.print(streetName +" "+streetType+" "+city+ " ");
		
		// TODO Auto-generated method stub

	}

}
