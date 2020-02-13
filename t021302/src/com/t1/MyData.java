package com.t1;

import com.t2.*;

import java.sql.*;

public class MyData {
    public student select(int id) {
        student stu = null;

        String sql = "select name,age,total from student where id=?";

        String dburl = "jdbc:mysql://localhost:3306/classmate";
        String dbdriver = "com.mysql.jdbc.Driver";
        String dbuser = "root";
        String dbpassword = "root";

        try {
            Class.forName(dbdriver);
            Connection conn = DriverManager.getConnection(dburl, dbuser, dbpassword);
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);
            System.out.println(sql);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                String sname = rs.getString("name");
                int sage = rs.getInt("age");
                double stotal = rs.getDouble("total");

                stu = new student();
                stu.setName(sname);
                stu.setAge(sage);
                stu.setTotal(stotal);
            }

            pstmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return stu;
    }
}