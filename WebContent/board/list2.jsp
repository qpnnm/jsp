<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="common.Connector"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String title = request.getParameter("title");
	String content = request.getParameter("content");
	String creuser = request.getParameter("creuser");
	Connection con = Connector.getConnection();
	String sql = " select * from board where 1=1 ";
	if (title != null && !"".equals(title)) {
		sql += " and title like '%'||?||'%' ";
	}
	if (content != null && !"".equals(content)) {
		sql += " and content like '%'||?||'%' ";
	}
	if (creuser != null && !"".equals(creuser)) {
		sql += " and creuser like '%'||?||'%' ";
	}
	PreparedStatement ps = con.prepareStatement(sql);
	int cnt = 1;

	if (title != null && !"".equals(title.trim())) {
		ps.setString(cnt++, title);
	}
	if (content != null && !"".equals(content.trim())) {
		ps.setString(cnt++, content);
	}
	if (creuser != null && !"".equals(creuser.trim())) {
		ps.setString(cnt++, content);
	}

	ResultSet rs = ps.executeQuery();
	%>
	<%=title%>

	<%=content%>

	<%=creuser%>
	<form>
		제목 : <input type="text" name="title"><br> 내용: <input
			type="text" name="content"><br> 작성자 : <input type="text"
			name="creuser"><br>
		<button>검색</button>
	</form>
	<table border="1">
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>내용</th>
			<th>작성일</th>
			<th>작성자</th>

			<%
				while (rs.next()) {
				out.println("<tr>");
				out.println("<td>" + rs.getString("num") + "</td>");
				out.println("<td>" + rs.getString("title") + "</td>");
				out.println("<td>" + rs.getString("content") + "</td>");
				out.println("<td>" + rs.getString("credat") + "</td>");
				out.println("<td>" + rs.getString("creuser") + "</td>");
				out.println("</tr>");
			}
			%>
		
	</table>
</body>
</html>