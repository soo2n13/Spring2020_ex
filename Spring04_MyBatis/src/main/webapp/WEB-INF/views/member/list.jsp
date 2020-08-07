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
	<div class="container">
		<h1>회원 목록입니다.</h1>
		<a href="insertform.do" class="btn btn-outline-secondary btn-sm">회원목록 추가</a>
		<button type="button" class="btn btn-outline-secondary btn-sm" id="delBtn">삭제</button>
		<table class="table table-hover">
			<thead>
				<tr>
					<td scope="col">번호</td>
					<td scope="col">이름</td>
					<td scope="col">주소</td>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="tmp" items="${list}">
					<tr class="rowBtn update">
						<td>${tmp.num}</td>
						<td>${tmp.name}</td>
						<td>${tmp.addr}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<script src="${pageContext.request.contextPath}/js/jquery-3.5.1.min.js"></script>
	<script>
		$(".rowBtn").on("click",function() {
			var num=$(this).children("td:first").text();
			var status=$(this).attr("class");
			if(status == "rowBtn update") {
				location.href="updateform.do?num="+num;
			}else if(status == "rowBtn Delete") {
				location.href="delete.do?num="+num;
			}
		});
		
		$("#delBtn").on("click",function() {
			var text=$(this).text();
			if(text == "삭제") {
				$(this).text("삭제 취소");
				$(".rowBtn").addClass("Delete").removeClass("update");
			} else {
				$(this).text("삭제");
				$(".rowBtn").addClass("update").removeClass("Delete");
			}
		});
	</script>
</body>
</html>