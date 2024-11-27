package main.java.modelo.dao;

import java.util.List;
import main.java.modelo.dto.Usuario;

public interface IUsuarioDao {

    public Usuario findById(Integer id);

    public Usuario findByCorreo(String correo);

    public List<Usuario> findAll();

    public boolean create(Usuario usuario);

    public Integer update(Usuario usuario);

    public Integer delete(Integer id);
}
