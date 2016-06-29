<%@page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> 
<html>
	<head>
		<title>User</title>
	</head>
	<body>
 			<table border="1">
 				<tr>
					<td>ID</td>
					<td>姓名</td>
					<td>年龄</td>
				</tr>
				<c:forEach items="${listUser}" var="u" >
				<tr>
					<td>${u.id}</td>
					<td>${u.name}</td> 		 
					<td>${u.age}</td>
				</tr>
				</c:forEach>
			</table>
	</body>
</html>