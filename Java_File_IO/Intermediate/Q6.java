package Java_File_IO.Intermediate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q6 {
    public static void main(String[] args) {
        // Specify the file name
        String fileName = "paragraph.txt";

        // Initialize the word count
        int javaCount = 0;

        // Use BufferedReader to read the file
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                // Split the line into words
                String[] words = line.split("\\s+");
                // Count occurrences of the word "Java"
                for (String word : words) {
                    if (word.equalsIgnoreCase("Java")) {
                        javaCount++;
                    }
                }
            }
            System.out.println("The word 'Java' appears " + javaCount + " times in the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}

