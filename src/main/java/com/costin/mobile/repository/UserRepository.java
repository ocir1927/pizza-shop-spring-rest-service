package com.costin.mobile.repository;

import com.costin.mobile.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Costi on 05.01.2018.
 */
public interface UserRepository extends JpaRepository<User,String> {
    User findByUsernameAndAndPassword(String username,String password);
}
