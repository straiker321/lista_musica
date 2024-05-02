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
<title>Registrar</title>
<link rel="stylesheet"
				href="<c:url value="/resources/css/fondo2.css"/>"/>
<link rel="stylesheet"
			href="<c:url value="/resources/css/styles2.css"/>"/>
</head>
<body>
<section class="form-register">
	<h3>musica_registrar</h3>
	<form:form name="" method="post" modelAttribute="musica">
		Nombre <form:input type="text" path="nombre"/><br>
		Genero <form:input type="text" path="genero"/><br>
		Fecha <form:input type="date" path="fecha"/><br>
		total_dias <form:input type="text" path="total_dias"/><br>
	
		Imagen
		<form:select path="imagen.imagenId">
            <form:options items="${bImagen}" itemValue="imagenId" itemLabel="nombre"/>
        </form:select><br>
		
		Categoria
		<form:select path="categoria.categoriaId">
			<form:options items="${bCategoria}" itemValue="categoriaId" itemLabel="descripcion"/>
		</form:select>
		<button type="submit">Guardar</button>
        <button type="button"
                onclick="location.href='<c:url value="/musica_listar"/>'">Cancelar</button>       
	</form:form>		
</section>	
</body>
</html>