<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Gestion de tareas</title>
</head>
<body>
<h1>Gestion de tareas</h1>

<form method="post" action="/tareas">
  <label for="nombre">Nombre:</label>
  <input type="text" id="nombre" name="nombre" required>
  <br><br>
  <label for="descripcion">Descripción:</label>
  <input type="text" id="descripcion" name="descripcion" required>
  <br><br>
  <label for="fecha">Fecha:</label>
  <input type="date" id="fecha" name="fecha" required>
  <br><br>
  <button type="submit">Agregar Tarea</button>
</form>


</body>
</html>
