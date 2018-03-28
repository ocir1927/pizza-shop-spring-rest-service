package com.costin.mobile.endpoints;

import com.costin.mobile.models.Pizza;
import com.costin.mobile.models.User;
import com.costin.mobile.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Costi on 05.01.2018.
 */

@RestController
@RequestMapping(path = "/users")
public class UserController {

    @Autowired
    UserService userService;


    @PostMapping
    public ResponseEntity login(@RequestBody User user) {
        System.out.println(user);
        if(userService.login(user.getUsername(),user.getPassword()))
            return new ResponseEntity(HttpStatus.OK);
        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }

}
