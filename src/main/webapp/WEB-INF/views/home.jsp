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

	
<c:if test="${empty member}">

    <a href="./member/login"><h2>Login</h2></a> 
    <a href="./member/join"><h2>Join</h2></a> 
    
</c:if>

	<c:if test="${not empty member }">
	
	<a href="#"><h2>My page</h2></a>
	<a href="#"><h2>Logout</h2></a>

	<a href="../bankbook/list"><h2>List</h2></a>
	<a href="../bankbook/add"><h2>Add</h2></a>
	
	</c:if>

	</form>
	<img src="../resources/img/action.jpg">

</body>

</html>
