package fileHandling_CASESTUDY;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileOpsDemo {
    public static void main(String[] args) {
        Path source = Paths.get("customer.txt");
        Path target = Paths.get("backup/customer.txt");

        try {
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied.");

            Files.move(target, Paths.get("archive/customer.txt"), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File moved.");

            Files.delete(Paths.get("archive/customer.txt"));
            System.out.println("File deleted.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
