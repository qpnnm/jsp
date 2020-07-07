<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.*"%>
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
		String search = request.getParameter("search");
	String searchStr = request.getParameter("searchStr");
	Connection conn = null;
	conn = Connector.getConnection();
	String sql = "select num, title, cretim, credat, creuser from board ";
	if (search != null && !"".equals(search)) {
		sql += " WHERE ";
		
		if("1".equals(search)){
			sql += " num like '%'||?||'%' ";
		}else if("2".equals(search)){
			sql += " title like '%'||?||'%' ";
		}else if("3".equals(search)){
			sql += " title like '%'||?||'%' ";
		}else if("4".equals(search)){
			sql += " title like '%'||?||'%' ";
			sql += " or content like '%'||?||'%' ";
		}else if("5".equals(search)){
			sql += " creuser like '%'||?||'%' ";	
		}
	}//where + search title like concat ()or content like () 
	PreparedStatement ps = conn.prepareStatement(sql);
	if (search != null && !"".equals(search)) {
		ps.setString(1,searchStr);
		if("4".equals(search)){
			ps.setString(2,searchStr);
		}
	}
	ResultSet rs = ps.executeQuery();
	
	%>
	<form>
		<select name="search">
			<option value="1">번호</option>
			<option value="2">작성일</option>
			<option value="3">제목</option>
			<option value="4">제목+내용</option>
			<option value="5">작성자</option>
		</select> <input type="text" name="searchStr">
		<button>검색</button>
		<table border="1">

			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성일</th>
				<th>작성시간</th>
				<th>작성자</th>
			</tr>
			<%
				while (rs.next()) {
			%>
			<tr>
				<td><%=rs.getInt("num")%></td>
				<td><%=rs.getString("title")%></td>
				<td><%=rs.getString("credat")%></td>
				<td><%=rs.getString("cretim")%></td>
				<td><%=rs.getString("creuser")%></td>

			</tr>
			<%
				}
			Connector.close();
			%>

		</table>
	</form>


</body>
</html>