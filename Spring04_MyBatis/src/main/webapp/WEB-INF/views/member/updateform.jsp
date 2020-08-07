<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
		<form action="update.do" method="post">
			<input type="hidden" name="num" value="${dto.num}" />
			<div class="form-group">
				<label for="name">이름</label> 
				<input type="text" id="name" name="name" placeholder="이름 입력.." class="form-control" value="${dto.name}" />
			</div>
			<div class="form-group">
				<label for="addr">주소</label> 
				<input type="text" id="addr" name="addr" placeholder="주소 입력.." class="form-control" value="${dto.addr}" />
			</div>
			<button type="submit" class="btn btn-outline-secondary">전송</button>
		</form>
	</div>
</body>
</html>