package Java_File_IO.Basic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q2 {
    public static void main(String[] args) {
        // Specify the file name
        String fileName = "input.txt";

        // Use BufferedReader to read the file
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}

