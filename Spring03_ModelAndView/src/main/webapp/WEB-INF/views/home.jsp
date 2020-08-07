<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<html>
<head>
<title>Home</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css" />
</head>
<body>
	<div class="container">
		<h1>인덱스 페이지 입니다.</h1>
		<ul>
			<li><a href="test/play.html">spring 컨트롤러를 거치지 않는 요청</a></li>
			<li><a href="test/game.jsp">spring 컨트롤러를 거치지 않는 요청2</a></li>
			<li><a href="friends.do">친구 목록</a></li>
			<li><a href="friends2.do">친구 목록</a></li>
			<li><a href="friends3.do">친구 목록</a></li>
			<li><a href="delete.do">친구정보 삭제(redirect 이동)</a></li>
			<li><a href="users/signup_form.do">회원가입</a></li>
		</ul>

		<P>내용</P>
		<c:forEach var="tmp" items="${noticeList}">
			<p>내용:${tmp}</p>
		</c:forEach>
		
	</div>
</body>
</html>
