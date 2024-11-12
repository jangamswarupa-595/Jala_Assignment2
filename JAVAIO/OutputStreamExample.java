package JAVAIO;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamExample {
    public static void main(String[] args) {
        String content = "Hello, this is a test message!";
        try (FileOutputStream output = new FileOutputStream("example.txt")) {
            output.write(content.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
