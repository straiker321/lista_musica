<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- librer�a Security -->
<%@taglib prefix="security" uri="http://www.springframework.org/security/tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>access_denied</title>
</head>
<body>
	<div align="center">
		<h3>Error!</h3>
		
		<security:authentication property="principal.username" var="username"/>
		
		<p>Estimado <b>${username}</b>, usted no est� autorizado para acceder a esta p�gina.</p>
		
		<a href="<c:url value='/index1'/>">Index</a> | 
		<a href="<c:url value='/logout'/>">Logout</a>
	</div>
</body>
</html>