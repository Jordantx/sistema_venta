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
		
		<link rel="stylesheet" href="<c:url value='/css/menu.css'/>">
		<link rel="stylesheet" href="<c:url value='/css/producto.css'/>">
		
	</head>
	<body>
		
		 <div class="nav">
		 	
	        <img class="imgLogo" src="img/logo.png" id="miImagen" width="80px" height="80px" >
	        
	        	<div class="estiloMenu">
		        <a class="diseñasMenuLink " href="/bodega/producto/listar" class="">producto</a>
		        <a class="diseñasMenuLink" href="/bodega/yosoy">quienes somo</a>
		        <a class="diseñasMenuLink" href="#">coleta </a>
		        <a class="diseñasMenuLink" href="#">almecn</a>
		      </div>
	    </div>
	      
	     
		
	   	
	    
	</body>
</html>