package com.mycompany.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseManager {
    public void connectAndQuery() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "nueva_contraseña");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM users");

            while (resultSet.next()) {
                System.out.println("User: " + resultSet.getString("username"));
            }

            connection.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


