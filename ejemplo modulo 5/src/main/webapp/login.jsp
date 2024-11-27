<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
</style>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
	  <a class="navbar-brand" href="#">
	    <img src="assets/img/logo.png" alt="Logo" style="padding: 5px; width: 50px; height: 50px;">
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
            <%if(nombreUsuario != null){ %>
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
    <section>
        <%if(mensaje != null){ %>
            <h2 class="ml-5 mt-5"><%= mensaje %></h2>
        <% } %>
    </section>	
	<section class="container m-5">
	   <!-- Inicio de Sesión -->

	        <div class="modal-body">
	           <h5 class="modal-title" id="loginModalLabel">Iniciar Sesión</h5>  
	          <form action="VerificarUsuario" method="post">        
	            <div class="form-group">
	              <label for="email">Email</label>
	              <input type="email" class="form-control" id="email" placeholder="Ingresa tu email" name="email">
	            </div>
	            <div class="form-group">
	              <label for="password">Contraseña</label>
	              <input type="password" class="form-control" id="password" placeholder="Ingresa tu contraseña" name="password">
	            </div>
	            <button type="submit" class="btn btn-primary">Aceptar</button>
	          </form>
	        </div>
	</section>
	</body>
</html>