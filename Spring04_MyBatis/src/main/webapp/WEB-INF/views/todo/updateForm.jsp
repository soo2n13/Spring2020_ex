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
		<div class="card">
			<div class="card-body">
				<form action="update.do" method="post">
					<input type="hidden" id="num" name="num" value="${dto.num}" />
					<div class="form-group">
						<label for="name">제목</label> <input type="text" id="name"
							name="name" placeholder="제목 입력.."  class="form-control" value="${dto.name}"/>
					</div>
					<div class="form-group">
						<label for="content">내용</label>
						<textarea name="content" id="content" cols="30" rows="10"
							placeholder="내용 입력.." class="form-control">${dto.content}</textarea>
					</div>
					<div class="float-right">
						<button type="submit" class="btn btn-outline-secondary">저장</button>
						<button type="reset" class="btn btn-outline-secondary">취소</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>