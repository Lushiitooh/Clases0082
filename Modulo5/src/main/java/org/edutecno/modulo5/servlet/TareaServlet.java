package org.edutecno.modulo5.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.edutecno.modulo5.model.Tarea;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


//Listar tareas, Crear Tareas
@WebServlet(name ="TareaServlet", value="/tareas")
public class TareaServlet extends HttpServlet {
    //Lista de Tareas
    private static final List<Tarea> tareas = new ArrayList<>();
    private static int idContador = 1;

        //Metodo doGet: maneja solicitudes GET para listar tareas
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
            //Pasa la lista de tareas al JSP
            getServletContext().setAttribute("tareas",tareas);

            //Reedirige a la vista listarTareas.jsp
            request.getRequestDispatcher("listarTareas.jsp").forward(request,response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String descripcion = request.getParameter("descripcion");

        if(nombre == null || nombre.isEmpty() || descripcion == null || descripcion.isEmpty()){
            /*response.setContentType("text/html");
            PrintWriter salida = response.getWriter();
            salida.println("<html><body>");
            salida.println("<h1>Error.</h1>");
            salida.println("</body></html>");*/
            request.setAttribute("error", "Todos los campos son obligatorios");
            request.getRequestDispatcher("agregarTareas.jsp").forward(request,response);
            return;
        }

        Tarea nuevaTarea = new Tarea(idContador++, nombre, descripcion);
        tareas.add(nuevaTarea);
        response.sendRedirect("tareas");
    }
}
