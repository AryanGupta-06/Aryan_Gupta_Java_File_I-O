package Java_File_IO.Advanced;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q13 {
    public static void main(String[] args) {
        // Specify the log file name
        String logFileName = "server.log";

        // Use BufferedReader to read the log file
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(logFileName))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                // Check if the line contains the word "ERROR"
                if (line.contains("ERROR")) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the log file.");
            e.printStackTrace();
        }
    }
}

