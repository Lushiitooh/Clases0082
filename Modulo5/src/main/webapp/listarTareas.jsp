<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Lista de Tareas 2</title>
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
            </tr>
            <!--for(Tarea tarea : tareas){-->
            <c:forEach var="tarea" items="${tareas}">
                <tr>
                    <td>${tarea.id}</td>
                    <td>${tarea.nombre}</td>
                    <td>${tarea.descripcion}</td>
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
