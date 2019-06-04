<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form action="/project/login" method="post">
<input type="text" name="id"><br/>
<input type="password" name="pw"><br/>
<input type="submit" value="로그인">
<input type="button" onclick="location.href='/project/'" value="홈으로">
</form>
<div>
${message }
</div>
</body>
</html>