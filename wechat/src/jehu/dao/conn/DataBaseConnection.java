package  jehu.dao.conn;

import java.sql.DriverManager;
import java.sql.Connection;

import static java.lang.Class.*;

public class DataBaseConnection {
	Connection conn = null;
	final String DBURL = "jdbc:mysql://175.24.91.121:3306/wechat?useUnicode=true&characterEncoding=utf8";
	final String DBUSER = "wechat";
	final String DBPASSWORD = "Zxc5585101";
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
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}