package com.costin.mobile.services;

import com.costin.mobile.models.Comanda;
import com.costin.mobile.models.Pizza;
import com.costin.mobile.repository.ComandaRepository;
import com.costin.mobile.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Costi on 13.01.2018.
 */
@Service
public class ComandaService {
    @Autowired
    ComandaRepository comandaRepository;

    public Comanda addComanda(Comanda comanda) {
        return this.comandaRepository.save(comanda);
    }

}
