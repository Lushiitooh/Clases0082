package org.edutecno.modulo5.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.edutecno.modulo5.model.Tarea;

import java.io.IOException;
import java.util.List;

@WebServlet(name="EliminarTareaServlet", value="/menu/eliminarTarea")
public class EliminarTareaServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));

        TareaServlet.eliminarTarea(id);
        getServletContext().setAttribute("mesagge","Tarea eliminada exitosamente");
        response.sendRedirect("tareas");

    }
}
