<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script>
function checkValue(){
	var nameObj =document.getElementById('name');
	if(nameObj.value.trim().length<2){
		alert('이름은 두글자 이상이어합니다~');ㅣ
		
		nameObj.focus();
		return false;
	}
	var idObj = document.getElementById('id');
	if(idObj.value.trim().length<4){
		alert('아이디는 네글자 이상이어야합니다~');
		return false;
	}
	var pwd = document.getElementById('pwd');
	if(pwd.value.trim().length<6){
		alert('비밀번호는 여섯글자 이상이어야합니다~');
		return false;
	}
	return true;	
}
</script>

<form action= "/member.do" method="post" onsubmit="return checkValue()">
이름 : <input type = "text"  id="name" name = "name"><br>
아이디 :<input type = "text" id="id" name = "id"><br>
비밀번호 : <input type = "password"  id="pwd" name = "pwd"><br>
기타 :<input type = "text" name = "etc"><br>
<button>회원가입</button>
</form>
</body>
</html>