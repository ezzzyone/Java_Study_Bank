<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
</head>
<body>
 <!-- header import -->
 <c:import url="../template/header.jsp"></c:import>
    <h1>Login Page(´▽`ʃ♡ƪ)</h1>

<form action="./login.do" method = "POST">
<div class = "container">
<hr>
I D <input type="text" name ="userName" placeholder="아이디" value='jw1'><br>
PW <input type="password" name ="password" placeholder="비밀번호" value='wldnjs'> <input type="submit" value="로그인">

</div>
<hr>
<input type="button" value="아이디 찾기"> <input type="button" value="비밀번호 찾기"> <a href="join.do">회원가입</a>
<br> <br>

</form>
    <img src="../resources/img/login.jpg">
</body>
 <!-- footer import -->
  <c:import url="../template/footer.jsp"></c:import>
</html>