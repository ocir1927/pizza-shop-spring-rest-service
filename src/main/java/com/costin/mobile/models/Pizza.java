package com.costin.mobile.models;

import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Costi on 27.12.2017.
 */
@Entity
public class Pizza {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    @ElementCollection(targetClass = String.class)
    private List<String> contains;
    private float price;
    private int quantity;

    private String photoUrl;

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public Pizza() {
    }

    public Pizza(int id, String name, List<String> contains, float price) {
        this.id = id;
        this.name = name;
        this.contains = contains;
        this.price = price;
    }

    public void setContains(List<String> contains) {
        this.contains = contains;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getContains() {
        return contains;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
