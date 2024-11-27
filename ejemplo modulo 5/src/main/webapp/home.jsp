<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page import="modelo.dto.Usuario"%>
<%@page import="java.util.List"%>   
<!DOCTYPE html>
<html>
<head>
	<meta charset="utp-8">
	<title>Sistema administración trabajadores</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <% 
      List<Usuario> usuarios = (List<Usuario>) request.getAttribute("usuarioRespuesta");
      Integer mostrarDatos = (Integer)request.getAttribute("mostrarDatos");
      String mensaje = (String)request.getAttribute("mensaje");  
      String nombreUsuario = (String)request.getAttribute("nombreUsuario");

    %>
</head>
<style>
    .navbar-text {
      margin-right: 10px;
    }
	.navbar-nav .nav-link {
	  font-size: 16px;
	  font-weight: semibold;
	  font-family: 'Poppins', sans-serif;
	}
	.celeste-box {
     background-color: #b3e5fc; /* Color celeste */
     padding: 20px;
     border-radius: 5px;
    }
</style>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
	  <a class="navbar-brand" href="#">
      <img src="${pageContext.request.contextPath}/assets/img/sheraton.png" alt="Logo" style="padding: 5px; width: 50px; height: 50px;">

	    
	  </a>
	  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
	    <span class="navbar-toggler-icon"></span>
	  </button>
	  <div class="collapse navbar-collapse" id="navbarNav">
	    <ul class="navbar-nav mr-auto">
	      <li class="nav-item active">
	        <a class="nav-link" href="inicio.jsp">Inicio <span class="sr-only">(current)</span></a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="#">Trabajador</a>
	      </li>
	    </ul>
        <div class="navbar-text">
            <% if(nombreUsuario != null){ %>
				<form action="CerrarSesion" method="post" style="display:inline;">
				    <button type="submit" class="btn btn-primary ml-2 custom-rounded">Cerrar sesión</button>
				</form>

             <span><%= nombreUsuario %></span>
           <% } else {%>       
                <span>Usuario</span>
	             <!--<button class="btn btn-primary ml-2 custom-rounded" data-toggle="modal" data-target="#loginModal">Iniciar sesión</button>-->
	            <button class="btn btn-primary ml-2 custom-rounded" onclick="window.location.href='login.jsp'">Iniciar sesión</button>
	            
	             <!--<a href="registro.jsp" class="ml-2" data-toggle="modal" data-target="#registerModal">¿No tienes cuenta? Regístrate</a>-->
	            <a href="registro.jsp" class="ml-2">¿No tienes cuenta? Regístrate</a>                
           <% } %>        
        </div>	    

	  </div>
	</nav>
	
    <div class="container">
        <%if(mensaje != null){ %>
            <h2 class="text-center mt-5"><%= mensaje %></h2>
        <% } %>
    </div>

    <div class="container mt-5">
        <div class="celeste-box text-center font-weight-bold">
            <h3>Usuarios registrados en sistema</h3>
        </div>
    </div>
	<div class="container mt-5">
		<table class="table">
		  <thead>
		    <tr>
		      <th scope="col">Identificador</th>
		      <th scope="col">Correo</th>
		      <th scope="col">Nick</th>
		      <th scope="col">Nombre</th>
		      <th scope="col">Password</th>
		    </tr>
		  </thead>
		  <tbody>
		    <% for(Usuario usuario : usuarios){ %>
		    	<tr>
			      <td><%= usuario.getId() %></td>
			      <td><%= usuario.getCorreo() %></td>
			      <td><%= usuario.getNick() %></td>
			      <td><%= usuario.getNombre() %></td>
			      <td><%= usuario.getPassword() %></td>
			    </tr>
		    <% } %>
		  </tbody>
		</table>
	</div>



 
</body>
</html>