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
</head>
<link rel="stylesheet"
			href="<c:url value="/resources/css/styles2.css"/>"/>
<link rel="stylesheet"
				href="<c:url value="/resources/css/fondo2.css"/>"/>
<body>
<section class="form-register">
	<h3>productor_borrar</h3>
	<form:form name="" method="post" modelAttribute="productor">
		Productor ID <form:input type="text" path="productorId" readonly="true"/><br>
		Nombre <form:input type="text" path="nombre" readonly="true"/><br>
		Telefono <form:input type="text" path="telefono" readonly="true"/><br>
		
	<p>¿estas seguro de borrar?</p>
		<button type="submit">si</button>
        <button type="button"
                onclick="location.href='<c:url value="/productor_listar"/>'">Cancelar</button>
	</form:form>
</section>
</body>
</html>