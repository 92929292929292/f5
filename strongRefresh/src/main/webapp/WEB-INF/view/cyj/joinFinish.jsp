<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div class="joinFinishAll">
	<form name="joinFinishFrm" action="main.do">
		<table class="table">
		<h3>회원가입완료</h3>
		<caption>회원가입이 완료 되었습니다.</caption>
			<thead>
				<tr>
					<th>가입 정보 확인</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td rowspan="3">등급을 출력</td>
					<td>아이디</td>
				</tr>
				<tr>
					<td>이름</td>
				</tr>
				<tr>
					<td>이메일</td>
				</tr>
			</tbody>
		</table>
		<button type="submit">메인으로 이동</button>
	</form>
</div>

</body>
</html>