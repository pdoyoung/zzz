<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
	<h1>물건 등록 서비스</h1>
	<br>가게이름:${foodvo.name }
	<br>지역명:${foodvo.zone }
	<br>작성자:${foodvo.username }
	<br>한줄소개:${foodvo.introduction }
	<br>별점:${foodvo.grade }
	<br>등록일:${foodvo.in_date }
	<br>첨부파일
	<c:forEach items="${attachList }" var="fname">
	<img src="download?filename=${fname}">
	<a href="download?filename=${fname }"> ${fname } </a>
	
	
	</c:forEach>
	
	
</body>
</html>