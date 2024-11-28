<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Agregar Tarea</title>
</head>
<body>
<h1> Agregar Tarea</h1>
<a href='index.jsp'> Volver al inicio </a>
<c:if test="${not empty error}">
    <p style="color:red">${error}</p>
</c:if>

<form action="tareas" method="POST">
    <label for="nombre">Nombre de la tarea:</label>
    <input type="text" id="nombre" name="nombre" required>
    <br><br>
    <label for="descripcion">Descripción de la tarea</label>
    <textarea id="descripcion" name="descripcion" required></textarea>
    <br><br>
    <button type="submit">Agregar Tarea</button>
</form>

</body>
</html>
