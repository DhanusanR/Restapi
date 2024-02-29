package com.example.demo8.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo8.model.Login;

public interface LoginRepo extends JpaRepository<Login,Integer>{

}