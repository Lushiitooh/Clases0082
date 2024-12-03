package org.edutecno.modulo5.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebFilter(urlPatterns = {"/menu/tareas","/menu/editarTarea","/menu/eliminarTarea","/menu.jsp","/menu/agregarTareas.jsp","/menu/editarTareas.jsp","/menu/listarTareas.jsp"})
public class FiltroAutentificacion implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;

        HttpSession session = httpServletRequest.getSession(false);
        String usuario = null;

        if(usuario != null){
            usuario = (String)session.getAttribute("usuario");
        }

        if (usuario == null) {
            Cookie[] cookies = httpServletRequest.getCookies();
            if (cookies != null) {
                for (Cookie cookie : cookies) {
                    if ("usuario".equals(cookie.getName())) {
                        usuario = cookie.getValue();
                        session = httpServletRequest.getSession(true);
                        session.setAttribute("usuario", usuario);
                        break;
                    }
                }
            }
        }

            if (usuario == null) {
                httpServletResponse.sendRedirect("login.jsp");
            }

            filterChain.doFilter(servletRequest, servletResponse);
        }


    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
