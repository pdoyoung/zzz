<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

	<form action="modnosave" method="post" enctype="multipart/form-data">
		<table border="1">
			<thead>
				<tr>
					<td colspan='3'>여행지 맛집 수정</td>
				</tr>
			</thead>
			<tbody>
				<tr>
					<input type="hidden" name="no" value=${foodvo.no} >
					<td >가게이름<input type="text" name="name" value=${foodvo.name} >
					</td>
					<td >지역명<input type="text" name="zone" value=${foodvo.zone}>
					</td>
					<td >작성자 이름<input type="text" name="username"
						value=${foodvo.username}>
					</td>
				</tr>
				<tr>
					<td colspan='3'>한줄소개<input type="text" name="introduction"
						size="40" value="${foodvo.introduction}" id="introduction">
					</td>
				</tr>
				<tr>
					<td colspan='3'>별점<input type="text" name="grade"
						value=${foodvo.grade}>
					</td>
					
				</tr>
				
				<tr><input type="hidden" value=${foodvo.pw}></tr>
			</tbody>
		</table>
		<input type="submit" value="전송" onclick="return modchk('${foodvo.pw}')">
	</form>
	<script>
		function modchk(a) {
			var c = document.querySelector('#introduction').value
			var d = [ "바보", "멍청이" ]

			for (var i = 0; i < d.length; i++) {
				var idx = c.indexOf(d[i], idx + 1)
				while (idx != -1) {
					alert("욕이 들어가있습니다")
					return false
				}
			}

			var b = prompt("비밀번호를 입력하세요.", "pass")
			if (b == a) {
				return confirm("진짜 수정하겠습니까?")
			} else if (b != a) {
				alert("틀렸습니다.")
				return false
			}
		}
	</script>
</body>
</html>