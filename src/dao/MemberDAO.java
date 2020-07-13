package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import common.Connector;

public class MemberDAO {
	public int insertMember(Map<String, String> map) {
		Connection conn = Connector.getConnection();
		String sql = " insert into member(NUM,NAME,ID,PWD,JOINDATE,ETC)\r\n"
				+ "values(SEQ_NEW_TABLE_NUM.nextval,?,?,?,sysdate,?) ";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, map.get("name"));
			ps.setString(2, map.get("id"));
			ps.setString(3, map.get("pwd"));
			ps.setString(4, map.get("etc"));
			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Connector.close();
		}
		System.out.println(map);
		return 0;
	}
}
