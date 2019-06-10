<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
<form action="/project/findPw.do" method="post">
아름 : <input type="text" name="id"><br/>
이메일 : <input type="text" name="email"><br/>
<button type="submit">확인</button><br/>
${message }
<div align="center">${empVo.pw}</div><br/>

</form>
</body>
</html>