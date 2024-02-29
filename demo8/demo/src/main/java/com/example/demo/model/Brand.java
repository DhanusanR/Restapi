package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "brand")
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int cid;
    String CosmeticBrand;
    int CosmeticPrice;
    public int getCid() {
        return cid;
    }
    public void setCid(int cid) {
        this.cid = cid;
    }
    public String getCosmeticBrand() {
        return CosmeticBrand;
    }
    public void setCosmeticBrand(String cosmeticBrand) {
        CosmeticBrand = cosmeticBrand;
    }
    public int getCosmeticPrice() {
        return CosmeticPrice;
    }
    public void setCosmeticPrice(int cosmeticPrice) {
        CosmeticPrice = cosmeticPrice;
    }

}
