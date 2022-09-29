package com.example.springData.Dao;

import java.util.List;
import java.util.Optional;

import com.example.springData.Entity.Usuario;

public interface UsuarioDao {
    public List<Usuario>findAll();
    public void save(Usuario usuario);
    public Optional<Usuario> findOne(Long id);
    public void delete(Long id);
}
