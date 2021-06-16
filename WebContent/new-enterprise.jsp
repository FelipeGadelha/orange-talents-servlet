<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${not empty enterprise }">
			Empresa ${ enterprise } cadastrada com sucesso!
		</c:if>

	<c:if test="${ empty enterprise }">
			Nenhuma empresa cadastrada!
		</c:if>

</body>
</html>