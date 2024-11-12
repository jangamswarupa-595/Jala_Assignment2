package JAVAIO;


import java.io.*;

public class ExcelReadExample {
    public static void main(String[] args) {
        String filePath = "C:/Users/JALA Academy2/JAVAIO/data.csv";
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] columns = line.split(",");
                for (String column : columns) {
                    System.out.print(column + "\t");  
                }
                System.out.println();  
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}