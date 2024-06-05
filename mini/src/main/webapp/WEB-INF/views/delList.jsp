<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@page session="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
	crossorigin="anonymous"></script>

<body>
	<header>
		<br> <br> <br>
		<nav class="navbar navbar-expand-lg bg-body-tertiary fixed-top">
			<div class="container-fluid">
				<button class="navbar-toggler" type="button"
					data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
					aria-controls="navbarSupportedContent" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarSupportedContent">
					<ul class="navbar-nav me-auto mb-2 mb-lg-0">
						<li class="nav-item"><a class="navbar-brand " href="/hom">
								맛집이 좋아
						</a></li>
						<li class="nav-item"><a class="nav-link" href="input">등록</a>
						</li>
						<li class="nav-item"><a class="nav-link" href="modList">수정</a>
						<li class="nav-item"><a class="nav-link" href="delList">삭제</a>
						<li class="nav-item"><a class="nav-link" href="tList">전체보기</a>
						</li>
					</ul>
				</div>
			</div>
		</nav>
	</header>
<body>
	<h1>여행지 맛집 추천 삭제</h1>
	<div>
		<c:if test="${userid!=null }">
		<span>사용자 정보: ${userid } / ${username } / ${ grade}</span>
		<span><a href="logout">로그아웃</a></span>
		</c:if>
	</div>
	<table border="1">
		<tbody>
			<c:forEach items="${tListitems }" var="foodvo">
				<tr>
					<td class="border">등록순서</td>
					<td class="border">가게이름</td>
					<td class="border">지역명</td>
					<td class="border">작성자 이름</td>
					<td rowspan="6" class="border"><a href="delno?no=${foodvo.no }"
						onclick="return modchk('${foodvo.pw}')">삭제</a></td>
				</tr>
				<tr>
					<td class="border">${foodvo.no }</td>
					<td class="border">${foodvo.name }</td>
					<td class="border">${foodvo.zone }</td>
					<td class="border">${foodvo.username }</td>
				</tr>
				<tr>
					<td colspan='4' class="border">한줄소개</td>
				</tr>
				<tr>
					<td colspan='4' class="border">${foodvo.introduction }</td>
				</tr>
				<tr>
					<td colspan='4' class="border">별점</td>
				</tr>
				<tr>
					<td colspan='4' class="border">${foodvo.grade }</td>
				</tr>
			</c:forEach>
			<script>
				function modchk(a) {

					var b = prompt("비밀번호를 입력하세요.", "pass")
					if (b == a) {

						return confirm("진짜 삭제하겠습니까?")
					} else if (b != a) {
						alert("틀렸습니다.")
						return false
					}
				}
			</script>
		</tbody>
	</table>
</body>
</html>