package Java_File_IO.Intermediate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q8 {
    public static void main(String[] args) {
        // Specify the file name
        String fileName = "employees.csv";

        // Use BufferedReader to read the file
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                // Print each line in uppercase
                System.out.println(line.toUpperCase());
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}

