package com.example.brasilprev.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBase {

    /* Connect Database */
    public static Connection connect() throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/brasilprev","jota","");

    }

    /* Connect Database Test */
    public static void main(String[] args) throws Exception{
        connect();
    }
}
