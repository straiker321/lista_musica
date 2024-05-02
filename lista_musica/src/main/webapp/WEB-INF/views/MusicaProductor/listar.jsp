<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!-- Libreria JSTL core -->    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    

<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listar</title>
</head>
<body>
	<h3>MusicaProductor - Listar</h3>
	<a href="<c:url value='/index'/>">INDEX</a> <br><br>
	<a href="<c:url value='/null'/>">REGISTRAR</a> <br><br>
	<table>
		<tr>
			<td><b>MusicaID</b></td>
			<td><b>ProductorID</b></td>
		</tr>
		<c:forEach var="object" items="${bMusicaProductor}">
			<tr>
				<c:set var="musicaId" value="${object[0]}"/>
				<c:set var="productorId" value="${object[1]}"/>
				
				<td>${musicaId}</td>
				<td>${productorId}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>