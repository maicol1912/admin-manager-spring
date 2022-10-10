package com.example.springData.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.springData.Entity.RolF;
import com.example.springData.Repository.RolRepository;


@Repository
public class RolDaoImp implements RolDao{

    @Autowired
    private RolRepository user;
    @Override
    public List<RolF> findAll() {
        return (List<RolF>) user.findAll();
    }
    @Override
    public void save(RolF rol) {
        user.save(rol);
    }
    @Override
    public Optional<RolF> findOne(Long id) {
        return user.findById(id);

    }
    @Override
    public void delete(Long id) {
         user.deleteById(id);
    }
    
}
