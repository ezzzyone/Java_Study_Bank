<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<form action="home">
<h1>₍₍ ◝(・ω・)◟ ⁾⁾ Index</h1>
<h1>바보 멍청이 똥개 해삼 말미잘</h1>

	
<c:if test="${empty sessionScope.member}">

    <a href="./member/login.do"><h2>Login</h2></a> 
    <a href="./member/join.do"><h2>Join</h2></a> 
    
</c:if>

	<c:if test="${not empty sessionScope.member}">
	<h1>♥${sessionScope.member.userName}님♥ 환영합니다!</h1>
	<a href="#"><h2>My page</h2></a>
	<a href="./member/logout.do"><h2>Logout</h2></a>

	<a href="../bankbook/list.do"><h2>List</h2></a>
	<a href="../bankbook/add.do"><h2>Add</h2></a>
	
	</c:if>

	</form>
	<img src="../resources/img/action.jpg">

</body>

</html>
