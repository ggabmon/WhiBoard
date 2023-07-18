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
<style ></style>
<title>회원 관리 페이지</title>
</head>
<body>
<h2>회원 목록</h2>

<table border="1">
	<thead class="head" style="text-align: center;">
	<tr>
		<td style="width: 150px">아이디</td>
		<td style="width: 150px">이름</td>
		<td style="width: 150px">생일</td>
		<td style="width: 150px">연락처</td>
		<td style="width: 150px">가입일</td>
		<td style="width: 150px">닉네임</td>
		<td style="width: 150px">성별</td>
		<td style="width: 150px">회원관리</td>
	</tr>
	</thead>
	<c:forEach var="user" items="${USER}">
	<tr>
		<td>${user.user_id }</td>
		<td>${user.user_name}</td>
		<td>${user.user_birth }</td>
		<td>${user.user_tlno}</td>
		<td>${user.user_joindate}</td>
		<td>${user.user_nickname }</td>
		<td>
		<c:if test="${user.user_gender=='male'}">남자</c:if> 
		<c:if test="${user.user_gender=='female'}">여자</c:if> 
		<c:if test="${user.user_gender ne 'male' && user.user_gender ne 'female'}">이건뭐임</c:if> 
		</td>
		<td>
		<form action="/admin/deleteMember.do" method="post"><input type="hidden" value="${user.user_id}" name="id">
		<button type="sumbmit">회원삭제</button>
		</form>
		<button type="button">회원수정</button>
		</td>
	</tr>
	</c:forEach>
	<tbody>
	</tbody>
</table>

</body>
</html>