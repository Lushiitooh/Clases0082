package main.java.modelo.dao;

import main.java.modelo.dto.Direccion;

import java.util.List;


public interface IDireccionDao {
    public Direccion findById(Integer id);
    public List<Direccion> findAll();
    public Integer create(Direccion direccion);
    public Integer update(Direccion direccion);
    public Integer delete(Integer id);
}
