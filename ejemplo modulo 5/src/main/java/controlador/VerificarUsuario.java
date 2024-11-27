package main.java.controlador;

import main.java.modelo.dao.IRolUsuarioDao;
import main.java.modelo.dao.IUsuarioDao;
import main.java.modelo.dao.RolUsuarioDaoImp;
import main.java.modelo.dao.UsuarioDaoImp;
import main.java.modelo.dto.RolUsuario;
import main.java.modelo.dto.Usuario;


import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class VerificarUsuario
 */
@WebServlet("/VerificarUsuario")
public class VerificarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VerificarUsuario() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String nombreUsuario = null;
		String mensaje = null;
		Integer mostrarDatos = 0;
		IUsuarioDao usuarioDao = new UsuarioDaoImp();
		
        if (email != null && !email.trim().isEmpty() && password != null && !password.trim().isEmpty()) {
            Usuario usuario = usuarioDao.findByCorreo(email);

            if (usuario != null) {
                if (usuario.getPassword().equals(password)) {
                	nombreUsuario="Usuario: "+usuario.getNombre();
                    mensaje = "Inicio de sesión exitoso, bienvenido "+usuario.getNombre();
                    //Bucar el Rol 
                    IRolUsuarioDao rolUsuarioDao = new RolUsuarioDaoImp();
                    RolUsuario rolUsuario = rolUsuarioDao.findByUsuarioId(usuario.getId());
                    if (rolUsuario.getRolId()==1) {
                    	mostrarDatos = rolUsuario.getRolId();
                    	List<Usuario> usuarioRespuesta = usuarioDao.findAll();
                    	request.setAttribute("usuarioRespuesta", usuarioRespuesta);
                        request.getSession().setAttribute("usuario", usuario);
                        request.setAttribute("mostrarDatos", mostrarDatos);
                		request.setAttribute("nombreUsuario", nombreUsuario);
                		request.setAttribute("mensaje", mensaje);
                		request.getRequestDispatcher("home.jsp").forward(request, response);                    	
                    }else {
                    	Usuario usuarioRespuesta = usuarioDao.findByCorreo(email);
                       	request.setAttribute("nombreUsuario", nombreUsuario);
                		request.setAttribute("mensaje", mensaje);
                		request.getRequestDispatcher("inicio.jsp").forward(request, response);                 	
                    	
                    }

                    return;
                } else {
                    mensaje = "Contraseña incorrecta";
                }
            } else {
                mensaje = "No se encontró un usuario con ese correo "+ email;
            }
        } else {
            mensaje = "Todos los campos deben contener información";
        }
		request.setAttribute("nombreUsuario", nombreUsuario);
		request.setAttribute("mensaje", mensaje);
		request.getRequestDispatcher("inicio.jsp").forward(request, response);
	}
}
