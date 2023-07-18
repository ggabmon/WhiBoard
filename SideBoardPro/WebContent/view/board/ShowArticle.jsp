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
<h2>게시글~</h2>
<table border="1">
	<thead>
	<tr>
		<td>게시글번호</td>
		<td>작성자아이디</td>
		<td style="width:300px;">제목</td>
		<td>작성일</td>
		<td>조회수</td>
	</tr>
	</thead>
	<tbody>
	<c:forEach var="article" items="${ARTICLE}">
	<tr>
		<td>${article.article_no}</td>
		<td>${article.writer_id}</td>
		<td>${article.title}</td>
		<td>${article.regdate}</td>
		<td>${article.read_cnt}</td>
	</tr>
	</c:forEach>
	</tbody>
	<tfoot>
	<tr>
	<td colspan="5">
	페이지 번호	
</td>
	</tr>
	</tfoot>
</table>
<br>
<c:if test="${!empty AUTH_USER }"><form action="" method="post"><button type="submit">글 작성</button></form></c:if>

</body>
</html>