package com.costin.mobile.models;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Costi on 13.01.2018.
 */
@Entity
public class Comanda {
    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    private User user;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Pizza> pizzaList;

    public Comanda() {
    }

    public Comanda(List<Pizza> pizzaList) {
        this.pizzaList = pizzaList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Pizza> getPizzaList() {
        return pizzaList;
    }

    public void setPizzaList(List<Pizza> pizzaList) {
        this.pizzaList = pizzaList;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Comanda{" +
                "id=" + id +
                ", user=" + user +
                ", pizzaList=" + pizzaList +
                '}';
    }
}
