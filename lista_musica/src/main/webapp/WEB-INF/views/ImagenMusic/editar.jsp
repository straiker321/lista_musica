<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Editar Imagen</title>
</head>
<link rel="stylesheet"
			href="<c:url value="/resources/css/styles2.css"/>"/>
<link rel="stylesheet"
				href="<c:url value="/resources/css/fondo2.css"/>"/>
<body>
<section class="form-register">
        <h3>EDITAR - IMAGEN!</h3>
        <form:form name="" method="post" modelAttribute="imagen" enctype="multipart/form-data">
                ID IMAGEN: <form:input type="text" path="imagenId" readonly="true"/><br><br>
                Nombre: <form:input type="text" path="nombre" readonly="true"/> <br><br>
                Imagen: <input type="file" name="picture" accept="image/jpeg,image/png"> <br><br>

                <button type="submit">Guardar</button>
                <button type="button"
                        onclick="location.href='<c:url value="/imagen_listar"/>'">Cancelar</button>
         </form:form>
        </section>
    </body>
</html>