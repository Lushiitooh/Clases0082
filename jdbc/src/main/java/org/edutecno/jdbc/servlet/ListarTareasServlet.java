package org.edutecno.jdbc.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.edutecno.jdbc.model.Tarea;
import org.edutecno.jdbc.service.TareaService;

import javax.print.attribute.HashPrintJobAttributeSet;
import java.io.IOException;
import java.util.List;

@WebServlet("/listarTareas")
public class ListarTareasServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        TareaService tareaService = new TareaService();

        try{
            List<Tarea> tareas = tareaService.listarTareas();
            //System.out.println("Tareas recuperadas: " + tareas.size());//devuelve tamaño de tareas en sql
            request.setAttribute("listarTareas",tareas);
        }catch(Exception e){
            e.printStackTrace();
            request.setAttribute("error", "No se pueden cargar las tareas");
        }
        request.getRequestDispatcher("/listarTareas.jsp").forward(request,response);
    }
}
