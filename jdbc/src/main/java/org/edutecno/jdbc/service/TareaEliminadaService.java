package org.edutecno.jdbc.service;

import org.edutecno.jdbc.model.Tarea;
import org.edutecno.jdbc.model.TareaEliminada;
import org.edutecno.jdbc.util.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TareaEliminadaService {

    public void agregarTareaEliminada(TareaEliminada tareaEliminada) throws SQLException{
        String sql = "INSERT INTO tareaseliminadas(id_tarea,nombre_tarea, descripcion_tarea, fecha_tarea, usuario_killer,motivo_eliminacion) values(?,?,?,?,?,?)";
        try(Connection connection = DatabaseConnection.getConnection(); PreparedStatement stmt = connection.prepareStatement(sql)){
            stmt.setInt(1,(tareaEliminada.getTareaEliminadaId())); // esta llamado
            stmt.setString(2,tareaEliminada.getNombreTareaEliminada()); // esta llamado
            stmt.setString(3,tareaEliminada.getDescripcionTareaEliminada());// esta llamado
            stmt.setDate(4,java.sql.Date.valueOf(tareaEliminada.getFechaTareaEliminada()));// esta llamado
            //recordar parsear de sql a java y luego de java a sql para guardar
            stmt.setString(5,tareaEliminada.getUsuarioKiller());
            stmt.setString(6,tareaEliminada.getMotivoEliminacion());
            stmt.executeUpdate();
        }
    }




    public List<TareaEliminada> listarTareasEliminadas() throws SQLException {
        List<TareaEliminada> tareasEliminadas = new ArrayList<>();
        String sql = "SELECT * FROM tareaseliminadas";
        try (Connection connection = DatabaseConnection.getConnection(); PreparedStatement stmt = connection.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                TareaEliminada tareaEliminada = new TareaEliminada();
                tareaEliminada.setIdTareaEliminada(rs.getInt("id_eliminada"));
                tareaEliminada.setTareaEliminadaId(rs.getInt("id_tarea"));
                tareaEliminada.setNombreTareaEliminada(rs.getString("nombre_tarea"));
                tareaEliminada.setDescripcionTareaEliminada(rs.getString("descripcion_tarea"));
                tareaEliminada.setFechaTareaEliminada(rs.getDate("fecha_tarea").toLocalDate());
                tareaEliminada.setUsuarioKiller(rs.getString("usuario_killer"));
                tareaEliminada.setMotivoEliminacion(rs.getString("motivo_eliminacion"));
                tareasEliminadas.add(tareaEliminada);

            }
            //System.out.println("Tareas recuperadas de la base de datos: " + tareas.size());
        }
        return tareasEliminadas;

    }
}
