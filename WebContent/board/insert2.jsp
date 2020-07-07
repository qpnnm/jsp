<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="common.Connector"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String title = request.getParameter("title");
String content = request.getParameter("content");
String creuser = request.getParameter("creuser");
String sql = "INSERT INTo board\r\n" + "(title,content,credat,cretim,creuser)\r\n" + "VALUES(\r\n"
		+ "(select nvl(max(num),0)+1 from board),\r\n"
		+ "?,?,to_char(sysdate,'YYYYMMDD'),to_char(sysdate,'HH24MISS'),?)";
Connection con = null;
try {
	con = Connector.getConnection();
	PreparedStatement ps = con.prepareStatement(sql);
	ps.setString(1, title);
	ps.setString(2, content);
	ps.setString(3, creuser);
	int result = ps.executeUpdate();
	if (result == 1) {
		out.println("성공이야 인마");
	}
} catch (SQLException e) {
	out.println("에러야 인마 ");
} finally {
	Connector.close();
}
%>



<script>
	location.href = "/board/list.jsp"
</script>