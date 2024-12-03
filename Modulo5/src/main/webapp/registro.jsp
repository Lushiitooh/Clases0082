<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Login</title>
</head>
<body>
<h1>Registrarse</h1>
<form action="registro" method="POST">
  <label>Usuario:</label>
  <input type="text" id="usuario" name="usuario" required>
  <br><br>
  <label>Contraseña:</label>
  <input type="text" id="password" name="password" required>
  <br><br>
  <button type="submit">Registrar</button>
</form>
</body>

</html>