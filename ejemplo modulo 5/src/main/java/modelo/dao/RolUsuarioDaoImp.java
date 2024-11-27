package main.java.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import main.java.conexion.conexion;
import main.java.modelo.dto.RolUsuario;


public class RolUsuarioDaoImp implements IRolUsuarioDao {

    @Override
    public RolUsuario findByUsuarioId(Integer usuarioId) {
        ResultSet resultado = null;
        String query = "SELECT * FROM roles_usuarios WHERE usuario_id = " + usuarioId;
        Connection conectar = conexion.conexion();
        RolUsuario rolUsuario = null;
        try {
            Statement statement = conectar.createStatement();
            resultado = statement.executeQuery(query);
            while (resultado.next()) {
                rolUsuario = new RolUsuario(
                        resultado.getInt("usuario_id"),
                        resultado.getInt("rol_id")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rolUsuario;
    }

    @Override
    public List<RolUsuario> findAll() {
        ResultSet resultado = null;
        String query = "SELECT * FROM roles_usuarios ORDER BY usuario_id";
        Connection conectar = conexion.conexion();
        List<RolUsuario> rolesUsuarios = new ArrayList<>();
        try {
            Statement statement = conectar.createStatement();
            resultado = statement.executeQuery(query);
            while (resultado.next()) {
                RolUsuario rolUsuario = new RolUsuario(
                        resultado.getInt("usuario_id"),
                        resultado.getInt("rol_id")
                );
                rolesUsuarios.add(rolUsuario);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rolesUsuarios;
    }

    @Override
    public Integer create(RolUsuario rolUsuario) {
        Integer resultado = 0;
        String query = String.format(
                "INSERT INTO roles_usuarios(usuario_id, rol_id) VALUES(%d, %d)",
                rolUsuario.getUsuarioId(),
                rolUsuario.getRolId()
        );
        Connection conectar = conexion.conexion();
        try {
            Statement statement = conectar.createStatement();
            resultado = statement.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultado;
    }

    @Override
    public Integer update(RolUsuario rolUsuario) {
        Integer resultado = 0;
        String query = String.format(
                "UPDATE roles_usuarios SET rol_id = %d WHERE usuario_id = %d",
                rolUsuario.getRolId(),
                rolUsuario.getUsuarioId()
        );
        Connection conectar = conexion.conexion();
        try {
            Statement statement = conectar.createStatement();
            resultado = statement.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultado;
    }

    @Override
    public Integer delete(Integer usuarioId) {
        Integer resultado = 0;
        String query = "DELETE FROM roles_usuarios WHERE usuario_id = " + usuarioId;
        Connection conectar = conexion.conexion();
        try {
            Statement statement = conectar.createStatement();
            resultado = statement.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultado;
    }
}
