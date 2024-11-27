package main.java.modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;


import main.java.conexion.conexion;
import main.java.modelo.dto.Usuario;

public class UsuarioDaoImp implements IUsuarioDao {

    @Override
    public Usuario findById(Integer id) {
        ResultSet resultado = null;
        String query = "SELECT * FROM usuarios WHERE id = " + id;
        Connection conectar = conexion.conexion();
        Usuario usuario = null;
        try {
            Statement statement = conectar.createStatement();
            resultado = statement.executeQuery(query);
            while (resultado.next()) {
                usuario = new Usuario(
                        resultado.getInt("id"),
                        resultado.getString("correo"),
                        resultado.getTimestamp("created_at"),
                        resultado.getString("nick"),
                        resultado.getString("nombre"),
                        resultado.getString("password"),
                        resultado.getDouble("peso"),
                        resultado.getTimestamp("updated_at")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuario;
    }

    @Override
    public List<Usuario> findAll() {
        ResultSet resultado = null;
        String query = "SELECT * FROM usuarios ORDER BY id";
        Connection conectar = conexion.conexion();
        List<Usuario> usuarios = new ArrayList<>();
        try {
            Statement statement = conectar.createStatement();
            resultado = statement.executeQuery(query);
            while (resultado.next()) {
                Usuario usuario = new Usuario(
                        resultado.getInt("id"),
                        resultado.getString("correo"),
                        resultado.getTimestamp("created_at"),
                        resultado.getString("nick"),
                        resultado.getString("nombre"),
                        resultado.getString("password"),
                        resultado.getDouble("peso"),
                        resultado.getTimestamp("updated_at")
                );
                usuarios.add(usuario);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuarios;
    }

    @Override
    public boolean create(Usuario usuario) {
        String sql = "INSERT INTO usuarios (correo, created_at, nick, nombre, password, peso, updated_at) VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        try (Connection conectar = conexion.conexion();
             PreparedStatement pstmt = conectar.prepareStatement(sql)) {
        	System.out.println(usuario.getCorreo());
        	System.out.println(usuario.getCreatedAt());
        	
        	
        	
            pstmt.setString(1, usuario.getCorreo());
            pstmt.setTimestamp(2, usuario.getCreatedAt());
            pstmt.setString(3, usuario.getNick());
            pstmt.setString(4, usuario.getNombre());
            pstmt.setString(5, usuario.getPassword());
            pstmt.setDouble(6, usuario.getPeso());
            pstmt.setTimestamp(7, usuario.getUpdatedAt());

            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }


    @Override
    public Integer update(Usuario usuario) {
        Integer resultado = 0;
        String query = String.format(
                "UPDATE usuarios SET correo = '%s', created_at = '%s', nick = '%s', nombre = '%s', password = '%s', peso = %f, updated_at = '%s' WHERE id = %d",
                usuario.getCorreo(),
                usuario.getCreatedAt().toString(),
                usuario.getNick(),
                usuario.getNombre(),
                usuario.getPassword(),
                usuario.getPeso(),
                usuario.getUpdatedAt().toString(),
                usuario.getId()
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
        String query = "DELETE FROM usuarios WHERE id = " + id;
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
    public Usuario findByCorreo(String correo) {
        ResultSet resultado = null;
        String query = "SELECT * FROM usuarios WHERE correo = '" + correo + "'";
        Connection conectar = conexion.conexion();
        Usuario usuario = null;
        try {
            Statement statement = conectar.createStatement();
            resultado = statement.executeQuery(query);
            while (resultado.next()) {
                usuario = new Usuario(
                        resultado.getInt("id"),
                        resultado.getString("correo"),
                        resultado.getTimestamp("created_at"),
                        resultado.getString("nick"),
                        resultado.getString("nombre"),
                        resultado.getString("password"),
                        resultado.getDouble("peso"),
                        resultado.getTimestamp("updated_at")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuario;
    }
}
