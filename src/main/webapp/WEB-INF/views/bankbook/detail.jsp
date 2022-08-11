<%@page import="com.jw.start.bankbook.BankBookDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% BankBookDTO bankBookDTO = (BankBookDTO)request.getAttribute("dto"); %>
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
<th>SALE</th>
<th>팔아요?</th>
</thead>

<tbody>
<td> <%= bankBookDTO.getBookName() %>
</td>
<td> <%= bankBookDTO.getBookNum() %>
</td>
<td> <%= bankBookDTO.getBookRate() %>
</td>
<td> <%= bankBookDTO.getBookSale() %>
</td>
<td><% if(bankBookDTO.getBookSale()==1){%>
판매중!
<%} else{ %>
안판매중 
<%} %>
</td>

</tbody>


</table>

<!-- 상대 -->
<a href="../member/login">Login</a>
<!-- 절대 -->
<a href="/member/join">join</a>

<a href="./list">back to list</a>

</body>
</html>