<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/new-enterprise" var="linkServletNewEnterprise"/>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
		<link rel="stylesheet" href="style.css" />
	</head>
	<body>
	
		<form action="${ linkServletNewEnterprise }" method="post">
		
			Nome <br/><input type="text" name="name"  /><br/><br/>
			Data Abertura <br/><input type="text" name="date"  /><br/><br/>
			<input type="submit" class="btn btn-add"/>
		</form>
	
	</body>
</html>