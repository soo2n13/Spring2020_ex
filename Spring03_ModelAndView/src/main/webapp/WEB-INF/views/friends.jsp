<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css" />
</head>
<body>
	<h1>친구목록</h1>
	<ul class="list-group">
		<c:forEach var="tmp" items="${friendList}">
			<li>${tmp}</li>
		</c:forEach>
	</ul>
</body>
</html>