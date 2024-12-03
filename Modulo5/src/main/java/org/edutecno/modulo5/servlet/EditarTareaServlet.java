package org.edutecno.modulo5.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.edutecno.modulo5.model.Tarea;

import java.io.IOException;
import java.util.List;


@WebServlet(name="EditarTareaServlet", value="/menu/editarTarea")
public class EditarTareaServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        int id = Integer.parseInt(request.getParameter("id"));

        //Buscar la tarea con el ID proporcionado
        Tarea tareaEncontrada = null;
        for(Tarea tarea : (List<Tarea>)getServletContext().getAttribute("tareas")){
            if (tarea.getId()==id){
                tareaEncontrada = tarea;
                break;
            }
        }

        if(tareaEncontrada == null){
            request.setAttribute("Error","La tarea no existe");
            request.getRequestDispatcher("listarTareas.jsp").forward(request,response);
            return;
        }

        request.setAttribute("tarea",tareaEncontrada);
        request.getRequestDispatcher("editarTareas.jsp").forward(request,response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        int id = Integer.parseInt(request.getParameter("id"));
        String nombre = request.getParameter("nombre");
        String descripcion = request.getParameter("descripcion");
        String fecha = request.getParameter("fecha");

        for(Tarea tarea : (List<Tarea>)getServletContext().getAttribute("tareas")){
            if (tarea.getId()==id){
                tarea.setNombre(nombre);
                tarea.setDescripcion(descripcion);
                tarea.setFecha(fecha);
                break;
            }
        }

        request.getServletContext().setAttribute("message","Tarea Actualizada");
        response.sendRedirect("tareas");


    }
}
