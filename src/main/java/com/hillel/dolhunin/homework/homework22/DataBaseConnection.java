package com.hillel.dolhunin.homework.homework22;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DataBaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/world";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "My.28556";
    private Connection connection;

    public Connection getConnection()  {

        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            throw new RuntimeException();
        }

        return connection;
    }

    public void close() throws SQLException {

        if (connection != null) {
            connection.close();
        }

    }
}
