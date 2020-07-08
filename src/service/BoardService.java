package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import common.Connector;

public class BoardService {
	public List<Map<String, Object>> getBoardList() {
		List<Map<String, Object>> boardList = new ArrayList<>();
		Connection conn = null;
		try {
			conn = Connector.getConnection();
			String sql = " SELECT num,title,credat,creuser FROM BOARD ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Map<String, Object> listMap = new HashMap<>();
				listMap.put("num", rs.getInt("num"));
				listMap.put("title", rs.getString("title"));
				listMap.put("credat", rs.getString("credat"));
				listMap.put("creuser", rs.getString("creuser"));
				boardList.add(listMap);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			Connector.close();
		}
		return boardList;
	}



	public int insertBoard(Map<String, Object> board) {
		String sql = "INSERT INTo board\r\n" + "(num,title,content,credat,cretim,creuser)\r\n" + "VALUES(\r\n"
				+ "(select nvl(max(num),0)+1 from board),\r\n"
				+ "?,?,to_char(sysdate, 'YYYYMMDD'),to_char(sysdate, 'HH24MISS'),?)";
		Connection conn = null;
		try {
			 conn = Connector.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, board.get("title").toString());
			ps.setString(2, board.get("content").toString());
			ps.setString(3, board.get("creuser").toString());
			return ps.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			Connector.close();
		}

		return 0;
	}
	}

