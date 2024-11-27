package main.java.modelo.dao;

import main.java.modelo.dto.RolUsuario;

import java.util.List;

public interface IRolUsuarioDao {
    public RolUsuario findByUsuarioId(Integer usuarioId);

    public List<RolUsuario> findAll();

    public Integer create(RolUsuario rolUsuario);

    public Integer update(RolUsuario rolUsuario);

    public Integer delete(Integer usuarioId);
}
