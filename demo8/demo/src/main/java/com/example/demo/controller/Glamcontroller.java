package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Glam;
import com.example.demo.model.Login;
import com.example.demo.service.GlamService;
import com.example.demo.service.LoginService;


@RestController
public class Glamcontroller {
    @Autowired LoginService l;
    @Autowired GlamService g;
    @GetMapping("/getlogin")
    public List <Login> getMethodName() {
        return l.get();
    }
    @GetMapping("/getglam")
    public List <Glam> getMethod() {
        return g.get();
    }
    @PostMapping("/addlogin")
    public Login postMethodName(@RequestBody Login l1) {
        return l.post(l1);
    }
    @PostMapping("/addglam")
    public Glam postMethodName(@RequestBody Glam g2) {
        return g.post(g2);
    }
    @PutMapping("/putlogin/{id}")
    public Login putMethodName(@PathVariable int id, @RequestBody Login e1) {
        return l.put(id, e1);
    }
    @PutMapping("/putglam/{id}")
    public Glam putMethodName(@PathVariable int id, @RequestBody Glam e2) {
        return g.put(id, e2);
    }
    @DeleteMapping("/deletelogin/{id}")
    public String deletelogin(@PathVariable int id){
        return l.delete(id);
    }
    @DeleteMapping("/deleteglam/{id}")
    public String deletebook(@PathVariable int id){
        return g.delete(id);
    }
    @GetMapping("/getlogin/{id}")
    public Optional <Login> getById (@PathVariable int id) {
        return l.getById(id);
    }
    @GetMapping("/getglam/{id}")
    public Optional <Glam> getByid (@PathVariable int id) {
        return g.getByid(id);
    }
    @GetMapping("/page/{b}/{a}")
    public List<Glam> getMethodName(@PathVariable int b,@PathVariable int a) {
        return  g.page(b, a);
    }
    @GetMapping("/sort/{a}")
    public List<Glam> getMethodName(@PathVariable String a) {
        return  g.sort(a);
    }
    
}