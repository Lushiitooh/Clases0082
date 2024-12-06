package org.edutecno.jdbc.facade;

import org.edutecno.jdbc.dao.CursoDAO;
import org.edutecno.jdbc.dto.CursoDTO;

import java.sql.SQLException;
import java.util.List;

public class Facade {

    public List<CursoDTO> obtenerListaCursos() throws ClassNotFoundException, SQLException{
        CursoDAO cursoDao = new CursoDAO();
        return cursoDao.listarCursos();
    }
    //////////////////////////////////////////

}
