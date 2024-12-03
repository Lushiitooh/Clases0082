package org.edutecno.modulo5.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.edutecno.modulo5.service.UsuarioService;

import java.io.IOException;


@WebServlet(name="RegistroUsuarioServlet", value="/registro")
public class RegistroUsuarioServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");

        if(usuario == null || usuario.trim().isEmpty() || password == null || password.trim().isEmpty()){
            request.setAttribute("Error","Todos los campos son obligatorios");
            request.getRequestDispatcher("registro.jsp").forward(request,response);

        }
        UsuarioService.registrarUsuario(usuario,password);
        response.sendRedirect("login.jsp");
    }

}
