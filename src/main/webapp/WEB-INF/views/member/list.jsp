<%@page import="java.util.ArrayList"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%-- <% ArrayList<BankMembersDTO> ar = (ArrayList<BankMembersDTO>)request.getAttribute("list"); %>
<!DOCTYPE html> --%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>멤버 리스트 페이지</h1>

	<table>
<%-- 		<thead>
			<tr>
				<th>ID</th>
				<th>NAME</th>
				<th>EMAIL</th>
				<th>PHONE</th>

			</tr>
		</thead>

	
			 <% for(BankMembersDTO bDto : ar) { %>
			<tr>
				<td><%= bDto.getUsername() %></td>
				<td><%= bDto.getName() %></td>
				<td><%= bDto.getEmail() %></td>
				<td><%= bDto.getPassword() %></td>
				<%}%>

			</tr>  --%>
	<tbody>	
	<c:forEach begin="0" end="10" var="i" step="1">
    <h3>${pageScope.i}</h3>
    
    </c:forEach>
    
    <c:forEach items="${requestScope.list}" var="dto">
    <tr>
    <td>${pageScope.dto.userName}</td>
    <td>${pageScope.dto.name}</td>
    <td>${pageScope.dto.email}</td>
    <td>${pageScope.dto.password}</td>
    </tr>
    </c:forEach>
		</tbody>
	</table>
</body>
</html>