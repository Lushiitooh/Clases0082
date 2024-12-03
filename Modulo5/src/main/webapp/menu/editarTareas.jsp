<%@ page contentType="text/html;charset=UTF-8" language ="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Editar Tareas</title>
    <link rel="stylesheet" href="../assets/css/style.css">
</head>
<body>
<h1>Editar Tarea</h1>
<a href='/menu/listarTareas.jsp'> Volver a la lista </a>
<form action="/menu/editarTarea" method="POST">
    <input type="hidden" name="id" value="${tarea.id}" required>
    <label for="nombre">Nombre:</label>
    <input type="text" id="nombre" name="nombre" value="${tarea.nombre}" required>
    <br><br>
    <label for="descripcion">Descripción:</label>
    <input type="text" id="descripcion" name="descripcion" value="${tarea.descripcion}" required>
    <br><br>
    <label for="fecha">Fecha:</label>
    <input type="date" id="fecha" name="fecha" value="${tarea.fecha}" required>
    <br><br>
    <button type="submit">Guardar Cambios</button>
</form>
</body>
</html>
