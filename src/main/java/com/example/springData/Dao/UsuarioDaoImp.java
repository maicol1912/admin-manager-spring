package com.example.springData.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.springData.Entity.Usuario;
import com.example.springData.Repository.UsuarioRepository;

@Repository
public class UsuarioDaoImp implements UsuarioDao{

    @Autowired
    private UsuarioRepository user;
    @Override
    public List<Usuario> findAll() {
        return (List<Usuario>) user.findAll();
    }
    @Override
    public void save(Usuario usuario) {
        user.save(usuario);
    }
    @Override
    public Optional<Usuario> findOne(Long id) {
        return user.findById(id);

    }
    @Override
    public void delete(Long id) {
         user.deleteById(id);
        
    }
    
}
