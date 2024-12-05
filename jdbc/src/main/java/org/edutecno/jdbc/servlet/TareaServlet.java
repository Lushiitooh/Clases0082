package org.edutecno.jdbc.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.edutecno.jdbc.model.Tarea;
import org.edutecno.jdbc.service.TareaService;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/tareas")
public class TareaServlet extends HttpServlet {
    private final TareaService tareaService = new TareaService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String nombre = request.getParameter("nombre");
        String descripcion = request.getParameter("descripcion");
        String fecha = request.getParameter("fecha");

        Tarea tarea = new Tarea();
        tarea.setNombre(nombre);
        tarea.setDescripcion(descripcion);
        tarea.setFecha(LocalDate.parse(fecha));

        try{
            tareaService.agregarTarea(tarea);
        }catch(SQLException e){
            e.printStackTrace();
            request.setAttribute("error","Error al agregar la tarea");
            request.getRequestDispatcher("/tareas").forward(request,response);
        }
        response.sendRedirect("/index.jsp");
    }



}
