package org.edutecno.jdbc.service;

import org.edutecno.jdbc.model.Tarea;
import org.edutecno.jdbc.util.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TareaService {
    public void agregarTarea(Tarea tarea) throws SQLException{
        String sql = "INSERT INTO tarea(nombre,descripcion,fecha) values(?,?,?)";

        try(Connection connection = DatabaseConnection.getConnection(); PreparedStatement stmt = connection.prepareStatement(sql)){
            stmt.setString(1,tarea.getNombre());
            stmt.setString(2,tarea.getDescripcion());
            stmt.setDate(3,java.sql.Date.valueOf(tarea.getFecha()));
            stmt.executeUpdate();
        }



    }
    public List<Tarea> listarTareas() throws SQLException {
        List<Tarea> tareas = new ArrayList<>();
        String sql = "SELECT * FROM tarea";
        try (Connection connection = DatabaseConnection.getConnection(); PreparedStatement stmt = connection.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Tarea tarea = new Tarea();
                tarea.setId(rs.getInt("id"));
                tarea.setNombre(rs.getString("nombre"));
                tarea.setDescripcion(rs.getString("descripcion"));
                tarea.setFecha(rs.getDate("fecha").toLocalDate());
                tareas.add(tarea);

            }
            System.out.println("Tareas recuperadas de la base de datos: " + tareas.size());
        }
        return tareas;

    }

    public void eliminarTarea(int id) throws SQLException{
        String sql="DELETE FROM tarea WHERE id = ?";
        try(Connection connection = DatabaseConnection.getConnection(); PreparedStatement stmt = connection.prepareStatement(sql)){
            stmt.setInt(1,id);
            stmt.executeUpdate();
        }
    }


}
