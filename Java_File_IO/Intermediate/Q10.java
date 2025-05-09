package Java_File_IO.Intermediate;

import java.io.File;

public class Q10 {
    public static void main(String[] args) {
        // Specify the folder name
        String folderName = "Java_File_IO";

        // Create a File object for the folder
        File folder = new File(folderName);

        // Check if the folder exists and is a directory
        if (folder.exists() && folder.isDirectory()) {
            // Get the list of all files and directories
            File[] listOfFiles = folder.listFiles();

            if (listOfFiles != null) {
                System.out.println("Files and directories in the folder '" + folderName + "':");
                for (File file : listOfFiles) {
                    if (file.isFile()) {
                        System.out.println("File: " + file.getName());
                    } else if (file.isDirectory()) {
                        System.out.println("Directory: " + file.getName());
                    }
                }
            } else {
                System.out.println("The folder is empty or an error occurred.");
            }
        } else {
            System.out.println("The folder does not exist or is not a directory.");
        }
    }
}

