package JAVAIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args) {
        String content = "Writing this line using BufferedWriter.";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("example.txt"))) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
