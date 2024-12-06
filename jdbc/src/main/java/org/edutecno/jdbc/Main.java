package org.edutecno.jdbc;

import org.edutecno.jdbc.dto.CursoDTO;
import org.edutecno.jdbc.facade.Facade;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        try {
            List<CursoDTO> listaCursos = null;
            try {
                listaCursos = facade.obtenerListaCursos();
                System.out.println(listaCursos);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

        } finally {

        }
}
}
