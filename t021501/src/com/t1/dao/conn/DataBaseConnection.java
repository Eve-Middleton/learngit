package com.t1.dao.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
    Connection conn ;

    final String DBURL = "jdbc:mysql://localhost:3306/mydb";
    final String DBUSER = "root";
    final String DBPASSWORD = "root";
    final String DBDRIVER = "com.mysql.jdbc.Driver";

    public DataBaseConnection() {
        try {
            Class.forName(DBDRIVER);
            System.out.println("数据库驱动程序对象创建成功！");
            conn = DriverManager.getConnection(DBURL, DBUSER, DBPASSWORD);
            System.out.println("数据库连接对象成功！");
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
