package com.t1.dao.conn;

import java.sql.DriverManager;
import java.sql.Connection;

import static java.lang.Class.*;

public class DataBaseConnection {
    Connection conn = null;
    final String DBURL = "jdbc:mysql://localhost:3306/ydata";
    final String DBUSER = "root";
    final String DBPASSWORD = "root";
    final String DBDRIVER = "com.mysql.jdbc.Driver";

    public DataBaseConnection() {
        try {
            forName(DBDRIVER);
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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
