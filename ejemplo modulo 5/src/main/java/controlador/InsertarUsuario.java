package main.java.controlador;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import main.java.modelo.dao.IUsuarioDao;
import main.java.modelo.dao.UsuarioDaoImp;
import main.java.modelo.dto.Usuario;

import main.java.modelo.dao.IRolUsuarioDao;
import main.java.modelo.dao.RolUsuarioDaoImp;
import main.java.modelo.dto.RolUsuario;

import main.java.modelo.dao.IDireccionDao;
import main.java.modelo.dao.DireccionDaoImp;
import main.java.modelo.dto.Direccion;
/**
/**
 * Servlet implementation class InsertarUsuario
 */
@WebServlet("/InsertarUsuario")
public class InsertarUsuario extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertarUsuario() {
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
        // Obtén los parámetros del formulario
        String correo = request.getParameter("email");
        String nick = request.getParameter("nick");
        String nombre = request.getParameter("nombre");
        String password = request.getParameter("password");
        String direc = request.getParameter("direccion");
        String numero = request.getParameter("numero");
        String rol = request.getParameter("rol");
        System.out.println(rol);
        String nombreUsuario = null;
        String mensaje = null;
        Integer mostrarDatos = 0;
        
        // Obtén la fecha y hora actuales
        Timestamp fechaHora = new Timestamp(System.currentTimeMillis());

        // Crea una instancia del usuario con la fecha y hora actuales
        Usuario usuario = new Usuario(0, correo, fechaHora, nick, nombre, password, 0.0, fechaHora);

        // Llama al DAO para insertar el usuario
        IUsuarioDao usuarioDao = new UsuarioDaoImp();
        
        Usuario usuarioCorreo = usuarioDao.findByCorreo(correo);

        if (usuarioCorreo == null) {
            boolean insertado = usuarioDao.create(usuario);

            // Maneja la respuesta
            if (insertado) {
            	Usuario usuarioCorreoEncontrado = usuarioDao.findByCorreo(correo);
            	//System.out.println(usuarioCorreoEncontrado)
                if (usuarioCorreoEncontrado != null) {
                   	mensaje= "Usuario: "+nombre +" y email: " + correo +  " insertado exitosamente.";
                	nombreUsuario = nombre;
             	    //voy hacer el insert a la dirección
                	Direccion direccion = new Direccion(0, direc,numero,usuarioCorreoEncontrado.getId());
                	IDireccionDao direccionDao = new DireccionDaoImp();
                	Integer insertarDireccion = direccionDao.create(direccion);
                	
                	//voy hacer el insert en rol Usuario
                	RolUsuario rolUsuario= null;
               	
                	if (rol.equals("Administrador") ){
                    	//inserto el rol de usuario
                	    rolUsuario = new RolUsuario(usuarioCorreoEncontrado.getId(),1);
                    	IRolUsuarioDao rolUsuarioDao = new RolUsuarioDaoImp();
                    	Integer insertarRol = rolUsuarioDao.create(rolUsuario);
                        mostrarDatos = rolUsuario.getRolId();
                        List<Usuario> usuarioRespuesta = usuarioDao.findAll();
                    	request.setAttribute("usuarioRespuesta", usuarioRespuesta);
                        request.getSession().setAttribute("usuario", usuario);
                        request.setAttribute("mostrarDatos", mostrarDatos);           	   
                  	    request.setAttribute("nombreUsuario", nombreUsuario);
            		    request.setAttribute("mensaje", mensaje);
            		   request.getRequestDispatcher("home.jsp").forward(request, response);     
            		   return; 
                    }else {
                    	//inserto el rol de usuario
                	   rolUsuario = new RolUsuario(usuarioCorreoEncontrado.getId(),2);
                       IRolUsuarioDao rolUsuarioDao = new RolUsuarioDaoImp();                    	
                       Integer insertarRol = rolUsuarioDao.create(rolUsuario); 
                   	   
                  	   request.setAttribute("nombreUsuario", nombreUsuario);
            		   request.setAttribute("mensaje", mensaje);
            		   request.getRequestDispatcher("inicio.jsp").forward(request, response);  
            		   return;
                	}

                	
                 }
 
            } else {
            	mensaje="Error al insertar el usuario.";
            }
            
        }else {
        	mensaje="Email "+ correo + " ya se encuentra registrado.";
        }

		request.setAttribute("nombreUsuario", nombreUsuario);
		request.setAttribute("mensaje", mensaje);
		request.getRequestDispatcher("inicio.jsp").forward(request, response);
    }
}

