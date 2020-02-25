package com.t1.dao.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {

    Connection conn = null;
    final String DBURL = "jdbc:mysql://localhost:3306/logon";
    final String DBUSER = "root";
    final String DBPASSWORD = "root";
    final String DBDRIVER = "com.mysql.jdbc.Driver";

    public DataBaseConnection() {
        try {
            Class.forName(DBDRIVER);
            conn = DriverManager.getConnection(DBURL, DBUSER, DBPASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Connection getConn() {
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
