<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%--     <% //스크립틀릿: 자바코드쓰는
    ArrayList<BankBookDTO> ar = (ArrayList<BankBookDTO>)request.getAttribute("list");
    %> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>통장 리스트 [^._.^]ﾉ彡</h1>
<!-- /bankbook/list -->

<table border ="1">
    <thead>
    <th>통장이름</th>
     
    </thead>

    <tbody>
<%--       <% for(BankBookDTO bankBookDTO : ar) {%>
     <tr>
            <td><a href="./detail?bookNum=<%=bankBookDTO.getBookNum() %>" ><%= bankBookDTO.getBookName() %></a></td>
            <!--  <td><%= bankBookDTO.getBookRate()  %></td>-->
        </tr>
    <%} %>  --%>
    
<%--     <c:forEach begin="0" end="10" var="i">
    <h3>${i}</h3>
    
    </c:forEach> --%>
    
    <c:forEach items="${requestScope.list}" var="dto"> 
    
    <tr>
    <td><a href="./detail.do?bookNum=${pageScope.dto.bookNum}">${pageScope.dto.bookName}</a></td>
    <td>${pageScope.dto.bookRate}</td>
    </tr>
    
    
     </c:forEach>
    

    </tbody>

    <tfoot>
          <tr>
            <td>클릭하면이동</td>
          </tr> 
        
     </tfoot>
    </table>
<a href="./add.do">상품등록 </a> 
</body>
</html>