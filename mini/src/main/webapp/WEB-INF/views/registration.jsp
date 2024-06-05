<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	<form action="inputSave" method="POST" enctype="multipart/form-data">
		<table border="1">
			<thead>
				<tr>
					<td colspan='3' class="border">여행지 맛집을 등록하세요</td>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td class="border">가게이름<input type="text" name="name" id="name">
					</td >
					<td class="border">지역명<input type="text" name="zone" id="zone">
					</td>
					<td class="border">작성자 이름<input type="text" name="username" id="username">
					</td>
				</tr>
				<tr>
					<td colspan='3' class="border">한줄소개<input type="text" name="introduction"
						size="20" id="introduction" placeholder="30자 까지 입니다.">
					</td>
				</tr>
				<tr>
					<td class="border">별점<input type="text" name="grade" id="grade"
						placeholder="5점만점">
					</td>

					<td colspan='1' class="border">비밀번호<input type="text" name="pw" id="pw" placeholder="4자리 입니다.">
					</td>
				</tr>
				<tr>
					<td colspan='3'>첨부파일1<input type="file" name="file"><!-- 혼자 사용못하고 enctype="multipart/form-data" 있어야한다 -->
					</td>
					
				</tr>
				<tr>
					<td colspan='3'>첨부파일2<input type="file" name="file"><!-- name 명이 같으면 서버에는 배열로 처리 -->
					</td>
					
				</tr>
			</tbody>
		</table>
		<input type="submit" value="전송" onclick="return add()">
	</form>
	<script>
		function add() {
			var c = document.querySelector('#introduction').value
			var b = [ "바보", "멍청이" ]

			for (var i = 0; i < b.length; i++) {
				var idx = c.indexOf(b[i], idx + 1)
				while (idx != -1) {
					alert("욕이 들어가있습니다")
					return false
				}
			}

			if (document.querySelector("#pw").value == 0) {
				alert("비밀번호를 입력하세요.")
				return false
			}if (document.querySelector("#pw").value.length >4) {
				alert("비밀번호는 4자리 입니다.")
				return false
			}
			if (document.querySelector("#grade").value == 0) {
				alert("별점을 입력하세요.")
				return false
			} else if (document.querySelector("#grade").value > 5) {
				alert("별점은 최대 5점입니다.")
				return false
			}
			if (document.querySelector("#introduction").value == "") {
				alert("한줄소개를 작성하세요.")
				return false
			} else if (document.querySelector("#introduction").value.length > 30) {
				alert("30자 까지입니다.")
				return false
			}
			if (document.querySelector("#username").value == "") {
				alert("작성자 이름을 입력하세요.")
				return false
			}
			if (document.querySelector("#zone").value == "") {
				alert("지역을 입력하세요.")
				return false
			}
			if (document.querySelector("#name").value == "") {
				alert("가게이름을 입력하세요.")
				return false
			}

		}
	</script>
</body>
</html>