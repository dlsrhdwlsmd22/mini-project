<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<title>Home</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<meta charset="UTF-8">
<title>레시피</title>
<script>
    $(function(){
        $("dt_table").DataTable();
    });
</script>
</head>
<body>

<h5>레시피 리스트</h5>
	<div style="width:600px; margin:0 auto; margin-top:10px">
	<table id="dt_table" class="table table-bordered">
        <thead>
            <tr>
            	<th>아이디</th>
            	<th>이름</th>
            </tr>
        </thead>
        <tbody>
        	<c:forEach var="tmp" items="${list}">
            	<tr>
            		<td>${tmp.RNAME}</td>
            		<td>${tmp.RITEM}</td>
            	</tr>
            </c:forEach>
        </tbody>
    </table>
    </div>
<%-- <table border="1">
<tr>
	<th>이름</th>
	<!-- <th>이미지</th> -->
	<th>재료</th>
	<th>설명</th>
	<th>조회수</th>			
</tr>		
<c:forEach var="rvo" items="${list}">
<tr>
	<td>

	
	</td>
	<td>${rvo.rname}</td>
	<td><img src="memberimg.do?id=${rvo.rimage}" width="50px" height="50px" /></td>
	<td>${rvo.ritem}</td>
	<td>${rvo.rcontent}</td>
	<td>${rvo.rhit}</td>	
</tr>
</c:forEach>
</table> --%>
</body>
</html>