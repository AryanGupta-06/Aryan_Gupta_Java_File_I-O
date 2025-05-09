package Java_File_IO.Advanced;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Q15 {
    public static void main(String[] args) {
        // Specify the input and output file names
        String inputFileName = "input.txt";
        String outputFileName = "charcount.txt";

        // Create a map to store character frequencies
        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        // Read the input file and count character frequencies
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFileName))) {
            int character;
            while ((character = bufferedReader.read()) != -1) {
                char ch = (char) character;
                charFrequencyMap.put(ch, charFrequencyMap.getOrDefault(ch, 0) + 1);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the input file.");
            e.printStackTrace();
        }

        // Write the character frequencies to the output file
        try (FileWriter fileWriter = new FileWriter(outputFileName)) {
            for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
                fileWriter.write("'" + entry.getKey() + "': " + entry.getValue() + "\n");
            }
            System.out.println("Character frequency has been written to " + outputFileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the output file.");
            e.printStackTrace();
        }
    }
}

