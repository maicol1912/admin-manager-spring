package com.example.springData.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springData.Entity.Usuario;
import com.example.springData.Repository.UsuarioRepository;


@Service
public class UsuarioServiceImp implements IUsuarioService{
    @Autowired
    private UsuarioRepository user;
    @Override
    public List<Usuario> findAll() {
        return (List<Usuario>) user.findAll();
    }
    @Override
    public int save(Usuario usuario) {
        int res = 0;
        Usuario usu = user.save(usuario);
        if(!usu.equals(null)){
            res = 1;
        }
        return res;
        
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
