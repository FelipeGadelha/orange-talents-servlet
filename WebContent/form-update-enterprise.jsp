<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>


<c:url value="/update-enterprise" var="linkServletNewEnterprise"/>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
		<link rel="stylesheet" href="style.css" />
	</head>
	<body>
	
		<form action="${ linkServletNewEnterprise }" method="post">
		
			Id<br/><input type="text" name="id" value="${ enterprise.id }" readonly="readonly"><br/><br/>
			Nome <br/><input type="text" name="name" value="${ enterprise.name }" /><br/><br/>
			Data Abertura <br/><input type="text" name="date"  value="<fmt:formatDate value="${ enterprise.openingDate }" pattern="dd/MM/yyyy"/>" /><br/><br/>
			<input type="submit" class="btn btn-add"/>
		</form>
	
	</body>
</html>