package  jehu.dao.impl;

import  jehu.dao.QuestionDao;
import  jehu.dao.conn.DataBaseConnection;
import  jehu.domain.Question;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QuestionDAOImpl implements QuestionDao {

	public List<Question> getSelect(String subject) {

		List<Question> qlist = new ArrayList<Question>();
		DataBaseConnection dbc = new DataBaseConnection();
		String sql = "SELECT * FROM exam WHERE subject like ?";
		Question que = null;
		try {
			PreparedStatement pstmt = dbc.getConn().prepareStatement(sql);
			pstmt.setString(1,  '%'+subject+'%'); // 给占位符赋值
			ResultSet rs = pstmt.executeQuery(); // 执行

			while (rs.next()) {
				String Nsubject = rs.getString("subject");
				String Nkey = rs.getString("key");
				que = new Question();
				que.setSubject(Nsubject);
				que.setKey(Nkey);
				qlist.add(que);
			}
			rs.close();
			pstmt.close();
			dbc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return qlist;

	}
}