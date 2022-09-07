<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- 上面這支也是一定要有才可以用foreach -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>取值完成頁面</title>
</head>
<body>
<form action="/fstop/index" method="GET" id="back">
	確認取值完成: ${message}<br>
	<button id="bt" type="submit">返回建立新帳號</button>
</form>


	<c:forEach var="ax6" items="${list}">
		<div>
			<p>ID :${ax6}</p><br>
		    NAME: ${ax6.username}<br>
		    Email: ${ax6.email}<br>
		    Password:${ax6.password}<br>
			<form action="/fstop/update/${ax6.username}" method="POST">
		 		<button id="update" type="submit">修改資料</button>
			</form>
			<form action="/fstop/delete/${ax6.username}" method="POST">
		 		<button id="delete" type="submit">刪除資料</button>
			</form>
		</div>
	</c:forEach>


	
</body>
</html>