<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form id='update' action="/fstop/update" method="POST">
    更新: ${message}<br>
    ID:<input type="text" name="Id" value="${Id}" required><br>
    NAME:<input type="text" name="username" value="${username}" required><br>
    Email:<input type="text" name="email" value="${email}"><br>
    Password:<input type="text" name="password" value="${password}"><br>
    <button type="submit" value="yes">確認</button>
</form>

</body>
</html>