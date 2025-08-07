<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
	<head>
		<title>Login</title>
		<link rel="stylesheet" href="<c:url value='/css/login.css'/>">
	</head>
	<body>
		<div class="estilo">
			<div>
		    	<h2>Iniciar Sesión</h2>
		    </div>
		    <form action="${pageContext.request.contextPath}/validar" method="post">	
		        Usuario: <input type="text" name="usuario"><br>
		        Contraseña: <input type="password" name="contrasena"><br>
		        <a href="/bodega/registro">Registrate</a><br>
		        <input type="submit" value="Ingresar">
		    </form>
		
		    <c:if test="${not empty error}">
		        <p style="color:red;">${error}</p>
		    </c:if>	
	    </div>
	</body>
</html>
