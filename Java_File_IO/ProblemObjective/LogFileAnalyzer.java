package Java_File_IO.ProblemObjective;

import java.io.*;
import java.nio.file.*;
import java.util.List;

public class LogFileAnalyzer {
    public static void main(String[] args){
        String inputFileName = "server.log";
        String outputFileName = "summary.txt";

        for (String arg : args) {
            System.out.println("args : "+arg);
        }

        // Check if command-line arguments are provided
        if (args.length == 2) {
            inputFileName = args[0];
            outputFileName = args[1];

            try{
                if(!new File(inputFileName).exists()) {
                    System.out.println("Input file does not exists");
                    new File(inputFileName).createNewFile();
                    System.out.println("file created");
                } else if(!new File(outputFileName).exists()) {
                    System.out.println("Output file does not exists");
                    new File(outputFileName).createNewFile();
                    System.out.println("file created");
                }
            } catch (IOException e) {
                System.out.println("io exception caught : "+e.getMessage());
            }
        }

        try {
            // Read all lines from the input file
            List<String> lines = Files.readAllLines(Paths.get(inputFileName));
            int totalEntries = lines.size();
            long errorCount = lines.stream().filter(line -> line.contains("ERROR")).count();
            long warningCount = lines.stream().filter(line -> line.contains("WARNING")).count();

            // Write the summary report to the output file
            try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputFileName))) {
                writer.write("Log Summary Report\n");
                writer.write("------------------\n");
                writer.write("Total log entries: " + totalEntries + "\n");
                writer.write("ERROR entries: " + errorCount + "\n");
                writer.write("WARNING entries: " + warningCount + "\n");

                // Bonus: Print the percentage of ERROR and WARNING lines
                writer.write("ERROR percentage: " + (errorCount * 100.0 / totalEntries) + "%\n");
                writer.write("WARNING percentage: " + (warningCount * 100.0 / totalEntries) + "%\n");
            }

        } catch (NoSuchFileException e) {
            System.err.println("Error: Input file not found.");
        } catch (IOException e) {
            System.err.println("Error: An I/O error occurred.");
        }
    }
}
