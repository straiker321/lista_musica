<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!-- Libreria JSTL core -->    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
    <!-- Libreria Spring Form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>borrar</title>
<link rel="stylesheet"
				href="<c:url value="/resources/css/fondo2.css"/>"/>
<link rel="stylesheet"
			href="<c:url value="/resources/css/styles2.css"/>"/>
</head>
<body>
<section class="form-register">
	<h3>musica_borrar</h3>
	<form:form name="" method="post" modelAttribute="musica">
		Musica ID <form:input type="text" path="musicaId" readonly="true"/><br>
		Nombre <form:input type="text" path="nombre" readonly="true"/><br>
		
	<p>¿estas seguro de borrar?</p>
		<button type="submit">si</button>
        <button type="button"
                onclick="location.href='<c:url value="/musica_listar"/>'">Cancelar</button>
	</form:form>
</section>
</body>
</html>