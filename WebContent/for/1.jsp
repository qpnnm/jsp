<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ include file="/for/common.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	1.jsp
	<br>
	<%=str%>
	<!-- 나는 html 주석입니다. -->
	<%
		//<%@  <-- Directive( 설명서  import page  . . . )
	//<%  <-- Scriptlet ( 실행부 ) 
	//<%=  <-- Expression( 표현식 )
	//<%!  <-- Declaration( 선언부 ) 메소드 정의가능하지만 실행할 수는 없다 .실행하려면 실행부에서 ..!
	//나는 java 한줄 주석입니다.
	/* 
	나는 자바
	여러줄 주석입니다.
	*/
	%>


</body>
</html>