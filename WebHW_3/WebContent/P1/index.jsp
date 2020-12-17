<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html> 
<head> 
<meta charset="UTF-8"> 
<title>회원가입 하기</title> 
</head> 
<body>
<div align="center">
<H2>회원가입</H2>
<HR>
	<form action="userJoinAction.jsp" method="post"> 
	아이디 : <input type="text" name="userID"> 
	비밀번호 :<input type="password" name="userPassword"> 
	성별 :<input type="text" name="userSex"> 
	<input type="submit" value="회원등록"> 
	</form> 
<HR> 
</div>
</body> 
</html>
