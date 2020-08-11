<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<div class="container">
		<P>인덱스 페이지 입니다.</P>
		
		<ul>
			<li><a href="member/list.do">회원 목록 보기</a></li>
			<li><a href="todo/list.do">할일 목록 보기</a></li>
			<li><a href="json1.do">json 처리</a></li>
			<li><a href="json2.do">json 처리2</a></li>
			<li><a href="json3.do">json 처리3</a></li>
			<li><a href="json4.do">json 처리4</a></li>
			<li><a href="json5.do">json 처리5</a></li>
			<li><a href="json6.do">json 처리6</a></li>
			<li><a href="json7.do">json 처리7</a></li>
			<li><a href="json8.do">json 처리8</a></li>
			<li><a href="xml01.do">xml 처리1</a></li>
			<li><a href="xml02.do">xml 처리2</a></li>
			<li><a href="xml03.do">xml 처리3</a></li>
			<button id="testBtn">연습 버튼</button>
			<form action="upload.do" method="post" enctype="multipart/form-data">
				<input type="file" name="myFile" />
				<button type="submit">전송</button>
			</form>
		</ul>
	</div>
	<script src="${pageContext.request.contextPath}/js/jquery-3.5.1.min.js"></script>
	<script>
		$("#testBtn").on("click",function() {
			$.ajax({
				url:"json6.do",
				method:"get",
				success: function(data) {
					console.log(data);
				}
			});
		});
	</script>
</body>
</html>
c