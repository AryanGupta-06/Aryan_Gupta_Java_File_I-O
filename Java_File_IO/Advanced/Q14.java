package Java_File_IO.Advanced;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class Q14 {
    public static void main(String[] args) {
        // Specify the source and destination file paths
        Path sourcePath = Paths.get("source.txt");
        Path destinationPath = Paths.get("destination.txt");

        try {
            // Copy the contents of the source file to the destination file
            Files.copy(sourcePath, destinationPath);
            System.out.println("Data has been successfully copied from " + sourcePath + " to " + destinationPath + ".");
        } catch (IOException e) {
            System.out.println("An error occurred while copying data: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

