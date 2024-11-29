<%@ page contentType="text/html;charset=UTF-8" language ="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Lista de Tareas 2</title>
    <link rel="stylesheet" href="./assets/css/style.css">
</head>
<body>
<h1> Lista de Tareas</h1>
<a href='index.jsp'> Volver al inicio </a>
<!--if(tareas.isEmpty()){-->
<c:choose>
    <c:when test="${not empty tareas}">
        <table>
            <tr>
                <th>ID</th>
                <th>Nombre</th>
                <th>Descripcion</th>
                <th>Fecha de ingreso</th>
            </tr>
            <!--for(Tarea tarea : tareas){-->
            <c:forEach var="tarea" items="${tareas}">
                <tr>
                    <td>${tarea.id}</td>
                    <td>${tarea.nombre}</td>
                    <td>${tarea.descripcion}</td>
                    <td>${tarea.fecha}</td>
                    <td>
                        <a href="editarTarea?id=${tarea.id}">Editar</a>
                        <a href="eliminarTarea?id=${tarea.id}" onclick="return confirm('¿Desea Eliminar?');">Eliminar</a>

                    </td>
                </tr>
            </c:forEach>
        </table>
    </c:when>
    <c:otherwise>
        <p>No hay tareas</p>
    </c:otherwise>
</c:choose>

</body>
</html>
