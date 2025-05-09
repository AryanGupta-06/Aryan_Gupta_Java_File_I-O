package Java_File_IO.Basic;

import java.io.File;

public class Q3 {
    public static void main(String[] args) {
        // Specify the file name
        String fileName = "report.pdf";

        // Create a File object
        File file = new File(fileName);

        // Check if the file exists
        if (file.exists()) {
            // Print the file size in bytes
            System.out.println("File exists. Size: " + file.length() + " bytes.");
        } else {
            System.out.println("File does not exist.");
        }
    }
}

