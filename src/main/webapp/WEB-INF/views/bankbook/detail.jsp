<%@page import="com.jw.start.bankbook.BankBookDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<a href="../member/login">Login</a>
<!-- 절대 -->
<a href="/member/join">join</a>
<a href="./update?bookNum=${dto.bookNum}">Update</a>
<a href="./delete?bookNum=${dto.bookNum}">Delete</a>
<a href="./list">back to list</a>

</html>