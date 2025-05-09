package Java_File_IO.Basic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q4 {
    public static void main(String[] args) {
        // Specify the file name
        String fileName = "data.txt";

        // Initialize the line count
        int lineCount = 0;

        // Use BufferedReader to read the file
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            while (bufferedReader.readLine() != null) {
                lineCount++;
            }
            System.out.println("Number of lines in the file: " + lineCount);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}

