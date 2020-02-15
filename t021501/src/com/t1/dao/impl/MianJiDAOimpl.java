package com.t1.dao.impl;

import com.t1.dao.MianJiDAO;
import com.t1.dao.conn.DataBaseConnection;
import com.t1.dao.domain.MianJi;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MianJiDAOimpl extends DataBaseConnection implements MianJiDAO {
    final String DBSQL = "select * from mianji where id=?";
    DataBaseConnection dbc = new DataBaseConnection();
    MianJi mj = null;

    public MianJi select(int id) {
        try {
            PreparedStatement pstmt = dbc.getconn().prepareStatement(DBSQL);
            System.out.println("数据库连接操作创建成功！");
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                int sid = rs.getInt(1);
                int schang = rs.getInt(2);
                int skuan = rs.getInt(3);
                mj = new MianJi();
                mj.setId(sid);
                mj.setChang(schang);
                mj.setKuan(skuan);
            }
            rs.close();
            pstmt.close();
            dbc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mj;
    }
}
