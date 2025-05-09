package Java_File_IO.Advanced;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Q11 {
    public static void main(String[] args) {
        // Specify the source and destination file names
        String sourceFile = "image.jpg";
        String destinationFile = "image_copy.jpg";

        // Use FileInputStream and FileOutputStream to copy the binary file
        try (FileInputStream fileInputStream = new FileInputStream(sourceFile);
             FileOutputStream fileOutputStream = new FileOutputStream(destinationFile)) {

            byte[] buffer = new byte[1024];
            int bytesRead;

            // Read and write the binary data in chunks
            while ((bytesRead = fileInputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer, 0, bytesRead);
            }
            System.out.println("The contents of " + sourceFile + " have been copied to " + destinationFile + ".");
        } catch (IOException e) {
            System.out.println("An error occurred while copying the file.");
            e.printStackTrace();
        }
    }
}
