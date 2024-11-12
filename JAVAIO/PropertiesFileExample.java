package JAVAIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileExample {
    public static void main(String[] args) {
        Properties properties = new Properties();
        try (FileInputStream input = new FileInputStream("config.properties")) {
            properties.load(input);
            System.out.println("Database URL: " + properties.getProperty("db.url"));
            System.out.println("Username: " + properties.getProperty("db.username"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
