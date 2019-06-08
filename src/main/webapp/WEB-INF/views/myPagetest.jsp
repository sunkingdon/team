<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/project/update.do/">
아이디 : <input type="text" value="${empVo.id }" name="id" readonly="readonly"> <br/>
이름 : ${empVo.name }<br/>
비밀번호  : <input type="text"  value="${empVo.pw }" name="pw"><br/>
이메일 : <input type="text" value="${empVo.email }" name="email"><br/>
생일 : ${empVo.birth }<br/>
<input type="submit" value="수정">
</form>
</body>
</html>