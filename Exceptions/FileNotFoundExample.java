package Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileNotFoundExample {
    public static void main(String[] args) {
        try {
            File file = new File("nonexistentfile.txt");
            FileInputStream fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException caught");
        }
    }
}
