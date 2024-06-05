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
<h1>등록된 여행지</h1>
<a href="/hom">홈으로</a>
<table border="1">
<thead>
<tr>
<td>번호</td>
<td>구분</td>
<td>장소</td>
<td>등록자 이름</td>
<td>시간</td>
</tr>
</thead>
<tbody>
<c:forEach items="${tListitems }" var="postvo">
<tr>
<td>${postvo.no }</td>
<td>${postvo.region_name }</td>
<td>${postvo.region }</td>
<td>${postvo.name }</td>
<td>${postvo.in_date }</td>
</tr>
</c:forEach>
</tbody>
</table>
</body>
</html>