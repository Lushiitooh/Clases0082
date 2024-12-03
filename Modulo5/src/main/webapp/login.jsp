<%@ page import="org.edutecno.modulo5.servlet.LoginServlet" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  String cookieUsuario = "";
  jakarta.servlet.http.Cookie[] cookies = request.getCookies();
  if(cookies != null){
    for(jakarta.servlet.http.Cookie cookie : cookies){
      if("usuario".equals(cookie.getName())){
        cookieUsuario = cookie.getValue();
        System.out.println("se encontro la cookie de la pagina");
        break;
      }else
        System.out.println("no se encontro la cookie desde la pagina web");
    }
  }
%>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h1>Inicio de Sesión</h1>
<form action="login" method="POST">
  <label>Usuario:</label>
  <input type="text" id="usuario" name="usuario" value="<%=cookieUsuario%>" required>
  <br><br>

  <label>Contraseña:</label>
  <input type="text" id="password" name="password" required>
  <br><br>
  <input type="checkbox" id="recordar" name="recordar">
  <label for="recordar">Mantener Sesion Abierta</label>
  <button type="submit">Ingresar</button>
</form>

<br><br>
<a href="registro.jsp">Registrarse</a>
</body>
</html>
