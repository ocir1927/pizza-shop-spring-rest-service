package com.costin.mobile.models;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Costi on 05.01.2018.
 */

@Entity
public class User {

    @Id
    private String username;
    private String password;

    @OneToOne
    private Comanda comanda;


    public User(String username, String password, Comanda comanda) {
        this.username = username;
        this.password = password;
        this.comanda = comanda;
    }

    public Comanda getComanda() {

        return comanda;
    }

    public void setComanda(Comanda comanda) {
        this.comanda = comanda;
    }

    public User() {
    }

    public User( String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", comanda=" + comanda +
                '}';
    }
}
