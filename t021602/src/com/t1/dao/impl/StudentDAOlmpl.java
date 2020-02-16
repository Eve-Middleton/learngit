package com.t1.dao.impl;

import com.t1.dao.StudentDAO;
import com.t1.dao.conn.DataBaseConnection;
import com.t1.domain.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDAOlmpl extends DataBaseConnection implements StudentDAO {

    public List<Student> queryBanHao(String banhao) {
        List<Student> slist = new ArrayList<>();
        Student stu = null;
        final String dbsql = "select * from student where banhao=?";
        DataBaseConnection dbc = new DataBaseConnection();
        try {
            PreparedStatement pstmt = dbc.getConn().prepareStatement(dbsql);
            pstmt.setString(1, banhao);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                String rsbanhao = rs.getString(1);
                String rsname = rs.getString(2);
                double rsscore = rs.getDouble(3);

                stu = new Student();
                stu.setBanhao(rsbanhao);
                stu.setName(rsname);
                stu.setScore(rsscore);
                slist.add(stu);
            }
            rs.close();
            pstmt.close();
            dbc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return slist;

    }

    public int CountPeople(String banhao) {
        int count = 0;
        Student stu = null;
        final String dbsql = "select count(*) from student where banhao=?";
        DataBaseConnection dbc = new DataBaseConnection();
        try {
            PreparedStatement pstmt = dbc.getConn().prepareStatement(dbsql);
            pstmt.setString(1, banhao);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                count = rs.getInt(1);
            }
            rs.close();
            pstmt.close();
            dbc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }
}
