<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div class="loginAll">
<h2>LOG IN</h2>
	<div class="loginBox">
		
		<h2>Member</h2>
		<form name="joinFrm" action="login.do" method="post">
			<fieldset>
				<legend>회원로그인</legend>
				
					<label for="userId">
					ID *
					<input type="text" id="userId" name="userId">
					</label>
					
					<label for="userPw">
					PASSWORD *
					<input type="password" id="userPw" name="userPw">
					</label>
					
					<button type="submit">Sign in</button>
				
					<ul>
						<li>
						<a href="#">Forgot ID</a>
						/
						<a href="#">PASSWORD</a>
						</li>
						<li>
						<a href="#">create an account</a>
						</li>
					</ul>
					
					<div class="kakaoLogin">
					</div>
					
			</fieldset>
			
		</form>
	
	</div>

</body>
</html>