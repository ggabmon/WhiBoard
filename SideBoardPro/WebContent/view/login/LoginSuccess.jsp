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
<c:if test="${not empty AUTH_USER}">
로그인성공!
${AUTH_USER.id}님 환영합니다<br>
${AUTH_USER.name} 가 이름입니다.<br>
${AUTH_USER.toString()}
</c:if>

<hr>
이 메세지만 뜬다면 session 입력이 제대로 안된것<br>
<a href="./view/home.jsp"><button type="button">메인페이지로 이동</button></a>
</body>
</html>