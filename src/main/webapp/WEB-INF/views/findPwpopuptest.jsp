<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/project/findPw.do">
아름 : <input type="text" name="id"><br/>
이메일 : <input type="text" name="email"><br/>
<button type="submit">확인</button><br/>
<div align="center">${empVo.pw}</div><br/>
${message }
</form>
</body>
</html>