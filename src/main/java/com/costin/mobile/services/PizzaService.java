package com.costin.mobile.services;

import com.costin.mobile.models.Pizza;
import com.costin.mobile.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Costi on 27.12.2017.
 */
@Service
public class PizzaService {
    @Autowired
    PizzaRepository pizzaRepository;

    public List<Pizza> getAllPizza(){
        return  pizzaRepository.findAll();
    }

    public Pizza addPizza(Pizza p){
        return pizzaRepository.save(p);
    }

    public Pizza findOne(int id) {
        return pizzaRepository.findOne(id);
    }
}
