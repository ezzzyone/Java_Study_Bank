<%@page import="java.util.ArrayList"%>
<%@page import="com.jw.start.member.BankMembersDTO"%>
<%@page import="com.jw.start.member.BankMembersDAO"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<% ArrayList<BankMembersDTO> ar = (ArrayList<BankMembersDTO>)request.getAttribute("list"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>멤버 리스트 페이지</h1>

	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>NAME</th>
				<th>EMAIL</th>
				<th>PHONE</th>

			</tr>
		</thead>

		<tbody>
			<% for(BankMembersDTO bDto : ar) { %>
			<tr>
				<td><%= bDto.getUsername() %></td>
				<td><%= bDto.getName() %></td>
				<td><%= bDto.getEmail() %></td>
				<td><%= bDto.getPassword() %></td>
				<%}%>

			</tr>
		</tbody>
	</table>
</body>
</html>