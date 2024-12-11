<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>



<html>
<head>
    <title>Listar Tareas</title>
</head>
<body>
<br><br>
<br><br>
<br><br>

<h2>Lista de tareas</h2>
<c:choose>
  <c:when test="${not empty listarTareas}">
<table border="1">
  <thead>
  <tr>
    <th>ID</th>
    <th>Nombre</th>
    <th>Descripción</th>
    <th>Fecha</th>
    <td>Acción</td>
  </tr>
  </thead>
  <tbody>
  <c:forEach var="listarTareas" items="${listarTareas}">
    <tr>
      <td>${listarTareas.id}</td>
      <td>${listarTareas.nombre}</td>
      <td>${listarTareas.descripcion}</td>
      <td>${listarTareas.fecha}</td>
      <td>
        <form method="post" action ="/eliminarTarea">
          <input type="hidden" name="id" value ="${listarTareas.id}">
          <label for="usuarioKiller">Usuario que eliminara:</label>
          <input type="text" id="usuarioKiller" name="usuarioKiller" required>
          <label for="motivoEliminacion">Motivo de la eliminación:</label>
          <input type="text" id="motivoEliminacion" name="motivoEliminacion" required>
          <button type="submit">Eliminar</button>
        </form>
      </td>
    </tr>
  </c:forEach>
  </tbody>
</table>
  </c:when>
  <c:otherwise>
    <p>No hay tareas</p>
  </c:otherwise>
  </c:choose>
</body>
</html>
