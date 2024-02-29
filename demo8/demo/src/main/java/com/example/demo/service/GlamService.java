package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Glam;
import com.example.demo.repository.GlamRepo;

@Service
public class GlamService {
    @Autowired GlamRepo repo;
    public Glam post(Glam g){
        return repo.save(g);
    }
    public List<Glam> get(){
        return repo.findAll();
    }
    public Optional<Glam> getByid(int id){
        return repo.findById(id);
    }
    public String delete(int id){
        repo.deleteById(id);
        return "deleted";
    }
    public Glam put(int id,Glam gl){
        Glam g=repo.findById(id).orElse(null);
        if(g!=null){
            g.setCosmeticians(gl.getCosmeticians());
            // g.setCosmeticBrand(gl.getCosmeticBrand());
            // g.setCosmeticPrice(gl.getCosmeticPrice());
            return repo.saveAndFlush(g);
        }
        else{
            return null;
}
    }
public List<Glam> page(int a,int b)
{
    return repo.findAll(PageRequest.of(a, b)).getContent();
}
public List<Glam> sort(String a)
{
    return repo.findAll(Sort.by(Sort.Direction.ASC, a));
}
    
}