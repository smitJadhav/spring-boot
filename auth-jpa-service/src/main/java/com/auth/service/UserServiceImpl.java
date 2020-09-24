package com.auth.service;

import com.auth.domain.User;
import com.auth.mapper.UserMapper;
import com.auth.model.UserDetailsDTO;
import com.auth.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by Smit.Jadhav on 9/2/2020
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        Optional<User> user = userRepository.findUserByUserName(s);
        user.orElseThrow(() ->new UsernameNotFoundException("User not Found"));
        UserDetailsDTO userDetailsDTO = userMapper.mapUserToUserDetailsDTO(user.get());
        return userDetailsDTO;
    }
}
