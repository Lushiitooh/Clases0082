package main.java.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import main.java.conexion.conexion;
import main.java.modelo.dto.Direccion;

public class DireccionDaoImp implements IDireccionDao {

    @Override
    public Direccion findById(Integer id) {
        ResultSet resultado = null;
        String query = "SELECT * FROM direcciones WHERE id = " + id;
        Connection conectar = conexion.conexion();
        Direccion direccion = null;
        try {
            Statement statement = conectar.createStatement();
            resultado = statement.executeQuery(query);
            while (resultado.next()) {
                direccion = new Direccion(
                        resultado.getInt("id"),
                        resultado.getString("nombre"),
                        resultado.getString("numeracion"),
                        resultado.getInt("usuario_id")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return direccion;
    }

    @Override
    public List<Direccion> findAll() {
        ResultSet resultado = null;
        String query = "SELECT * FROM direcciones ORDER BY id";
        Connection conectar = conexion.conexion();
        List<Direccion> direcciones = new ArrayList<>();
        try {
            Statement statement = conectar.createStatement();
            resultado = statement.executeQuery(query);
            while (resultado.next()) {
                Direccion direccion = new Direccion(
                        resultado.getInt("id"),
                        resultado.getString("nombre"),
                        resultado.getString("numeracion"),
                        resultado.getInt("usuario_id")
                );
                direcciones.add(direccion);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return direcciones;
    }

    @Override
    public Integer create(Direccion direccion) {
        Integer resultado = 0;
        String query = String.format(
                "INSERT INTO direcciones(nombre, numeracion, usuario_id) VALUES('%s', '%s', %d)",
                direccion.getNombre(),
                direccion.getNumeracion(),
                direccion.getUsuarioId()
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
    public Integer update(Direccion direccion) {
        Integer resultado = 0;
        String query = String.format(
                "UPDATE direcciones SET nombre = '%s', numeracion = '%s', usuario_id = %d WHERE id = %d",
                direccion.getNombre(),
                direccion.getNumeracion(),
                direccion.getUsuarioId(),
                direccion.getId()
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
    public Integer delete(Integer id) {
        Integer resultado = 0;
        String query = "DELETE FROM direcciones WHERE id = " + id;
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
