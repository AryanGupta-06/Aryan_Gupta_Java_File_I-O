package Java_File_IO.Basic;

import java.io.FileWriter;
import java.io.IOException;

public class Q1 {
    public static void main(String[] args) {
        // Specify the file name
        String fileName = "notes.txt";

        // The content to write into the file
        String content = "This is my first file in Java.";

        // Use FileWriter to create and write to the file
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            fileWriter.write(content);
            System.out.println("File created and content written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while creating or writing to the file.");
            e.printStackTrace();
        }
    }
}

