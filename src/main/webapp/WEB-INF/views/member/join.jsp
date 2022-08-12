<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>setJoin</title>
</head>
<body>


<form action="join.do" method="POST">
<h1>✿회원가입✿( ღ'ᴗ'ღ )</h1>

<hr>

<div>
아이디 <input type="text" name=username> <input type="button" value="중복확인"><br>
비밀번호 <input type="password" name="password"> <input type="button" value="비밀번호 확인"><br>
</div>

<div>
    <br>
    이름 <input type="text" name="name"><br>
    번호 <input type="number" name="phone"><br>
    이메일 <input type="email" name="email"><br>
<br>

    개인정보 이용 동의 <input type="checkbox" name="agree"><br>

</div>

<div>
    <hr>
    <input type="button" value="작성취소">
    <input type="submit" value="회원가입">
</div>
</form>
    <br>
<img src ="../resources/img/join.jpg">
</body>
</html>