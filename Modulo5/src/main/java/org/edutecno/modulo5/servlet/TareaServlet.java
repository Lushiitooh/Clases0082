package org.edutecno.modulo5.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.edutecno.modulo5.model.Tarea;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


//Listar tareas, Crear Tareas
@WebServlet(name ="TareaServlet", value="/tareas")
public class TareaServlet extends HttpServlet {
    //Lista de Tareas
    private static final List<Tarea> tareas = new ArrayList<>();
    private static final Queue<Integer> idsDisponibles = new LinkedList<>();
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
        String fecha = request.getParameter("fecha");

        if(nombre == null || nombre.isEmpty() || descripcion == null || descripcion.isEmpty() || fecha == null || fecha.isEmpty()){
            request.setAttribute("error", "Todos los campos son obligatorios");
            request.getRequestDispatcher("agregarTareas.jsp").forward(request,response);
            return;
        }

        int id = idsDisponibles.isEmpty() ? idContador++ : idsDisponibles.poll();
        Tarea nuevaTarea = new Tarea(id, nombre, descripcion, fecha);
        tareas.add(nuevaTarea);
        response.sendRedirect("tareas");
    }
    public static void eliminarTarea(int id){
        tareas.removeIf(tarea->tarea.getId()==id);
        idsDisponibles.offer(id);
    }
}
