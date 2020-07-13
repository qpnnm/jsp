<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/board.do" method="get">
		<input type="text" name="name">
		<button>GET전송</button>
	</form>

	<form action="/board.do" method="post">
		<input type="text" name="name">
		<button>POST전송</button>

	</form>
</body>
</html>