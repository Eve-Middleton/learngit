package com.t1.DAOPAI;

import com.t1.student.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.t1.DAOPAI.conn.connectionDataBase;

public class StudnetDAOPAI {
    private connectionDataBase dbc = new connectionDataBase();

    public void insert(Student stu) {
        String DBSQL = "insert into student(name,age,total)values(?,?,?)";
        try {
            PreparedStatement pstmt = dbc.getconn().prepareStatement(DBSQL);
            pstmt.setString(1, stu.getName());
            pstmt.setInt(2, stu.getAge());
            pstmt.setDouble(3, stu.getTotal());
            pstmt.executeUpdate();
            pstmt.close();
            dbc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(int id) {
        String DBSQL = "delete from student where id=?";
        try {
            PreparedStatement pstmt = dbc.getconn().prepareStatement(DBSQL);
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            pstmt.close();
            dbc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
