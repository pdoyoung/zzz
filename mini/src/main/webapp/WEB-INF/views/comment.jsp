<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="commentSave" method="POST">
		<table border="1">
			<thead>
				<tr>
					<td colspan='3'>댓글쓰기</td>
				</tr>
			</thead>
			<tbody>
				<tr>
					<input type="hidden" name="cno" value=${tListitems}>
					<td>이름<input type="text" name="cname" id="cname">
					</td>
					<td colspan='3'>댓글<input type="text" name="text"
						size="80" id="text" placeholder="100자">
					</td>
				</tr>
			</tbody>
		</table>
		<input type="submit" value="등록">
	</form>
</body>
</html>