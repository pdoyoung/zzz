<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>여행지 등록</h1>
<a href="/hom">홈으로</a>
	<form action="inputSave" method="POST"><!-- post로 받는거를 get으로 쓴다음에 안된다고 계속 다른거에서 잘못된건지 찾고있었음 짜쯩남 -->
		구분<input type="text" name="region_name"> 
		지역<input type="text" name="region"> 
		등록자이름<input type="text" name="name">
		<input type="submit" value="전송">
	</form>
</body>
</html>