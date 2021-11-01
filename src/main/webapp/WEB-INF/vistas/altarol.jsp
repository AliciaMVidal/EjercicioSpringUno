<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page session="true"%>
	
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Alta rol</title>
</head>
<body>
	<form  action="procesarAltaRol" modelAttribute="nuevoRol" method="post">
		<span class="subtitle">Rol:</span> 
		<br> 
		<input type="text" name="rol" id="rol" value="">
		<br>
		<input type="submit" value="Rol">
	</form>
</body>
</html>