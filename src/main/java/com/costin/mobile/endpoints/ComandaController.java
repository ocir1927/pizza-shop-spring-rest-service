package com.costin.mobile.endpoints;

import com.costin.mobile.models.Comanda;
import com.costin.mobile.models.User;
import com.costin.mobile.services.ComandaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Costi on 13.01.2018.
 */
@RestController
@RequestMapping(path = "/comanda")
public class ComandaController {
    @Autowired
    private ComandaService comandaService;

    @PostMapping
    public ResponseEntity chekout(@RequestBody Comanda comanda) {
        System.out.println(comanda);
        if (comandaService.addComanda(comanda) != null)
            return new ResponseEntity(HttpStatus.OK);
        return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
