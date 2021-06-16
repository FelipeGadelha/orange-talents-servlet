<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:url value="/list-enterprises" var="linkServletListEnterprise"/>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
		<link rel="stylesheet" href="list-enterprise.style.css" />
	</head>
	<body>
		Bem vindo no curso Servlets da Alura! <br/><br/>
		<a href="${ linkServletListEnterprise }"><button class="btn btn-add">lista de empresas</button></a>
	</body>
</html>