<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%-- 注意jsp檔要放在webapp底下 --%>
<html>
<head>
<meta charset="UTF-8">
<title>main</title>
</head>
<body>
	<form id='testform' action="/fstop/create" method="POST">
		我想要秀出來:${message}<br>
		<input type='hidden' name='num'>
		<input type='hidden' id='act' name='act' value='add'>
		ID:<input type='text' id='id' name='id' required><br>
		Password:<input type='text' name='password' ><br>
		NAME:<input type='text' name='username' required><br>
		EMIL:<input type='text' name='email' ><br>
		
		<button type ="submit" value="提交">送出</button>
		
	</form>
	<form id='testform' action="/fstop/end" method="POST">
		<button type ="submit" value="查詢">查詢</button>
	</form>
</body>
</html>