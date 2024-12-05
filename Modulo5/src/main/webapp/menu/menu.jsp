<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    if (session.getAttribute("usuario") == null) {
        response.sendRedirect(request.getContextPath() + "/index.jsp");
        return;
    }
%>
<html>
<head>
    <title>Gestor de Tareas</title>
    <link rel="stylesheet" href="../assets/css/style.css">
</head>
<body>
<h1> Bienvenidos a Gestor de Tareas 0082</h1>

<br><br>
<a href="/menu/agregarTareas.jsp">Agregar Tarea</a>
<br><br>
<a href="/menu/listarTareas.jsp">Listar Tareas</a>
<br><br>
<a href="${pageContext.request.contextPath}/logout">Cerrar Sesión</a>
</body>
</html>

