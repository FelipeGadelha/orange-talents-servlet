<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, br.com.alura.manager.model.Enterprise"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<c:url value="/update-enterprise" var="linkServletUpdateEnterprise"/>
<c:url value="/remove-enterprise" var="linkServletRemoveEnterprise"/>
<c:url value="/form-new-enterprise.jsp" var="linkServletAddEnterprise"/>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Java Standard Taglib</title>
		<link rel="stylesheet" href="list-enterprise.style.css" />
	</head>
	<body>
		<c:if test="${ not empty enterprise }">
			Empresa ${ enterprise } cadastrada com sucesso!
		</c:if>
		Lista de empresas: <br /><br />
		<a href="${ linkServletAddEnterprise }"><button class="btn btn-add">adicionar</button></a>
		<ul>
			<c:forEach items="${ enterprises }" var="enterprise">
				<li>
					${enterprise.name } - <fmt:formatDate value="${enterprise.openingDate }" pattern="dd/MM/yyyy"/> 
					<a href="${ linkServletUpdateEnterprise }?id=${ enterprise.id }"><button class="btn btn-update">editar</button></a>
					<a href="${ linkServletRemoveEnterprise }?id=${enterprise.id }"><button class="btn btn-remove">remover</button></a>
				</li>
			</c:forEach>
		</ul>
	</body>
</html>

