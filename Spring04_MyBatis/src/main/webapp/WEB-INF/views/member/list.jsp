<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<h1>회원 목록입니다.</h1>
		<table>
			<thead>
				<tr>
					<td>번호</td>
					<td>이름</td>
					<td>주소</td>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="tmp" items="${list}">
					<tr>
						<td>${tmp.num}</td>
						<td>${tmp.name}</td>
						<td>${tmp.addr}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>