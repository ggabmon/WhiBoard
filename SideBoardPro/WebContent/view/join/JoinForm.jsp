<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
<meta charset="UTF-8">
<script>

</script>
<title>회원 가입</title>
</head>
<body>
<h2>회원가입 페이지</h2>
<form action="/join.do" method="post"><br>
<fieldset style="width: 400px;">
<legend>정보입력</legend>
<table>
<thead></thead>
<tr><td>아이디</td><td><input type="text" name="id"></td></tr>
<tr><td>비밀번호</td><td><input type="password" name="pw"></td></tr>
<tr><td>비밀번호확인</td><td><input type="password" name="pwcon"></td></tr>
<tr><td>이름</td><td><input type="text" name="name"></td></tr>
<tr><td>생일</td><td><input type="date" name="birthdate"></td></tr>
<tr><td>핸드폰번호</td><td><input type="text" name="tlno"></td></tr>
<tr><td>닉네임</td><td><input type="text" name="nickname"></td></tr>
<tr><td>성별</td><td>남자<input type="radio" name="gender" value="male">
여자<input type="radio" name="gender" value="female"></td></tr>
</table>
<hr>
<button type="submit">회원가입하기</button> <button type="reset">다시 입력하기</button>
</fieldset>
</form>

</body>
</html>