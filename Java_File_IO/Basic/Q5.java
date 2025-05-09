package Java_File_IO.Basic;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Q5 {
    public static void main(String[] args) {
        // Specify the source and destination file names
        String sourceFile = "source.txt";
        String destinationFile = "backup.txt";

        // Use FileReader and FileWriter to copy the contents
        try (FileReader fileReader = new FileReader(sourceFile);
             FileWriter fileWriter = new FileWriter(destinationFile)) {

            int character;
            while ((character = fileReader.read()) != -1) {
                fileWriter.write(character);
            }
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while copying the file.");
            e.printStackTrace();
        }
    }
}

