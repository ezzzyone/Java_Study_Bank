<%@page import="com.jw.start.bankbook.BankBookDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--     <% BankBookDTO bankBookDTO = (BankBookDTO)request.getAttribute("dto"); %> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>통장 상세정보!๑°⌓°๑</h1>


<table border="1">
<thead>

<th>NAME</th>
<th>NUM</th>
<th>RATE</th>

</thead>

<tbody>
<td>${requestScope.dto.getBookName()}</td>
<td>${requestScope.dto.bookNum}</td>
<td>${dto.bookRate}</td>




</tbody>


</table>


</body>
<br>
<img src="../resources/img/fool.jpg"> <br>

<c:if test="${empty sessionScope.member}">
<a href="../member/login.do">Login</a>
<!-- 절대 -->
<a href="/member/join.do">join</a>

</c:if>
<a href="./update.do?bookNum=${dto.bookNum}">Update</a>
<a href="./delete.do?bookNum=${dto.bookNum}">Delete</a>
<c:if test="${not empty sessionScope.member}">
<a href="../bankAccount/add.do?bookNum=${dto.bookNum}">가입하기</a>
</c:if>
<a href="./list.do">back to list</a>

</html>