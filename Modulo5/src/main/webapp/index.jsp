<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Gestor de Tareas</title>
  </head>
  <body>
  <h1> Bienvenidos a Gestor de Tareas 0082</h1>
  <form action="tareas" method="POST">
    <label for="nombre">Nombre de la tarea:</label>
    <input type="text" id="nombre" name="nombre" required>
    <br><br>
    <label for="descripcion">Descripción de la tarea</label>
    <textarea id="descripcion" name="descripcion" required></textarea>
    <br><br>
    <button type="submit">Agregar Tarea</button>
  </form>
  <br><br>
  <a href="tareas">Ver Listado de tareas</a>
  </body>
</html>
