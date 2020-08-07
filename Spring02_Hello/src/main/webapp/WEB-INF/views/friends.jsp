<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>views/friends.jsp</title>
</head>
<body>
	<h1>친구 목록</h1>
	
	<table>
		<tr>
			<td>이름 </td>
		</tr>
		<c:forEach var="tmp" items="${names}">
		<tr>
			<td>${tmp}</td>
		</tr>
		</c:forEach>	
	</table>
</body>
</html>