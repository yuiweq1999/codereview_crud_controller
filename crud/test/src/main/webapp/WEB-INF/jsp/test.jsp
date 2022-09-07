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
	<form id='testform' action="/example/confirm method="POST">
		For Run in JSP:${message }<br>
		<input type='hidden' name='num'>
		<input type='hidden' id='act' name='act' value='add'>
		ID:<input type='text' id='id' name='id'>
		NAME:<input type='text' name='name'><br>
		<button type ="submit" value="提交">送出</button>
		
	</form>
</body>
</html>