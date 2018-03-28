package com.costin.mobile.repository;

import com.costin.mobile.models.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Costi on 27.12.2017.
 */
public interface PizzaRepository extends JpaRepository<Pizza,Integer> {
    Pizza findPizzaById(int id);
}
