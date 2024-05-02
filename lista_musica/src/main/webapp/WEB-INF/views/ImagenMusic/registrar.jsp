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
	<h3>Imagen-registrar</h3>
		<form:form name="" method="post" action="/idat/imagen_registrar" enctype="multipart/form-data">
			Seleccione un imagen: <input type="file" name="picture" accept="image/jpeg,image/png"> <br><br>
		
			<button type="submit">Guardar</button>
        	<button type="button"
                	onclick="location.href='<c:url value="/imagen_listar"/>'">Cancelar</button>
		</form:form>
	</section>
</body>
</html>