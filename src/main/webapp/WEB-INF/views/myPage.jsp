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

아이디 :  ${empVo.id }<br/>
이름 : ${empVo.name }<br/>
비밀번호  : ${empVo.pw }<br/>
이메일 : ${empVo.email }
</body>
</html>