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
<form action="/project/login">
<input type="text" name="username" value="${cookie.cookieId.value }"><br/>
<input type="password" name="pass"><br/>
<input type="checkbox" name="rememberId">���̵����ϱ�<br/>
<input type="submit" value="�α���">
<input type="button" onclick="location.href='/project/'" value="Ȩ����">
</form>
<div>
${message }
</div>
</body>
</html>