package com.example.springData.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springData.Entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
    
}
