package org.edutecno.jdbc.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.edutecno.jdbc.model.Tarea;
import org.edutecno.jdbc.model.TareaEliminada;
import org.edutecno.jdbc.service.TareaEliminadaService;
import org.edutecno.jdbc.service.TareaService;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/eliminarTarea")
public class EliminarTareaServlet extends HttpServlet {
    private final TareaService tareaService = new TareaService();
    private final TareaEliminadaService tareaEliminadaService = new TareaEliminadaService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        int idTarea = Integer.parseInt(request.getParameter("id"));
        String usuarioKiller = request.getParameter("usuarioKiller");
        String motivoEliminacion = request.getParameter("motivoEliminacion");

        try{
            List<Tarea> tareas = tareaService.listarTareas();
            Tarea tarea = tareas.stream().filter(t->t.getId() == idTarea).findFirst().orElse(null);
            if(tarea != null){
                TareaEliminada tareaEliminada = new TareaEliminada();
                tareaEliminada.setTareaEliminadaId(tarea.getId());
                tareaEliminada.setNombreTareaEliminada(tarea.getNombre());
                tareaEliminada.setDescripcionTareaEliminada(tarea.getDescripcion());
                tareaEliminada.setFechaTareaEliminada(tarea.getFecha());
                tareaEliminada.setUsuarioKiller(usuarioKiller);
                tareaEliminada.setMotivoEliminacion(motivoEliminacion);

                tareaEliminadaService.agregarTareaEliminada(tareaEliminada);
                tareaService.eliminarTarea(idTarea);
            }


        } catch (SQLException e) {
            e.printStackTrace();
            request.setAttribute("error","no se pudo elimnar la tarea");
        }
        response.sendRedirect("/listarTareas");
    }

}
