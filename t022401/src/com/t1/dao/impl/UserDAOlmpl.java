package com.t1.dao.impl;

import com.t1.dao.conn.DataBaseConnection;
import com.t1.dao.userDAO;
import com.t1.domain.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAOlmpl implements userDAO {

    DataBaseConnection str = new DataBaseConnection();

    public void insertUser(String name, String number, String password) {
        final String dbsql = "insert into message(name,number,password)values(?,?,?)";
        try {
            PreparedStatement pstmt = str.getConn().prepareStatement(dbsql);
            System.out.println("数据库连接成功");
            pstmt.setString(1, name);
            pstmt.setString(2, number);
            pstmt.setString(3, password);
            pstmt.executeUpdate();
            pstmt.close();
            str.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<User> selectUser(String number, String password) {
        User user = null;
        List<User> list = new ArrayList<>();
        final String dbsql = "select * from message where number =? AND PASSWORD =?";
        try {
            PreparedStatement pstmt = str.getConn().prepareStatement(dbsql);
            System.out.println("数据库链接成功");
            pstmt.setString(1, number);
            pstmt.setString(2, password);
            ResultSet rs = pstmt.executeQuery();
            user = new User();
            if (rs.next()) {
                String unumber = rs.getString("number");
                String upassword = rs.getString("password");
                user.setNumber(unumber);
                user.setPassword(upassword);
            }
            System.out.println(user.getNumber() + " " + user.getPassword());
            list.add(user);

            rs.close();
            pstmt.close();
            str.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public boolean delect(String number) {
        String dbsql1 = "select * from message where number=?";
        String dbsql2 = "DELETE FROM message WHERE number=?";
        User user = null;
        try {
            PreparedStatement pstmt = str.getConn().prepareStatement(dbsql1);
            System.out.println("数据库链接成功");
            pstmt.setString(1, number);
            ResultSet rs = pstmt.executeQuery();
            System.out.println("SQL语句发送成功");
            user = new User();
            if (rs.next()) {
                String unumber = rs.getString(2);
                user.setNumber(unumber);
                System.out.println(unumber);
            }

            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        boolean result = false;
        if (user.getNumber() != null) {
            try {
                PreparedStatement pstmt = str.getConn().prepareStatement(dbsql2);
                pstmt.setString(1, number);
                pstmt.executeUpdate();
                result = true;
                pstmt.close();
                str.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return result;
    }

}
