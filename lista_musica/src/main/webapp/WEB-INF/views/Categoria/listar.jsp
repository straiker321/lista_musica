<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!-- Libreria JSTL core -->    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    

<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>    

<!-- librer�a Security -->
<%@taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listar</title>
</head>
	<link rel="stylesheet"
			href="<c:url value="/resources/css/categoria.css"/>"/>
	<link rel="stylesheet"
			href="<c:url value="/resources/css/styles2.css"/>"/>
<!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">

    <!-- Font-awesome -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" integrity="sha512-iBBXm8fW90+nuLcSKlbmrPcLa0OT92xO1BIsZ+ywDWZCvqsWgccV3gFoRBv0z+8dLJgyAHIhR35VZc2oM/gI1w==" crossorigin="anonymous" referrerpolicy="no-referrer"
    />
			
	
<body>
   <div class="container" style="padding: 20px 0px 20px 0px">
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <div class="container-fluid">
                <a class="navbar-brand" href="<c:url value='/index'/>">Index</a>

                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDarkDropdown" aria-controls="navbarNavDarkDropdown" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
              </button>
                <div class="collapse navbar-collapse" id="navbarNavDarkDropdown">
                    <ul class="navbar-nav">
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" id="navbarDarkDropdownMenuLink" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                <font class="texto" color="white">Categoria</font>
                            </a>
                            <ul class="dropdown-menu dropdown-menu-dark" aria-labelledby="navbarDarkDropdownMenuLink">
                                <li>
                                    <a class="dropdown-item" href="<c:url value='/categoria_registrar'/>">
                                        <font class="texto" color="white">Registrar</font>
                                    </a>
                                </li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </div>
                  <!-- si el usuario est� en sesi�n -->
	<security:authorize access="isAuthenticated()">
	
		<!-- nombre del usuario en sesi�n -->
		<security:authentication property="principal.username" var="username"/> 
	
		<font class="texto" color="white">Bienvenido <b>${username}</b></font> 
		<a href="<c:url value='/logout'/>"><font class="texto" color="white">Logout</font></a>
	</security:authorize>
        </nav>
     </div>
      <div class="container" style="padding: 20px 0px 20px 0px">
	<table>
		<tr>
			<td><b><font class="texto" color="white">ID</font></b></td>
			<td><b><font class="texto" color="white">Descripcion</font></b></td>
		</tr>
		<c:forEach var="categoria" items="${bCategoria}">
			<tr>
				<td><font class="texto" color="white">${categoria.categoriaId}</font></td>
				<td><font class="texto" color="white">${categoria.descripcion}</font></td>
			<td>
				<a href="<c:url value="/categoria_editar/${categoria.categoriaId}"/>"><font class="texto" color="white">Editar</font></a>
				<a href="<c:url value="/categoria_borrar/${categoria.categoriaId}"/>"><font class="texto" color="white">Borrar</font></a>
			</td>
			</tr>
			
		</c:forEach>
	</table>
	<!-- footer -->
    <%@include file="/WEB-INF/views/shared/footer.jsp" %>
	</div>
	 <!-- Optional JavaScript; choose one of the two! -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>
</body>
</html>