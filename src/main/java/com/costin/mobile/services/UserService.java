package com.costin.mobile.services;

import com.costin.mobile.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Costi on 05.01.2018.
 */
@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public boolean login(String username, String password) {
        if (userRepository.findByUsernameAndAndPassword(username, password) != null)
            return true;
        return false;
    }
}
