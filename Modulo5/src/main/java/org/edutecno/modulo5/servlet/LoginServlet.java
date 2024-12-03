package org.edutecno.modulo5.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
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

        HttpSession session= request.getSession(false);
        if(session != null){
            session.invalidate();
        }
        session= request.getSession(true);
        session.setAttribute("usuario",usuario);

        String recordar = request.getParameter("recordar");
        if("on".equals(recordar)){
            Cookie cookie = new Cookie("usuario", usuario);
            cookie.setMaxAge(15);
           // System.out.println("se acciono el tiempo");
            cookie.setHttpOnly(true);
            cookie.setPath("/");
            response.addCookie(cookie);

           // System.out.println(cookie);
            //System.out.println("se guardo correctamente la cookie");


        }else{
            Cookie cookieServlet = new Cookie("usuario", "");
            cookieServlet.setMaxAge(0);
            cookieServlet.setPath("/");
            response.addCookie(cookieServlet);
            System.out.println("no se guardo la cookie");
        }

        response.sendRedirect("menu.jsp");
    }

}
