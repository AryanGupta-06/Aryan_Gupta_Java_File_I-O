package Java_File_IO.Advanced;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Q12 {
    public static void main(String[] args) {
        // Specify the folder containing .txt files
        String folderPath = "File_Folder";

        // Specify the output file name
        String outputFileName = "merged.txt";

        // Create a File object for the folder
        File folder = new File(folderPath);

        // Check if the folder exists and is a directory
        if (folder.exists() && folder.isDirectory()) {
            // Create a FileWriter for the output file
            try (FileWriter fileWriter = new FileWriter(outputFileName)) {
                // Iterate over all files in the folder
                for (File file : folder.listFiles()) {
                    // Check if the file is a .txt file
                    if (file.isFile() && file.getName().endsWith(".txt")) {
                        // Read the content of the .txt file
                        try (FileReader fileReader = new FileReader(file)) {
                            char[] buffer = new char[1024];
                            int bytesRead;
                            while ((bytesRead = fileReader.read(buffer)) != -1) {
                                fileWriter.write(buffer, 0, bytesRead);
                            }
                            fileWriter.write(System.lineSeparator()); // Add a newline after each file's content
                        } catch (IOException e) {
                            System.out.println("An error occurred while reading the file: " + file.getName());
                            e.printStackTrace();
                        }
                    }
                }
                System.out.println("All .txt files in the folder have been merged into " + outputFileName);
            } catch (IOException e) {
                System.out.println("An error occurred while writing to the output file.");
                e.printStackTrace();
            }
        } else {
            System.out.println("The specified folder does not exist or is not a directory.");
        }
    }
}

