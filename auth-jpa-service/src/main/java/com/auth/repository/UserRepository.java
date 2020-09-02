package com.auth.repository;

import com.auth.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Smit.Jadhav on 9/2/2020
 */

public interface UserRepository extends JpaRepository<User, Long> {

    User findUserByUserName(String userName);
}
