/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package climatetrendanalyzer;

/**
 *
 * @author chris
 */
import java.io.*;
import java.util.*;

public class CSVDataProcessor {

    private String inputFilePath;
    private String outputDirectory;

    // The main method - the entry point of the application.
    public static void main(String[] args) {// Define the input CSV file path and the output directory.
        String inputFilePath = "src/resources/irish marine data.csv";
        String outputDir = "src/resources/ProcessedCSVs/";


        // Create an instance of CSVDataProcessor with the specified input file and output directory.
        CSVDataProcessor processor = new CSVDataProcessor(inputFilePath, outputDir);
        try {
            processor.processCSV();// Process the CSV file.
            System.out.println("Processing complete.");// Print a completion message to the console.
        } catch (IOException e) {
            e.printStackTrace();// Print the stack trace in case of an IOException.
        }
    }

    // Constructor for CSVDataProcessor
    public CSVDataProcessor(String inputFilePath, String outputDirectory) {
        this.inputFilePath = inputFilePath;
        this.outputDirectory = outputDirectory;
    }


    public void processCSV() throws IOException {
        Map<String, List<String>> dataByStatisticLabel = new HashMap<>();
    
        try (BufferedReader br = new BufferedReader(new FileReader(inputFilePath))) {
            String header = br.readLine(); // Reads the first line as the header.
            String line;
    
            // Loop through each line in the CSV file starting from the second line.
            while ((line = br.readLine()) != null) {
                // Assuming the line should be processed and contains at least one comma.
                if (line.contains(",")) {
                    String[] values = line.split(",", -1); // Split the line into values.
                    String statisticLabel = values[0].trim();
    
                    // Check if the second value matches the pattern 'YYYYMdd'.
                    if (values[1].trim().matches("\\d{4}M\\d{2}")) {
                        String monthYear = reformatMonthYear(values[1].trim());
                        // Use the reformatted monthYear as needed, for example:
                        // Assuming the monthYear is supposed to replace the original value in the output.
                        values[1] = monthYear;
                    }
    
                    // The rest of your line processing here...
                    // For instance, updating the last value if it's empty:
                    String value = values[values.length - 1].trim().isEmpty() ? "0" : values[values.length - 1].trim();
                    values[values.length - 1] = value;
    
                    String newLine = String.join(",", values);// Join the values into a new line for output.                
                    dataByStatisticLabel.computeIfAbsent(statisticLabel, k -> new ArrayList<>()).add(newLine);// Add the new line to the list in the map corresponding to the statistic label.
                }
            }
    
            // Writes the processed data into separate files for each statistic label.
            for (Map.Entry<String, List<String>> entry : dataByStatisticLabel.entrySet()) {
                writeDataToFile(entry.getKey(), header, entry.getValue());
            }
        }
    }
    
    private String reformatMonthYear(String monthYear) {
        String year = monthYear.substring(0, 4);
        String month = monthYear.substring(5);
        return month + "/" + year;
    }
    
    private void writeDataToFile(String statisticLabel, String header, List<String> data) throws IOException {
        String sanitizedLabel = sanitizeFileName(statisticLabel);
        File file = new File(outputDirectory, sanitizedLabel + ".csv");
    
        try (PrintWriter pw = new PrintWriter(file)) {
            pw.println(header); // Write the header first
            for (String line : data) {
                pw.println(line); // Write the data lines
            }
        }
    }
    

    // Utility to sanitize file names
    private String sanitizeFileName(String input) {
        return input.replaceAll("[^a-zA-Z0-9._-]", "_");
    }   
}
