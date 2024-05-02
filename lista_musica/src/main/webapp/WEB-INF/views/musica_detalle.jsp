<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!-- Libreria JSTL core -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>detalle</title>
<link rel="stylesheet"
				href="<c:url value="/resources/css/fondo2.css"/>"/>
<link rel="stylesheet"
			href="<c:url value="/resources/css/styles2.css"/>"/>
</head>
<body>
<section class="form-register">
	<h3>detalle</h3>

	<b>ID</b> ${musica.musicaId} <br>
	<b>Nombre</b> ${musica.nombre} <br>
	<b>Genero</b> ${musica.genero} <br>
	<b>Fecha</b> ${musica.fecha} <br>
	<b>Total_dias</b> ${musica.total_dias} <br><br>
	
		<button type="button"
				onclick="location.href='<c:url value="/musica_listar"/>'">volver</button>	
</section>				
</body>
</html>