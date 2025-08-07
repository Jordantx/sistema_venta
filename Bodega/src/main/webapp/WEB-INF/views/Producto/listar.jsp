<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <!-- JSTL core -->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link rel="stylesheet" href="<c:url value='/css/menu.css'/>">
	<link rel="stylesheet" href="<c:url value='/css/tabla.css'/>">
</head>
<body>

		<div class="nav">
		 	
	            <img class="imgLogo" src="${pageContext.request.contextPath}/img/logo.png" id="miImagen" width="80px" height="80px" >

	        
	        	<div class="estiloMenu">
	        	<a class="diseñasMenuLink " href="/bodega/central" class="">Inicio</a>
		        <a class="diseñasMenuLink " href="/bodega/producto/listar" class="">Producto</a>
		        <a class="diseñasMenuLink" href="/bodega/yosoy">quienes somo</a>
		        <a class="diseñasMenuLink" href="#">coleta </a>
		        <a class="diseñasMenuLink" href="#">almecn</a>
		      </div>
	    </div>

	
		<table border="1">
		    <tr>
		        <th>ID</th>
		        <th>Nombre</th>
		        <th>Descripción</th>
		        <th>Precio</th>
		        
		        <th>Estado</th>
		        <th>Usuario</th>
		        <th><b>Acción</b></th>
		    </tr>
		    <c:forEach var="producto" items="${bProducto}">
		        <tr>
		            <td>${producto.id_producto}</td>
		            <td>${producto.nombre}</td>
		            <td>${producto.descripcion}</td>
		            <td>${producto.precio}</td>
		            
		            <td>${producto.estado}</td>
		            <td>${producto.usuario.usuario}</td>
		            <td>
		            		<a href="#">Detalle</a> | 
							<a href="#">Editar</a> | 
							<a href="#">Borrar</a>
					</td>
		            
		        </tr>
		    </c:forEach>
		</table>
		
		
			<div class="inicio-registo">
			
				<a href="/bodega/central">inicio</a> | 
				<a href="/bodega/producto/registrar">Registrar</a>
			</div>
		
</body>
</html>