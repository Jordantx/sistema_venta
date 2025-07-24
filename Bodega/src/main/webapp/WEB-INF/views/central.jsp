<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- librerìa Spring Form -->
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Central</title>
		<link rel="stylesheet" href="<c:url value='/css/styles.css'/>">
		<link rel="stylesheet" href="<c:url value='/css/menu.css'/>">
	</head>
	<body>
		 <div class="nav">
	         <ul class="menu">
	            <li class="active">Home</li>
	            <li class="active">About</li>
	            <li class="active">Gallery</li>
	            <li class="active">Contact us</li>
	         </ul>
	      </div>
	      
		<h2>Bienvenido al sistema central</h2>
	    <a href="logout">Cerrar sesión</a>
	    
	</body>
</html>