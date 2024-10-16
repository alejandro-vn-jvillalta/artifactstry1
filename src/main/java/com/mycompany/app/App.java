package com.mycompany.app;

public class App {
    public static void main(String[] args) {
        DatabaseManager dbManager = new DatabaseManager();
        dbManager.connectAndQuery();
    }
}



/* 
public class App {
    public static void main(String[] args) {
        FileHandler fileHandler = new FileHandler();
        String filePath = "example.txt";
        String content = "Hello, this is a complex functionality!";

        try {
            fileHandler.writeToFile(content, filePath);
            String readContent = fileHandler.readFromFile(filePath);
            System.out.println("Content from file: " + readContent);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
 */