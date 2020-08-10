<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/bootstrap.min.css" />
</head>
<body>

	<div class="container">
		<h1>할일 목록</h1>
		<a href="addForm.do" class="btn btn-outline-secondary float-right">글 작성</a>
		<table class="table table-hover text-center">
			<thead>
				<tr>
					<th>번호</th>
					<th>제목</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="tmp" items="${list}">
					<tr class="rowBtn">
						<td>${tmp.num}</td>
						<td>${tmp.name}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

	<script src="${pageContext.request.contextPath}/js/jquery-3.5.1.min.js"></script>
	<script>
		$(".rowBtn").on("click",function() {
			var num=$(this).children("td:first").text();
			location.href="info.do?num="+num;
		});
	</script>
</body>
</html>