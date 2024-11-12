package JAVAIO;


import java.io.*;

public class ExcelWriteExample {
    public static void main(String[] args) {
        // Data to write (like an Excel spreadsheet)
        String[][] data = {
            {"Name", "Age", "City"},
            {"Alice", "25", "New York"},
            {"Bob", "30", "Los Angeles"},
            {"Charlie", "35", "Chicago"}
        };
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.csv"))) {
            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data[i].length; j++) {
                    writer.write(data[i][j]);
                    if (j < data[i].length - 1) {
                        writer.write(",");
                    }
                }
                writer.newLine();
            }
            
            System.out.println("Data has been written to output.csv successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
