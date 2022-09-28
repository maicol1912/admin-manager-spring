package com.example.springData.Service;

import java.util.List;
import java.util.Optional;

import com.example.springData.Entity.Usuario;

public interface IUsuarioService {
    public List<Usuario>findAll();
    public int save(Usuario usuario);
    public Optional<Usuario> findOne(Long id);
    public void delete(Long id);
}