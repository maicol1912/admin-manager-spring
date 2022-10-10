package com.example.springData.Service;

import java.util.List;
import java.util.Optional;

import com.example.springData.Entity.RolF;



public interface IRolService {
    public List<RolF>findAll();
    public void save(RolF usuario);
    public Optional<RolF> findOne(Long id);
    public void delete(Long id);
}