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
<%-- 	<c:forEach var="g" items="${list }"> --%>
<%-- 		제목 ${g.title} <br> --%>
<%-- 		설명 ${g.info } <br> --%>
<%-- 		가격 ${g.price } <br> --%>
<%-- 		등록일${g.regdate } <br> --%>
<%-- 		장르 번호 ${g.genreno } <br> --%>
<%-- 		이미지 번호${g.imgno } <br> --%>
<!-- 		-----------------------------------------------------------------------------------------------------<br> -->
<%-- 	</c:forEach> --%>
	<form action="categorylist.do">
		1.액션 2.리듬 3.어드벤쳐<br>
		<input name="genreno" type="number">
		<input type="submit">
	</form>
</body>
</html>