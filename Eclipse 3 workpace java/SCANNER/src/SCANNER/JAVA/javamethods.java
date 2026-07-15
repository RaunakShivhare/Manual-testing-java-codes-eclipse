package SCANNER.JAVA;
import java.util.Scanner;
public class javamethods {
	

	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // nextBoolean()
	        System.out.print("Enter a boolean value (true/false): ");
	        boolean boolVal = sc.nextBoolean();
	        System.out.println("You entered (boolean): " + boolVal);

	        // nextByte()
	        System.out.print("Enter a byte value: ");
	        byte byteVal = sc.nextByte();
	        System.out.println("You entered (byte): " + byteVal);

	        // nextDouble()
	        System.out.print("Enter a double value: ");
	        double doubleVal = sc.nextDouble();
	        System.out.println("You entered (double): " + doubleVal);

	        // nextFloat()
	        System.out.print("Enter a float value: ");
	        float floatVal = sc.nextFloat();
	        System.out.println("You entered (float): " + floatVal);

	        // nextInt()
	        System.out.print("Enter an int value: ");
	        int intVal = sc.nextInt();
	        System.out.println("You entered (int): " + intVal);

	        // nextLong()
	        System.out.print("Enter a long value: ");
	        long longVal = sc.nextLong();
	        System.out.println("You entered (long): " + longVal);

	        // nextShort()
	        System.out.print("Enter a short value: ");
	        short shortVal = sc.nextShort();
	        System.out.println("You entered (short): " + shortVal);

	        // Clear buffer before nextLine()
	        sc.nextLine();

	        // nextLine()
	        System.out.print("Enter a line of text: ");
	        String lineVal = sc.nextLine();
	        System.out.println("You entered (line): " + lineVal);

	        sc.close();
	    }
	}


