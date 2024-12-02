package org.edutecno.modulo5.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.edutecno.modulo5.model.Usuario;
import org.edutecno.modulo5.service.UsuarioService;

import java.io.IOException;

@WebServlet(name="LoginServlet", value="/login")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");

        Usuario nuevoUsuario = UsuarioService.validarUsuario(usuario,password);
        if(nuevoUsuario == null){
            request.setAttribute("error", "usuario invalido");
            request.getRequestDispatcher("login.jsp").forward(request,response);
        }

        HttpSession session= request.getSession();
        session.setAttribute("usuario",usuario);
        response.sendRedirect("index.jsp");
    }

}
