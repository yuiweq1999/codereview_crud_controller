<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form id='create' action="/fstop/renew" method="GET">
    更新: ${message}<br>
    ID:<input type="text" name="id" value="${id}" required><br>
    NAME:<input type="text" name="username" value="${username}" required><br>
    Email:<input type="text" name="email" value="${email}"><br>
    Password:<input type="text" name="password" value="${password}"><br>
    <button type="submit" value="yes">確認</button>
</form>
<form action="/fstop/end" method="GET" id="back2">
	<button id="bt" type="submit">返回查詢清單</button>
</form>

</body>
</html>