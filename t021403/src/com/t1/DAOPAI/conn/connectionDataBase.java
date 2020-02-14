package com.t1.DAOPAI.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectionDataBase {
    private Connection conn;
    final String DBDRIVER = "com.mysql.jdbc.Driver";
    final String DBURL = "jdbc:mysql://localhost:3306/classmate";
    final String DBUSER = "root";
    final String DBPASSWORD = "root";

    public connectionDataBase() {
        try {
            Class.forName(DBDRIVER);
            conn = DriverManager.getConnection(DBURL, DBUSER, DBPASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Connection getconn() {
        return conn;
    }

    public void close() {
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}