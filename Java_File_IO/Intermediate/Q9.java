package Java_File_IO.Intermediate;

import java.io.File;

public class Q9 {
    public static void main(String[] args) {
        // Specify the file name
        String fileName = "oldfile.txt";

        // Create a File object
        File file = new File(fileName);

        // Check if the file exists
        if (file.exists()) {
            // Attempt to delete the file
            if (file.delete()) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("Failed to delete the file.");
            }
        } else {
            System.out.println("File does not exist.");
        }
    }
}

