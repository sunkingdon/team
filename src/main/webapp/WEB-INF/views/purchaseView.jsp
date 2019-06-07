<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach var="g" items="${list }">
		구매 번호 ${g.purchaseno }
		등록일${g.regdate } <br>
		제목 ${g.title} <br>
		장르 이름 ${g.genrename } <br>
		-----------------------------------------------------------------------------------------------------<br>
	</c:forEach>
</body>
</html>