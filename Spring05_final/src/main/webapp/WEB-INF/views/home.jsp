<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
	<title>Home.jsp</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/" />
</head>
<body>
	<div class="container">
		<c:choose>
			<c:when test="${empty id}">
				<a href="${pageContext.request.contextPath}/users/loginform.do">로그인</a>
				<a href="${pageContext.request.contextPath}/users/signup_form.do">회원가입</a>
			</c:when>
		</c:choose>
		<h1>인덱스 페이지 입니다.</h1>
		<p>Spring Framework 동작중..</p>
	</div>
</body>
</html>
