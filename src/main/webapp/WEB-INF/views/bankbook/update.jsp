<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="update.do" method="post">

<h1>이름 수정 페이지</h1>
<br>

<div>
Name <input type="text" name="bookName" value='${requestScope.dto.getBookName()}'>
</div>
<div>
Num <input type="text" name="bookNum" readonly="readonly" value='${requestScope.dto.bookNum}'>
</div>
<div>
Rate <input type="text" name="bookRate" value='${dto.bookRate}'>
</div>
<br>

<button type="submit">수정완료</button>
</form>
</body>

</html>