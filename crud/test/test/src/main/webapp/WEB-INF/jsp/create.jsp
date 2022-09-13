<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create</title>
</head>
<body>
	<form id='form' action="/fstop/end" method="POST" >
		確認新增: ${message}<br>
		<p>ID:</p>
		<p id="ax1">${id}</p>
		<p>NAME:</p>
		<p id="ax2">${username}</p>
		<p>Email:</p>
		<p id="ax3">${email}</p>
		<p>Password:</p>
		<p id="ax4">${password}</p>
		<input type="hidden" name="id" value="${id}">
		<input type="hidden" name="username" value="${username}">
		<input type="hidden" name="email" value="${email}">
		<input type="hidden" name="password" value="${password}">
		<button type="submit" value="yes">確認</button>
	</form>
</body>
</html>