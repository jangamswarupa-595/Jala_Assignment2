package Exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IOExceptionExample {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("nonexistentfile.txt"));
            br.readLine();
        } catch (IOException e) {
            System.out.println("IOException caught");
        }
    }
}
