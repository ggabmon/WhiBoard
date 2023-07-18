<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
<meta charset="UTF-8">
<script>
$(document).ready(function(){
	$("#logoutBtn").on("click", function(){
		location.href="/logout.do";
	});
});
</script>
<title>B팀 연습 메인페이지</title>
</head>
<body>
<h2>게시판 제작을 시작해볼까</h2>
<c:if test="${AUTH_USER.id eq 'admin'}">
<a href="./admin/AdminMain.jsp" style="font-size: xx-large;">관리자메뉴</a><br><br>
</c:if>
<c:if test="${! empty AUTH_USER}">
<fieldset style="width: 400px;"><legend>로그인 회원 전용 메뉴(구현완료)</legend>
아이디  ${AUTH_USER.id} <br>
 ${AUTH_USER.name}님의 로그인을 환영합니다. <br>
<button type="button" id="logoutBtn">logout(구현완료)</button>
</fieldset>
</c:if>

<c:if test="${empty AUTH_USER}">
	<a href="./login/LoginForm.jsp">로그인(구현완료)</a><br><br>
	<a href="./join/JoinForm.jsp">회원가입(구현완료)</a><br><br>
</c:if>

<hr>
<h1></h1>
<form action="/article/showAriticle.do"><button type="submit">게시판으로</button> </form>

</body>
</html>