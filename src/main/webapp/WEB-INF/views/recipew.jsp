<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>레시피 입력</title>
</head>
<body>
	<form action="recipew.do" method="post" enctype="multipart/form-data">
		아이디 : <input type="text" name="rname"><br />		
		이름 : <input type="text" name="ritem" /><br />
		나이 : <input type="text" name="rcontent" /><br />
		이미지 : <input type="file" name="rimage1" /><br />
		<input type="submit" value="등록" />
	</form>
</body>
</html>