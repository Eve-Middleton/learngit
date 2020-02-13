package com.t1;

import com.DAO.Ipml.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import static java.sql.DriverManager.getConnection;

public class StudentDAOIpml {
    public List<Student> querryAll() {
        Student stu = null;

        List<Student> stlist = new ArrayList<>();
        String sql = "select * from student";

        String dburl = "jdbc:mysql://localhost:3306/classmate";
        String dbdriver = "com.mysql.jdbc.Driver";
        String dbuser = "root";
        String dbpassword = "root";

        try {
            Class.forName(dbdriver);
            Connection conn = getConnection(dburl,dbuser,dbpassword);
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next() == true) {
                int sid = rs.getInt(1);
                String sname = rs.getString(2);
                int sage = rs.getInt(3);
                double stotal = rs.getDouble(4);
                stu=new Student();
                stu.setId(sid);
                stu.setName(sname);
                stu.setAge(sage);
                stu.setTotal(stotal);
                stlist.add(stu);
            }
            rs.close();
            conn.close();
            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return stlist;
    }
}