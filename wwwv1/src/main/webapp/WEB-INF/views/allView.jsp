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
	<h1>물건관리 페이지</h1>
	<span>전체보기</span>
	<span>등록</span>
	<span>검색</span>

	<table border=1>
		<thead>
			<tr>
				<td>No</td>
				<td>이름</td>
				<td>관리번호</td>
				<td>관리자</td>
				<td>등록일</td>
				<td>수정</td>
				<td>삭제</td>
			</tr>
		</thead>
		<tbody>
			<!-- allListitems 변수명으로 컨트롤러가 전체 글 목록을 보냈다.
			여기서는 변수에 있는 목록을 출력하면 된다 -->
			<!-- 여러개의 객체를 출력할때는 반복문이 필요하다.
			현재 뷰 파일은 jsp 입니다. jsp파일은 반복문을 제공합니다 foreach -->
			<c:forEach items="${allListitems }" var="goodsvo">
				<tr>
					<td>${goodsvo.no }</td>
					<td>${goodsvo.name}</td>
					<td>${goodsvo.gg_num}</td>
					<td>${goodsvo.username}</td>
					<td>${goodsvo.in_date}</td>
					<td>수정</td>
					<td>삭제</td>
				</tr>
				
			</c:forEach>
			<tr>
				<td colspan=4 align=center>
					<c:if test="${pagevo.prev }">
						<a href="allList?page=${pagevo.startPage -1 }">[이전페이지그룹]</a>
					</c:if> 
					<c:forEach begin="${pagevo.startPage }" end="${pagevo.endPage }"
						var="idx">
						<a href="allList?page=${idx}"> 
							<c:if
								test="${idx == pagevo.page }">[</c:if> ${idx } <c:if
								test="${idx == pagevo.page }">]</c:if>
						</a>
					</c:forEach> 
					<c:if test="${pagevo.next }">
						<a href="allList?page=${pagevo.endPage +1 }">[다음페이지그룹]</a>
					</c:if></td>
			</tr>
			
		</tbody>
	</table>


</body>
</html>