package fileHandling_CASESTUDY;

import java.io.FileWriter;
import java.io.IOException;

public class WriteDemo {
	public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("log.txt")) {
            writer.write("User logged in at 10:00 AM\n");
            writer.write("User performed transaction ID: 12345\n");
            System.out.println("Data written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
