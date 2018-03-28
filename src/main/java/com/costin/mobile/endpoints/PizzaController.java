package com.costin.mobile.endpoints;

import com.costin.mobile.models.Pizza;
import com.costin.mobile.services.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Costi on 27.12.2017.
 */
@RestController
@RequestMapping(path = "/pizza")
public class PizzaController {
    @Autowired
    PizzaService pizzaService;

    @PostMapping
    public @ResponseBody Pizza addPizza(@RequestBody Pizza p){
        return pizzaService.addPizza(p);
    }

    @GetMapping
    public @ResponseBody List<Pizza> getAllPizza(){
        return pizzaService.getAllPizza();
    }

    @GetMapping(path ="/{id}")
    public @ResponseBody Pizza findOne(@PathVariable int id){
        return pizzaService.findOne(id);
    }
}
