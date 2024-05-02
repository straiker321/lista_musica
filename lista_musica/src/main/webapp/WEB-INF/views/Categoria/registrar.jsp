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
	<link rel="stylesheet"
				href="<c:url value="/resources/css/fondo2.css"/>"/>
	<link rel="stylesheet"
				href="<c:url value="/resources/css/styles2.css"/>"/>
<title>registrar</title>
</head>
<body>
	<section class="form-register">
	<h3>Categoria-registrar</h3>
		<form:form name="" method="post" modelAttribute="categoria">
			Descripcion: <form:input type="text" path="descripcion"/> <br><br>
			
			<button type="submit">Guardar</button>
        	<button type="button"
                	onclick="location.href='<c:url value="/categoria_listar"/>'">Cancelar</button>
		</form:form>
	</section>
</body>
</html>