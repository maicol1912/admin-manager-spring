package com.example.springData.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springData.Dao.RolDao;
import com.example.springData.Entity.RolF;

@Service
public class RolServiceImp implements IRolService{
    @Autowired
    private RolDao user;
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
        return user.findOne(id);

    }
    @Override
    public void delete(Long id) {
         user.delete(id);
    }
    
}
