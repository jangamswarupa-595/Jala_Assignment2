package JAVAIO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamExample {
    public static void main(String[] args) {
        String content = "This is written using BufferedOutputStream!";
        try (BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream("example.txt"))) {
            output.write(content.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
