package Java_File_IO.Intermediate;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class Q7 {
    public static void main(String[] args) {
        // Specify the file name
        String fileName = "log.txt";

        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // The content to append to the file
        String content = "Last updated on " + currentDate.toString();

        // Use FileWriter to append to the file
        try (FileWriter fileWriter = new FileWriter(fileName, true)) {
            fileWriter.write(content + System.lineSeparator());
            System.out.println("Content appended successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while appending to the file.");
            e.printStackTrace();
        }
    }
}

