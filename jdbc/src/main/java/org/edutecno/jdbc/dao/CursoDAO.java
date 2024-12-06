package org.edutecno.jdbc.dao;

import org.edutecno.jdbc.dto.CursoDTO;
import org.edutecno.jdbc.util.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CursoDAO {
    //listar cursos
    public List<CursoDTO> listarCursos() throws SQLException{
        String query = "SELECT * FROM CURSOS";
        List<CursoDTO> cursos = new ArrayList<>();

        try(Connection conn = DatabaseConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery()){
            while(rs.next()){
                CursoDTO curso = new CursoDTO();
                curso.setIdCurso(rs.getInt("ID_CURSO"));
                curso.setDescripcion(rs.getString("DESCRIPCION"));
                curso.setPrecio(rs.getDouble("PRECIO"));
                cursos.add(curso);
            }
        }
        return cursos;
    }


}
