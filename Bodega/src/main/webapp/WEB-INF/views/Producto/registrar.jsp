<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- JSTL core -->
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	  <div style="text-align: center; font-size: 25px;">
        <h3>¡Producto - Registrar!</h3>

       <form:form name="" method="POST" modelAttribute="producto">
	        Nombre: <form:input type="text" path="nombre" /> <br>
	        Descripcion: <form:input type="text" path="descripcion" /> <br>
	        Precio: <form:input type="text" path="precio"  /> <br>
			Estado: 
	        <!-- Usuario asociado -->
	        Usuario:
        <form:select path="usuario.id_usuario">
            <form:options items="${listaUsuarios}" itemValue="id_usuario" itemLabel="usuario"/>
        </form:select>
        <br><br>
				
            <button type="submit">Guardar</button>
            <button type="button" onclick="location.href='/bodega/producto/listar'">Cancelar</button>
        </form:form>
    </div>
</body>
</html>