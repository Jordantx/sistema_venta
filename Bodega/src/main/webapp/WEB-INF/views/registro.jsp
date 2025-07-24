
<html>
	<head>
		<title>Login</title>
		<link rel="stylesheet" href="<c:url value='/css/styles.css'/>">
	</head>
	<body>
	
		<h2>Registro de Usuario</h2>
		<form action="guardar" method="post">
		    Usuario: <input type="text" name="usuario"><br>
		    Contraseña: <input type="password" name="contrasena"><br>
		    Rol:  
		    <select name="rol">
		        <option value="ADMINISTRADOR">Administrador</option>
		        <option value="USUARIO">Usuario</option>
		    </select><br>
		    <input type="submit" value="Registrar">
		    <br>
		    
		</form>
		<a href="login">Ya tengo cuenta</a>
	</body>
</html>