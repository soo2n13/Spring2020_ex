<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css" />
</head>
<body>
	<div class="container">
		<div class="card">
			<div class="card-body">
				<input type="hidden" id="num" value="${dto.num}"/>
				<div class="float-right">
					<button id="updateBtn" class="btn btn-outline-secondary">수정</button>
					<button id="deleteBtn" class="btn btn-outline-secondary">삭제</button>
				</div>
				<h5 class="card-title">${dto.num}. ${dto.name}</h5>
  				<p class="card-text">${dto.content}</p>
			</div>
		</div>
	</div>
	<script src="${pageContext.request.contextPath}/js/jquery-3.5.1.min.js"></script>
	<script>
		var num=$("#num").val();
		
		$("#updateBtn").on("click",function() {
			location.href="updateForm.do?num="+num;
		});
		$("#deleteBtn").on("click",function() {
			location.href="delete.do?num="+num;
		});
	</script>
</body>
</html>