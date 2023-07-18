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
<title>Insert title here</title>
</head>
<body>


<form action="/login.do" method="post">
<fieldset style="width: 400px;">
<legend>더 많은 기능을 사용하세요</legend>
<table>
<thead>
<tr><td colspan="2">로그인 정보 입력</td></tr>
</thead>
<tbody>
<tr><td>아이디</td><td><input type="text" name="loginId"></td></tr>
<tr><td>비밀번호</td><td><input type="password" name="loginPw"></td></tr>
</tbody>
</table>
<hr>
<button type="submit">로그인하기</button>
</fieldset>
</form>
</body>
</html>