package com.example.demo.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="glamatable")
public class Glam{
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String cosmeticians;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "glam")
    private Brand brand;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCosmeticians() {
        return cosmeticians;
    }
    public void setCosmeticians(String cosmeticians) {
        this.cosmeticians = cosmeticians;
    }
    public Brand getBrand() {
        return brand;
    }
    public void setBrand(Brand brand) {
        this.brand = brand;
    }
    
}