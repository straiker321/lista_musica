<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!-- Libreria JSTL core -->    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>index</title>
</head>
		<link rel="stylesheet"
			href="<c:url value="/resources/css/estilos.css"/>"/>
		<link rel="stylesheet"
			href="<c:url value="/resources/css/fontello.css"/>"/>	
		<link rel="stylesheet"
			href="<c:url value="/resources/css/fondo.css"/>"/>
			<!-- librería Security -->
<%@taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
		
		<!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">

    <!-- Font-awesome -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" integrity="sha512-iBBXm8fW90+nuLcSKlbmrPcLa0OT92xO1BIsZ+ywDWZCvqsWgccV3gFoRBv0z+8dLJgyAHIhR35VZc2oM/gI1w==" crossorigin="anonymous" referrerpolicy="no-referrer"
    />
	
<body>
<!--<audio src="audio/Bon Jovi - Livin On A Prayer.mp3" controls="controls"></audio>-->

 <header class="header">
        <div class="container">
            <div class="btn-menu">
                <label for="btn-menu" class="icon-menu"></label>
            </div>
            <div class="logo">
            </div>
            <nav class="menu">
            <a href="#">Inicio</a>
					<a href="#">Nosotros</a>
					<a href="#">Blog</a>
					
					<a href="<c:url value='/index1'/>">
                    	<font class="texto" color="white">login</font>
                </a>
                   <!-- si el usuario está en sesión -->
	<security:authorize access="isAuthenticated()">
	
		<!-- nombre del usuario en sesión -->
		<security:authentication property="principal.username" var="username"/> 
	
		<font class="texto" color="white">Bienvenido <b>${username}</b></font> 
		<a href="<c:url value='/logout'/>"><font class="texto" color="white">Logout</font></a>
	</security:authorize>
	
            </nav>
        </div>
    </header>
    <div class="capa"></div>
    <input type="checkbox" id="btn-menu">
    <div class="container-menu">
        <div class="cont-menu">
            <nav>
                <a href="<c:url value='/imagen_listar'/>">
                    <font class="texto" color="white">Imagenes</font>
                </a>
                <a href="<c:url value='/categoria_listar'/>">
                    <font class="texto" color="white">Categoria</font>
                </a>
                <a href="<c:url value='/musica_listar'/>">
                    <font class="texto" color="white">Musica</font>
                </a>
                <a href="<c:url value='/productor_listar'/>">
                    <font class="texto" color="white">Productor</font>
                </a>
                <a href="<c:url value='/musica_productor_listar'/>">
                    <font class="texto" color="white">MusicaProductor</font>
                </a>
            </nav>
            <label for="btn-menu">X</label>
        </div>
        <!-- si el usuario es visitante -->
	<security:authorize access="isAnonymous()">
	</security:authorize>
                	
  </div>
   
   <!-- footer -->
    <%@include file="/WEB-INF/views/shared/footer2.jsp" %>
   <!-- Optional JavaScript; choose one of the two! -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>
</body>
</html>