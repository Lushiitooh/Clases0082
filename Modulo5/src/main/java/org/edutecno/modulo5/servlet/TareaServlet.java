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
        //Establecer el tipo de contenido como text/html
        response.setContentType("text/html");


        // Objeto PrintWriter genera la respuesta HTML
        PrintWriter salidaInformacion = response.getWriter();

        salidaInformacion.println("<html><body>");
        salidaInformacion.println("<h1>Lista de Tareas</h1>");
        salidaInformacion.println("<a href='index.jsp'> Volver al inicio </a>");

        //verificar si hay tareas
        if(tareas.isEmpty()){
            salidaInformacion.println("<p>No hay tareas</p>");
        }else{
            salidaInformacion.println("<table border='1'>");
            salidaInformacion.println("<tr>");
            salidaInformacion.println("<th>ID</th>");
            salidaInformacion.println("<th>Nombre</th>");
            salidaInformacion.println("<th>Descripcion</th>");
            salidaInformacion.println("</tr>");
            for(Tarea tarea : tareas){
                salidaInformacion.println("<tr>");
                salidaInformacion.println("<td>" + tarea.getId() + "</td>");
                salidaInformacion.println("<td>" + tarea.getNombre() + "</td>");
                salidaInformacion.println("<td>" + tarea.getDescripcion() + "</td>");
                salidaInformacion.println("</tr>");
            }
            salidaInformacion.println("</table>");
        }
        salidaInformacion.println("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String descripcion = request.getParameter("descripcion");

        if(nombre == null || nombre.isEmpty() || descripcion == null || descripcion.isEmpty()){
            response.setContentType("text/html");
            PrintWriter salida = response.getWriter();
            salida.println("<html><body>");
            salida.println("<h1>Error.</h1>");
            salida.println("</body></html>");
            return;
        }

        Tarea nuevaTarea = new Tarea(idContador++, nombre, descripcion);
        tareas.add(nuevaTarea);
        response.sendRedirect("tareas");
    }
}
