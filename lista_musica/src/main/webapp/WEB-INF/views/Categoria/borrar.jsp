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
			href="<c:url value="/resources/css/styles2.css"/>"/>
			<link rel="stylesheet"
				href="<c:url value="/resources/css/fondo2.css"/>"/>
</head>
<body>
	<section class="form-register">
	<h3>Categoria_borrar</h3>
	<form:form name="" method="post" modelAttribute="categoria">
		categoria ID <form:input type="text" path="categoriaId" readonly="true"/><br>
		Descripcion <form:input type="text" path="descripcion" readonly="true"/><br>
		
	<p>¿estas seguro de borrar?</p>
		<button type="submit">si</button>
        <button type="button"
                onclick="location.href='<c:url value="/categoria_listar"/>'">Cancelar</button>
	</form:form>
	</section>
</body>
</html>