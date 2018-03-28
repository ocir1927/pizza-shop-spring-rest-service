package com.costin.mobile.repository;

import com.costin.mobile.models.Comanda;
import com.costin.mobile.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Costi on 13.01.2018.
 */
public interface ComandaRepository extends JpaRepository<Comanda,Integer> {
}
